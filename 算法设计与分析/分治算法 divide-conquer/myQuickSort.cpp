#include <iostream>
#include <cstdio>
#include <ctime>
#include <cstdlib>
using namespace std;
const int maxn = 1e5+7;
int arrayNum[maxn];
void myQuickSort(int arrayNum[], int low, int high);

int main() {
	int n;
	while (~scanf("%d", &n)){
		for (int i = 0; i < n; ++i){
			scanf("%d", arrayNum+i);
		}
		myQuickSort(arrayNum,0,n-1);
		printf("%d", arrayNum[0]);
		for (int i = 1; i < n; ++i){
			printf(" %d", arrayNum[i]);
		}
		puts("");
	}
	return 0;
}

void myQuickSort(int arrayNum[], int low, int high){
    if (low >= high)
        return;
	int i = low, j = high;
	srand((unsigned)time(NULL));
	int randomNumber = rand() % (high -low) + low;
	swap(arrayNum[low],arrayNum[randomNumber]);
	//上三句用于产生随机数，需要ctime cstdlib两个头文件
	int key = arrayNum[low];
	while (i<j){
		while (i<j && arrayNum[j] >= key)
		  --j;
		arrayNum[i] = arrayNum[j];

		while(i<j && arrayNum[i] <= key)
		  ++i;
		arrayNum[j] = arrayNum[i];
	}
	arrayNum[i] = key;
	myQuickSort(arrayNum, low, i-1);
	myQuickSort(arrayNum, i+1, high);
}
//在南邮1064测试过的快排，注意输入数据为整数
//加了随机算法，速度也没
