/*  APPROACH:
Assume a pair-Vector and store 3 quantities: Start,End,Index of meeting
sort the array according to ending time
we will calculate which meeting has start time and ending time of other meetings;
*/
#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        int maxMeetings(int start[], int end[], int n)
        {
            vector<vector<int>> v;
            for(int i=0;i<n;i++) 
            {
                 v.push_back({start[i],end[i]});
            } 
            sort(v.begin(),v.end(),[&](vector<int> &a,vector<int> &b)
            {
            return a[1]<b[1]; });
             int take=1;
             int endtime= v[0][1];
             for(int i= 0;i<n;i++)
              {
                 if(v[i][0]>endtime)
                {
                take++;
                endtime=v[i][1];
                }
            }
            return take;
        }
}asy;

int main(void){
    int n;
    cin >> n;
    int start[n],end[n];
    for(int i=0;i<n;i++)
    cin>>start[i];
    for(int j=0;j<n;j++)
    cin>>end[j];
    int ans = asy.maxMeetings(start,end,n);
    cout<<ans;
}