//�������� (�ݹ飩 
#include<iostream>
const int N=5;
int cnt=0;
using namespace std;

template<class Type>
inline void Swap(Type &a,Type &b){
	//�������������õ��õ�Ӧ�� 
	Type tmp=a;
	a=b;
	b=tmp;
} 

template<class Type>
void Perm(Type list[],int k,int m){
	//����list[k..m]����������
	if(k==m){
		//ֻʣ��һ��Ԫ�أ��ǵݹ鶨��ĳ��ڣ�
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


