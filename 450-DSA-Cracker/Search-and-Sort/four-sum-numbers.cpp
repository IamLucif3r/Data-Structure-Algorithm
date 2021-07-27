/* 
Given an array of integers and another number. 
Find all the unique quadruple from the given array 
that sums up to the given number.
Input:
N = 5, K = 3
A[] = {0,0,2,1,1}
Output: 0 0 1 2 $
Explanation: Sum of 0, 0, 1, 2 is equal
to K.
*/
#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        vector<vector<int>> fourSum(vector<int> &arr, int k){
            vector<vector<int>> v;
            sort(arr.begin(),arr.end());
            for(int i = 0;i<arr.size()-3;i++)
            {
                for(int j=i+1;j<arr.size()-2;j++)
                {
                    int l = j+1;
                    int r = arr.size()-1;
                    while(l<r)
                    {
                        vector<int> v1;
                        if(arr[i]+arr[j]+arr[l]+arr[r]==k)
                        {
                            v1.push_back(arr[i]);
                            v1.push_back(arr[j]);
                            v1.push_back(arr[l]);
                            v1.push_back(arr[r]);
                            v.push_back(v1);
                            l++; r--;
                        }
                        else if(arr[i]+arr[j]+arr[l]+arr[r]<k)
                        l++;
                        else
                        r--;
                    }
                }
            }
            sort(v.begin(),v.end());
            v.erase(unique(v.begin(),v.end()),v.end());
            return v;

        }
}asy;

int main(void)
{
    int n,k,i;
    cin>>n>>k;
    vector <int> a(n);
    for(i=0;i<n;i++){
        cin>>a[i];
    }
    vector<vector<int>> ans = asy.fourSum(a,k);
    for(auto &v : ans){
        for(int &u:v)
            {cout<<u<<" ";}
    }
    cout<< "$";
    if(ans.empty()){
        cout<<-1;
    }cout<<endl;
}