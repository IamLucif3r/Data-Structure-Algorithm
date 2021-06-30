#include<bits/stdc++.h>
using namespace std;

class Solution{
    public:
    int findD(vector<int>& a){
        for(int i=0;i<a.size();i++)
        {
            int pos = abs(a[i]);
            if(a[pos-1]<0) return pos;
            else a[pos-1] = - abs(a[pos-1]);

        }
        return -1;
    }
}asy;
int main()
{
    vector<int> arr={1,2,4,2,2};
    int size = arr.size();
    cout<<asy.findD(arr);
    return 0;
}