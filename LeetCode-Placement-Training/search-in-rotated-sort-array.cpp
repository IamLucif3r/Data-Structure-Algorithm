/*
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is rotated at an unknown
 pivot index k (0 <= k < nums.length) such that the resulting array is 
 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
 For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the rotation and an integer target, return the index of 
target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
*/
#include<bits/stdc++.h>
using namespace std;

int search(vector<int>& nums, int target) {
        for(int i=0;i<nums.size();i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

int main()
{
    vector<int> arr={4,5,6,7,0,1,2};
    int target=3;
   cout<<search(arr,target);
    return 0;
}