#include <iostream>

using namespace std;
int memo[100];
int maxprofit(int arr[],int tlen)
{
    if(tlen==0) return 0;
    int best=0;
    if(memo[tlen]!=-1){
        return memo[tlen];
    }
    for(int len=1;len<=tlen;len++)
    {
        int netprofit=arr[len] + maxprofit(arr,tlen-len);
        best=max(best,netprofit);
    }
    memo[tlen]=best;
    return memo[tlen];
}
int maxprofit_bu(int arr[],int tlen)
{
    int dp[100]={};
    
    for(int len=1;len<=tlen;++len)
    { int best=0;
        for(int cut=1;cut<=len;++cut)
        {
            best=max(best,arr[cut] + dp[len-cut]);
        } dp[len]=best;
    }
    return dp[tlen];
}
int main()
{int tlen;
cin>>tlen;
for(int i=1;i<=tlen;++i)
{
    memo[i]=-1;
}
    int priceofeachlen[100];
    for(int eachprice=1;eachprice<=tlen;++eachprice)
    {
        cin>>priceofeachlen[eachprice];
    }
    
int ans=maxprofit_bu(priceofeachlen,tlen);
    cout<<ans;

    return 0;
}
