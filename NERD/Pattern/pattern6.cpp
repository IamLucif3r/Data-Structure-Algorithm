/*   Pattern
A
B B
C C C
D D D D
E E E E E 
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
            printf("%c ",i+64);// Bcox ASCII value of A is 65
        }
        cout<<endl;
    }
}