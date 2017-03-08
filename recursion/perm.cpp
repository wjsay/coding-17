#include <iostream>
#include <algorithm>
using namespace std;
const int N = 5;

/**
*排列问题，对王晓东的《算法设计与分析》3，做了些改动，加入了一个
*const int start，可以决定所有排列从第几个元素开始输入，个人觉得
*书上的从0开始输出不好（指的是第16行，若我的代码没有被修改）
**/
template <class Type>
void Perm (Type listNum[], const int start, int k, int m) {
    //产生lisk[k:m]的所有排列,start <= k(一般取等)
    if (k==m) {
        //只剩下1个元素
        for (int i = start; i <= m; ++i) {
            cout << listNum[i];
        }
        cout << endl;
    } else {
        for (int i = k; i <= m; ++i) {
            swap(listNum[k], listNum[i]);
            Perm(listNum, start, k+1, m);
            swap(listNum[k], listNum[i]);
        }
    }
}

int main(){
    int listNum[N];
    for (int i=0; i<N; ++i){
        listNum[i] = i;
    }
    Perm(listNum, N-3, N-3, N-1);

    return 0;
}

//排列组合  Permutations and combinations

