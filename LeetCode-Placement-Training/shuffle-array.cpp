#include<bits/stdc++.h>
using namespace std;

vector<int> shuffle(vector<int>& nums, int n)
{
    vector<int> arr;
    for(int i=0;i<n;i++)
    {
        arr.push_back(nums[i]);
        arr.push_back(nums[n+i]);
    }
    return arr;
}

int main()
{
    vector<int> arr={1,1,2,2};
    int target = 2;
    shuffle(arr,target);
    return 0;
}