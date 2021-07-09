#include<bits/stdc++.h>
using namespace std;

class Solution{
    public:
        int checkPal(string s)
        {
           // We will take a string
           string S;
           S=s;
           reverse(S.begin(),S.end());
           if(S==s)
           return 1;
           else
           return 0;
          
        }

}asy;

int main(void)
{
    string s;
    cin>>s;
    cout<<asy.checkPal(s)<<"\n";

}