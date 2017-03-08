#include <iostream>
using namespace std;

int divideInteger(int n){
    int q[122][122]={0};//q[n][m]在正整数n的虽有划分中，最大加数不大于m的划分个数
    for (int i=1; i<=n; ++i){
        for (int j=1; j <= n; ++j){
            if (i == 1 || j== 1){
                q[i][j] = 1;
            } else{
                if (i < j){
                    q[i][j] = q[i][i];
                } else{
                    if (i == j){
                        q[i][j] = 1 + q[i][i - 1];
                    } else{//i > j
                        q[i][j] = q[i][j-1] + q[i - j][j];
                    }
                }

            }
        }
    }
    return q[n][n];
}//n = 121时，q[n][n] = 18亿+，n为122时，结果就溢出了（int型）

int main(){
    int n=122;
    while (cin >> n){
        cout <<divideInteger(n) << endl;
    }

    return 0;
}
//zzuwenjie 2017-3-8 15:50:17


