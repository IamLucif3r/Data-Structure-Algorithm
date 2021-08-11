#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        int find_median(vector<int> v)
        {
            // The Idea here, is to  sort the array and finding the middle element, which
            //  will be our median
            sort(v.begin(),v.end());
            int avg;
            int n = v.size();
            if(n%2==0)
            {
                avg = v[(n/2)-1]+v[(n/2)];
                avg = avg/2;
                return avg;
            }
            else
            {
            avg = v[((n+1)/2)-1];
            return avg;
            
            }
        }
}asy;
int main(void)
{
    int n;
    cin >>n;
    vector<int> v(n);
    for(int i=0;i<n;i++)
    {
        cin>>v[i];  
    }
    int ans=asy.find_median(v);
    cout << ans;
}