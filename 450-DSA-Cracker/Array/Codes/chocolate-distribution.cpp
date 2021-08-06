#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        long long findMinDiff(vector<long long> a, long long n, long long m){
    //code
        sort(a.begin(),a.end());
    long long res=INT_MAX;
    if(n==m)
    {
        res = a[n-1]-a[0];
        return res;
    }
        for(int i=0;i<=n-m;)
        {
            if(a[i]==0)
            {
                i++;
                continue;
            }
            else
            {
                long long diff = a[i+m-1] - a[i];
                res = min(res,diff);
                i++;
            }
        }
        return res;

    }
}asy;

int main(void){
    long long n;
    cin>>n;
    vector<long long> a;
    long long x;
    for(long long i=0;i<n;i++)
    {
        cin>>x;
        a.push_back(x);
    }
    long long m;
    cin>>m;
    cout<<asy.findMinDiff(a,n,m)<<endl;

}