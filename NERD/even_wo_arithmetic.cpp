// Check input nnumber as even or odd without any arithmetic operator
/*Approach: Use Bitwise Operator:
1. Binary + 1
2. check last bit - lsb = 0 --> Even
lsb = 1  --->odd
*/
#include<iostream>
using namespace std;
int main(void)
{
    int n;
    cin>>n;
    if(n & 1)
    {
        cout<<"ODD";
    }
    else 
    {
        cout<<"Even";
    }
}