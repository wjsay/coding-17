#include <iostream>
#include <cstdio>
#include <cstring>
#include <algorithm>
using namespace std;
const int maxn = 100+4;
int Map[maxn][maxn];
int d[maxn][maxn];
int r, c, ans;
int dr[4][2] = {{-1,0}, {0, -1}, {1, 0}, {0, 1}};

int dfs(int x, int y){
    if(d[x][y] != 0){
        return d[x][y];
    }
    d[x][y] = 1;
    for (int i = 0; i < 4; ++i){
        int mx = x + dr[i][0], my = y + dr[i][1];
        if (mx >= 0 && my >= 0 && mx < r && my < c && Map[mx][my] < Map[x][y]){
            d[x][y] = max(d[x][y], dfs(mx, my) + 1);
        }
    }
    ans = max(ans, d[x][y]);
    return d[x][y];
}

int main(){
    while(~scanf("%d%d", &r, &c)){
        for (int i = 0; i < r; ++i){
            for (int j = 0; j < c; ++j){
                scanf("%d", &Map[i][j]);
            }
        }
        memset(d, 0, sizeof d );
        ans = 1;
        for (int i = 0; i < r; ++i){
            for (int j = 0; j < c; ++j){
                dfs(i , j);
            }
        }
        printf("%d\n", ans);
        //cout << ans << endl;
    }

    return 0;
}

