/*
****
****
****
****
*/
#include<iostream>
using namespace std;
int main(){
    int i,j,n;
    cin>>n;
    for(i=1;i<=n;i++) //rows; It is advisable to run loop with 1 in pattern questions
    {
        for(j=1;j<=n;j++) // columns - here only * are to be printed
        {
            cout<<"* ";
        }
        cout<< endl;
    }
}