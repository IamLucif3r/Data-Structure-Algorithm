#include<iostream>
using namespace std;
int main(void)
{
    int r,c,t;
    cin>>r>>c>>t;
    int total = r*c;
    if(t>(r+1) && t<(2*r))
    {cout<<"It is orange tree";}
    else if(t<total-r && t>(2*r) )
    cout<<"It is an Orange tree";
    else
    cout<<"It is not an Orange Tree";
}