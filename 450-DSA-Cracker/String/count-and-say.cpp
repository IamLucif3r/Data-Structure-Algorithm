#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        string countAndSay(int n){
            // We will check for 1 and 2 individually,
            if(n==1)
                return "1";
            if(n==2)
                return "11";
            // Now for any entry greater than 2, we will :
            string s="11";
            for(int i =3;i<n;i++){
                string t = "";
                int c =1 ;
                s = s + '&'; // This is a Delimiter
                int len = s.length();
                for(int j=1;j<len;j++)
                {
                    if(s[j]!=s[j-1])
                    {
                        // If they're not equall,
                        // convert count to string n and add to t, n ewset count to 1
                        t=t+to_string(c);
                        t=t+s[j-1];
                        c=1;
                    }
                    else
                    //  Count to see the number of characters aresmae
                        c++;

                }
                s=t;

            }return s;
        }

}asy;

int main(void)
{
    int n;
    cin >>n;
    cout<<asy.countAndSay(n);

}