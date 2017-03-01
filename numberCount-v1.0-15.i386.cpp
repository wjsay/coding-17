#include<iostream>
#include<cmath>
#include<cstring>
using namespace std;
void pageNumber(int n, int cnt[]);
int main() {
	int x;
	while (cin >> x) {
		int ans[10] = { 0 };
		pageNumber(x, ans);
		for (int i = 0; i <= 9; ++i)
			cout << ans[i] << endl;
	}
}

//千万别随便修改pageNumber函数。我竟然写好了，自己都害怕 
void pageNumber(int n, int cnt[]) {
	memset(cnt,0,10*sizeof(int));
	int tmp = n, len = 1;//len表示整数n的位数 
	while (tmp /= 10)len++;
	tmp=len;
	while (len>0) {
		int high = n / (int)pow(10.0, len - 1), left = n % (int)pow(10.0, len - 1);
        for(int i=0;i<=9;++i) cnt[i]+=(len-1)*(int)pow(10.0,len-2)*high;
        for (int i = 0; i<high; ++i) cnt[i] += (int)pow(10.0, len - 1);
        cnt[high] += left + 1;
		n = left;
		len--;
	}
    //多加了 （len-1）个1组成的数 个零
    for(int i=0;i<tmp;++i)cnt[0]-=(int)pow(10.0,i);
}
