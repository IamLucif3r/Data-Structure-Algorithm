/*
Given a sorted array of distinct integers and a target value,
 return the index if the target is found. If not, return the index
  where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example:
Input: nums = [1,3,5,6], target = 5
Output: 2
*/
#include<bits/stdc++.h>
using namespace std;
int searchInsert(vector<int>& nums, int target) {
        int l=0,r=nums.size()-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>target)
                r=mid-1;
            else if(nums[mid]==target)
                return mid;
            else{
                if(mid==nums.size()-1 || nums[mid+1]>target)
                    return mid+1;
                else
                    l=mid+1;
            }
        }
        return 0;
    }
int main()
{
    vector<int> arr={1,2,5,6,7};
    int target = 4;
    cout<<searchInsert(arr,target);
    return 0; 
}