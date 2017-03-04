#include <iostream>
using namespace std;
const int N = 1e5+3;
int main (){
	freopen("input.txt","r",stdin);
	int n;
	cin>>n;
	double x[N], y[N],sumX=0.0,sumY=0.0,aveX,aveY,son=0.0,prt=0.0,a,b;
	for (int i=0;i<n;++i) {
		cin>>x[i];
		sumX+=x[i];
	}
	aveX=sumX/(double)n; 
	for (int i=0;i<n;++i) {
		cin>>y[i];
		sumY+=y[i];
	} 
	aveY = sumY / (double)n;
	for (int i=0;i<n;++i) {
		son += (x[i]-aveX)*(y[i]-aveY);
		prt += (x[i]-aveX)*(x[i]-aveX); 
	}
	b = son/prt;
	a = aveY - b*aveX;
	cout<<"y = "<<b<<" x + "<<a<<endl;
	while(1); 
	return 0;
} 
