#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
    bool subArrayExists(int arr[],int N)
    {
        unordered_set<int> us;
        int sum = 0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
            if(us.find(sum)!=us.end()||arr[i]==0||sum==0)
                return true;
            us.insert(sum);
        }
        return false;
    }
};

int main(void)
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    Solution abc;
    if(abc.subArrayExists(arr,n))
        cout<<"YES";
    else
        cout<<"NO";    
}
