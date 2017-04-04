#include <iostream>
using namespace std;

/**
*tr：棋盘左上角行号，tc：棋盘左上角列号
*dr：特殊棋子行号，  dc：特殊棋子列号
*二维数组board表示棋盘，edgeLength = 2^k,棋盘规格2^k * 2^k
*cnt 为全局变量
*zzuwenjie 2017-3-8 18:25:25
**/
 const int maxn = (1<<3) + 1;//修改这里-----------------------------！！！！！！！！！！
int cnt = 0, board[maxn][maxn] ;
void coverBroad(int tr, int tc, int dr, int dc, int edgeLength, int board[][maxn]){
    if (edgeLength <= 1){
        return;
    }
    int tmp = ++cnt;
    edgeLength >>= 1;
    if (dr < tr + edgeLength && dc < tc + edgeLength){
            coverBroad(tr, tc, dr, dc , edgeLength, board);
    }else{
        board[tr + edgeLength - 1][tc +edgeLength -1] = tmp;
        coverBroad(tr, tc, tr +edgeLength -1, tc + edgeLength -1, edgeLength, board);
    }//左上

    if (dr < tr + edgeLength && dc >= tc + edgeLength){
            coverBroad(tr, tc + edgeLength, dr, dc , edgeLength, board);
    }else{
        board[tr + edgeLength -1][tc +edgeLength] = tmp;
        coverBroad(tr, tc + edgeLength, tr + edgeLength -1, tc + edgeLength, edgeLength, board);
    }//右上

    if (dr >= tr + edgeLength && dc < tc + edgeLength){
            coverBroad(tr + edgeLength, tc, dr, dc , edgeLength, board);
    }else{
        board[tr + edgeLength][tc +edgeLength -1] = tmp;
        coverBroad(tr + edgeLength, tc, tr +edgeLength, tc + edgeLength -1, edgeLength, board);
    }//左下

    if (dr >= tr + edgeLength && dc >= tc + edgeLength){
            coverBroad(tr + edgeLength, tc + edgeLength, dr, dc , edgeLength, board);
    }else{
        board[tr + edgeLength][tc +edgeLength] = tmp;
        coverBroad(tr +edgeLength, tc + edgeLength, tr +edgeLength, tc + edgeLength, edgeLength, board);
    }//右下
}

int main(){
    //freopen("stdout.txt", "w", stdout);
    int tr = 2, tc = 3;//可修改，tr tc < maxn
    board[tr][tc] =0;
    coverBroad(1, 1, tr, tc, maxn - 1, board);
    //cout << maxn <<endl;
    for (int i = 1; i < maxn; ++i){
        for (int j = 1; j < maxn; ++j){
            cout << board[i][j]<<"\t";
        }
        cout << endl << endl;
    }
    //cout << cnt <<endl;
    return 0;
}

