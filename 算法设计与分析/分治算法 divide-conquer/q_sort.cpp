//#include<iostream>
//#include<cstdio>
//#include <ctime>
//#include <cstdlib>
//using namespace std;
//
//const int maxn=100000;
//int a[maxn+7];
//
//void q_sort(int a[],int l,int r){
//    if(l>=r) return;
//    srand((unsigned)time(NULL));
//	int randomNumber = rand() % (r -l) + l;
//	swap(a[l],a[randomNumber]);
//    int i=l,j=r,key=a[l];
//    while(i<j){
//        while(i<j&&a[j]>=key) j--;
//        a[i]=a[j];
//        while(i<j&&a[i]<=key) i++;
//        a[j]=a[i];
//    }
//    a[i]=key;
//    q_sort(a,l,i-1);
//    q_sort(a,i+1,r);
//}
//
//int main(){
//    int n;
//    scanf("%d",&n);
//    for(int i=0;i<n;i++) scanf("%d",a+i);
//    q_sort(a,0,n-1);
//    printf("%d",a[0]);
//    for(int i=1;i<n;i++) printf(" %d",a[i]);
//    printf("\n");
//
//    return 0;
//}
