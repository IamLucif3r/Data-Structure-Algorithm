/*   Pattern
    *       //2-1
   ***      //3-1
  *****     //4-1
 *******    //5-1
*********   //6-1
*/
#include<iostream>
using namespace std;
int main(void)
{
    int i,j,n,space;  
    cin>>n;
    for(i=1;i<=n;i++)//Row
    {
        for(space=1; space<=(n-i);space++) //spaces
        {
            cout<<" ";// Bcox ASCII value of A is 65
        }
        for(j=1;j<=2*i-1;j++)
        {
            cout<<"*";
        } // for Stars
        cout<<endl;
    }
}