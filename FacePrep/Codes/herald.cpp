#include<iostream>
using namespace std;
int main(void)
{
	int a,b,c;
	//a - no of copies sold
	//b - b is the cost per copy and
	// c is the cost The Herald spends per copy.
	cin>>a>>b>>c;
	int profit;
	profit=(a*b)-(a*c)-100;
	cout<<profit;
}