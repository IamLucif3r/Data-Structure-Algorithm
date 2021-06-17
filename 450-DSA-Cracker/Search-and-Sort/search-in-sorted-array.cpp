#include<bits/stdc++.h>
using namespace std;

int search(vector<int>& nums, int k)
{
    for(int i=0;i<nums.size();i++)
    {
        if(nums[i]==k)
        return i;
    }
    return -1;
}

int main()
{
    vector<int> arr={4,5,6,7,0,1,2};
    int k=0;
    cout<<search(arr,k);
    return 0;
}