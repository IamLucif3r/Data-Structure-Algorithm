#include<bits/stdc++.h>
using namespace std;

class Solution{
    public:
        int checkPal(string s)
        {
           // We will calculate the size of string
           int n = s.length()-1;
           for(int i =0;i<(n+1)/2;i++){
               if(s[i]!=s[n-i])
               {return 0;}
               else return 1;
           }
        }

}asy;

int main(void)
{
    string s;
    cin>>s;
    cout<<asy.checkPal(s)<<"\n";

}