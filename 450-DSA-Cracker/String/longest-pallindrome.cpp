#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
    string check(string s,string r,string l)
    {
        if(s==r)
        {
            if(l.length()<s.length())
            {
                l=s;
            }
        }return l;
    }
        string longsetPalin(string s){
            string str="",rstr="",lps="";
            int p=0,q=0;
            for(int i=0;i<s.length();i++){
                str=str+s[i];
                rstr=s[i]+rstr;
                if(str==rstr){
                        lps= check(str,rstr,lps);
                }
                else
                {
                    if(p!=0&&s[p-1]==s[i])
                    {
                        str=s[p-1]+str;
                        rstr=rstr+s[p-1];
                        lps=check(str,rstr,lps);
                        p--;
                    }
                    else{
                        i=++q;
                        str.clear();
                        rstr.clear();
                        str=str+s[i];
                        rstr=s[i]+rstr;
                        p=i;
                    }
                }
            }
            lps=check(str,rstr,lps);
            return lps;
        }

}asy;
int main(void)
{
    string s; cin>>s;
    cout<<asy.longsetPalin(s)<<endl;
    
}