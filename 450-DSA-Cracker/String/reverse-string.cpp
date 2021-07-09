#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        void rev(vector<char>& s)
        {
            int l = 0;
            int r = s.size()-1;
            while(l<r){
                char tmp = s[l];
                s[l++] = s[r];
                s[r--] = tmp;
            }
        }
}asy;

int main()
{
    vector<char> str={'h','e','l','l','o'};
    asy.rev(str);
    for(int i=0;i<str.size();i++)
    cout<<str[i];
    return 0;
}