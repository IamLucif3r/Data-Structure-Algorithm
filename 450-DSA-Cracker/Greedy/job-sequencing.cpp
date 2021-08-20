#include<bits/stdc++.h>
using namespace std;
struct Job
{
    int id;
    int dead;
    int profit;
};
class Solution
{
    public:
    bool comparison(Job a, Job b)
    {
        return(a.profit>b.profit)
    }
        pair<int,int> JobScheduling(Job arr[],int n)
        {
            sort(arr,arr+n,comparison);
            vector<int> result(n,INT_MIN);
            bool slot[n];
            for(int i=0;i<n;i++)
                slot[i]=false;
            int ans=0;
            for(int i=0;i<n;i++)
            {
                for (int j=min(n,arr[i].dead)-1;j>=0;j--)
                {
                    if(slot[j]==false)
                    {
                        result[j]=i;
                        ans+=arr[i].profit;
                        slot[j]=true;
                        break;
                    }
                }
            }
            int size=0;
            for(auto i:result)
            {
                if(i!=INT_MIN)
                    size++;
            }return make_pair(size,ans);
        }
}asy;
int main(void){
    int n;
    cin>>n;
    Job arr[n];
    for(int i=0;i<n;i++)
    {
        int x,y,z;
        cin>>x>>y>>z;
        arr[i].id = x;
        arr[i].dead = y;
        arr[i].profit =z;
    }
    pair<int,int> ans = asy.JobScheduling(arr,n);
    cout<<ans[0]<<" "<<ans[1]<<endl;

}