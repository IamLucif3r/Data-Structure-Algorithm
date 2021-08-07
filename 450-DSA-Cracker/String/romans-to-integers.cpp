#include<bits/stdc++.h>
using namespae std;
class Solution{
    public:
        int value(char ch){
if(ch == 'I')
return 1;
else if(ch == 'V')
return 5;
else if(ch == 'X')
return 10;
else if(ch == 'L')
return 50;
else if(ch == 'C')
return 100;
else if(ch == 'D')
return 500;
else if(ch == 'M')
return 1000;
}

}asy;

int main(void){
    string s;
    cin>>s;
    cout<<asy.romanToDecimal(s)<<endl;

}