/*
     *
    ***
   *****
  *******
 *********
***********    // 1 row is missing which was common
 *********
  *******
   *****
    ***
     *
*/
#include<iostream>
using namespace std;
int main(void)
{
    int i,j,n,space;  
    cin>>n;
    for(i=1;i<=n-1;i++)//Row
    {
        // For upper Half
        for(space=1; space<=(n-i);space++) //spaces
        {
            cout<<" ";// Bcox ASCII value of A is 65
        }
        for(j=1;j<=2*i-1;j++)
        {
            cout<<"$";
        } // for Stars
        cout<<endl;

    }
        // For Lower Half
         for(i=n;i>=1;i--)//Row
    {
        // For upper Half
        for(space=1; space<=(n-i);space++) //spaces
        {
            cout<<" ";// Bcox ASCII value of A is 65
        }
        for(j=1;j<=2*i-1;j++)
        {
            cout<<"$";
        } // for Stars
        cout<<endl;
        // For Lower Hal

    }
}