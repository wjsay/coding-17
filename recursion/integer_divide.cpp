#include<iostream>
using namespace std;
int q(int,int);
int main(){
	int n=7;
	cout<<q(n,n);
	return 0;
}

int q(int n,int m){
	if(n<1||m<1) return 0;
	if(n==1||m==1) return 1;
	if(n<m) return q(n,n);
	if(n==m) return q(n,m-1)+1;
	return q(n,m-1)+q(n-m,m);
} 
