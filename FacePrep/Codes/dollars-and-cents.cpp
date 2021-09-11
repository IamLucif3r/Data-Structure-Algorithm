#include <bits/stdc++.h>
using namespace std;
int main(void)
{
	int a,b,c,d;
	cin>>a>>b>>c>>d;
	int dollar = a+c;
	int cents = b+d;
	if(cents>100)
	{
		cents = cents - 100;
		dollar++;
	}	
	cout<<dollar<<"\n"<<cents;
}