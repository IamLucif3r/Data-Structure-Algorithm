#include<bits/stdc++.h>
using namespace std;
#define ll long long

class Solution{
    public:
     
ll findSubarray(vector<ll> arr, int n ) {
unordered_map<ll, ll> m;
ll sum = 0, ans = 0;
for (int i = 0; i < n; i++) {
sum += arr[i];
if (sum == 0) ans++;
ans += m[sum];
m[sum]++;
}
return ans;

}

}asy;
int main()
{
    int n;
    cin >>n;
    vector<ll> arr(n,0);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    cout<<asy.findSubarray(arr,n)<<"\n";
}