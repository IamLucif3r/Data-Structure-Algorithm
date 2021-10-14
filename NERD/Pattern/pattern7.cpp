/*   Pattern
a
a b 
a b c 
a b c d
a b c d e

*/
#include<iostream>
using namespace std;
int main(void)
{
    int i,j,n;  
    cin>>n;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
            printf("%c ",j+96);// Bcox ASCII value of A is 65
        }
        cout<<endl;
    }
}