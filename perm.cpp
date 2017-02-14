//排列问题 (递归） 
#include<iostream>
const int N=5;
int cnt=0;
using namespace std;

template<class Type>
inline void Swap(Type &a,Type &b){
	//内联函数和引用调用的应用 
	Type tmp=a;
	a=b;
	b=tmp;
} 

template<class Type>
void Perm(Type list[],int k,int m){
	//产生list[k..m]的所有序列
	if(k==m){
		//只剩下一个元素（非递归定义的出口）
		for(int i=0;i<=m;++i) 
			cout<<list[i];
		cout<<endl;
		++cnt;
	} 
	else{
		for(int i=k;i<=m;++i){
			Swap(list[k],list[i]);
			Perm(list,k+1,m);
			Swap(list[k],list[i]); 
		}
	}
	
}

int main(){
	int n=N, *list=new int[n]; 
	for(int i=0;i<n;++i){
		list[i]=i;
	}
	Perm(list,0,n-1);
	cout<<endl<<cnt<<endl;
	return 0;
} 


