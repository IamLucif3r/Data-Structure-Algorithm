// Given a string of characters, find the length of the longest proper 
// prefix which is also a proper suffix.
#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
    int lps(string s){
        int arr[s.length()];
        int len = 0; int i =1 ; arr[0] = 0;
        while(i<s.length())
        {
            if(s[i]==s[len])
            {
                len ++;
                arr[i]=len;
                i++;
            }
            else
            {
                if(len!=0)
                {
                    len = arr[len-1];
                }
                else{
                    arr[i]=0;
                    i++;
                }
            }
        }return arr[s.length()-1];
    }

}asy;

int main(void)
{
    
    string str;
    cin>>str;
    cout<<asy.lps(str)<<"\n";
}