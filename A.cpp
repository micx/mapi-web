#include <cstdio>
#include <iostream>
using namespace std;
int main(){
	int i,j,k=20;
	for(i=1;i<k;++i){
		for(j=1;j<k;++j){
			printf("%d ",i^j);
		}
		printf("\n");
	}
	return 0;
}

