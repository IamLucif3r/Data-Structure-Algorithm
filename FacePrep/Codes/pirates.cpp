#include<iostream>
using namespace std;
int main(void)
{
	int gold;
	float bp,blp;
	cin>>gold;
	cin>>bp;
	cin>>blp;
	int bs = gold*(bp/100);
	cout<<bs<<"\n";
	int blps= (gold-bs)*(blp/100);
	cout<<blps<<"\n";
	int left = (gold-bs-blps)/3;
	cout<<left;
}