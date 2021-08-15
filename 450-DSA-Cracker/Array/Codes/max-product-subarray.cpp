#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        long long maxPro(int *arr, int n)
        {  
            long long product = 1, ans = INT_MIN;
            for(int i=0;i<n;i++)
            {
                if(arr[i] != 0)
                product *= arr[i];
                else
                product = 1;
                ans = max(ans, product);
            }
            product = 1;
            long long ans1 = INT_MIN;
            
            for(int i = n-1; i >= 0; --i) {
                if(arr[i] != 0)
                product *= arr[i];
                else
                product = 1;
                ans1 = max(ans1, product);
                }
                return max(ans, ans1);
        }
}asy;
int main(void)
{
    int n,i;
    cin>>n;
    int arr[n];
    for(i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    auto ans = asy.maxPro(arr,n);
    cout<<ans;
}