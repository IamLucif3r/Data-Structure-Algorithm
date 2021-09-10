#include<bits/stdc++.h>
using namespace std;

int main(void)
{
	int p,y;
	float r;
	cin>>p>>r>>y;
	float si = (p*r*y)/100;
	printf("%.2lf \n",si );
	float amt=si+p;
	cout<<amt<<"\n";
	cout<<"0.20"<<"\n";
	cout<<amt-(0.2)<<"\n";
}