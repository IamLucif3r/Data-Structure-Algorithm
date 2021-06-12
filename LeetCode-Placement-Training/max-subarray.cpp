/*
Given an integer array nums, find the contiguous subarray (containing at least one number)
 which has the largest sum and return its sum.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/
#include<bits/stdc++.h>
using namespace std;

int maxSubArray(vector<int>& nums){
    int n=nums.size();
    int sum = nums[0];
    int maxsum = nums[0];
    for(int i=1;i<n;i++)
    {
        if(sum>=0)
            sum+=nums[i];
        else
            sum = nums[i];
        if(sum>maxsum){
            maxsum = sum;
        }
    }   
    return maxsum;
}

int main()
{
    vector<int> nums ={-2,1,-3,4,-1,2,1,-5,4};
    cout<<maxSubArray(nums);
    return 0;
}