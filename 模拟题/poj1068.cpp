
#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cstdio>
#include <cmath>
#include <cstdlib>
#include <cstring>
#include <stack>
#include <queue>
#include <vector>
#include <string>
#include <map>
#include <set>
#include <algorithm>
using namespace std;
const int maxn = 20 + 7;

int main() {
	int T;
	scanf("%d", &T);
	while (T--) {
		int n;
		int p[maxn], w[maxn];
		scanf("%d", &n);
		for (int i = 0; i < n; ++i)
			scanf("%d", p + i);
		string str;
		int k = 0;
		for (int cur = 0; cur < n; ++cur) {
			for (; k < p[cur]; ++k)
				str += "(";
			str += ")";
		}
		stack<char> S;
		int cur = -1;
		for (int i = 0; i < (n << 1); ++i) {
			int j = i;
			if (str[j] == ')') {
				S.push(str[j--]);
				w[++cur] = 0;
				while (!S.empty()) {
					if (str[j--] == '(') {
						w[cur]++;
						S.pop();
					}
					else S.push(str[j]);
				}
			}
		}
		printf("%d", w[0]);
		for (int i = 1; i < n; ++i)
			printf(" %d", w[i]);
		puts("");
	}
	return 0;
}