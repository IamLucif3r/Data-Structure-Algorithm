/*   Pattern
* * * * *
*       *
*       *
*       *
* * * * *
*/
#include<iostream>
using namespace std;
int main(void)
{
    int i,j,n;
    cin>>n;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(i==1||i==n||j==1||j==n) // First & Last - Rows & Columns
            {
                cout<<"* ";
            }
            else
                cout<<"  ";
        }cout<<endl;
    }
}