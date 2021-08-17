#include<bits/stdc++.h>
using namespace std;
class Solution
{
    public:
    vector<long long int> productExceptSelf(vector<long long int>& nums, int n)
    {
        vector<long long="" int=""> lm(n);
       vector<long long="" int=""> rm(n);
       
       long long int m = 1;
       for(int i = 0 ; i < n ; i++){
           lm[i] = m;
           m *= nums[i];
       }
       
       m = 1;
       for(int i = n-1 ; i >= 0 ; i--){
           rm[i] = m;
           ans[i] = lm[i] * rm[i];
           m *= nums[i];
       }
       
       return ans;
    }
}asy;
int main()
{
    int n;
    cin>>n;
    vector<long long int> arr(n),vec(n);
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    vec = asy.productExceptSelf(arr,n);
    for(int i=0;i<n;i++)
    {
        cout<<vec[i]<<"  ";
    }
    cout<<endl;
}