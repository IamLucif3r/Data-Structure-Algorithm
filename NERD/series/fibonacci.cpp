//Printing Fibonacci Series.
#include<iostream>
using namespace std;
int main(void)
{
    int n,a=-1,b=1,c;
    cin>>n;
    for(int i=1;i<=n;i++)
    {
        c=a+b;
        //Printing every integer of fabonicci series 
        //cout<<c<<" ";
        a=b;
        b=c;
    }
    // To print last Number of fabonicci series.
    cout<<c;
    return 0;
}