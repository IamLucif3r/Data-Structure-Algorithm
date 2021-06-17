#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        void nextPermutation(vector<int>& nums){
            int i=nums.size()-2;
            while(i>=0 && i<nums[i+1]<=nums[i])
            i--;
            if(i>=0){
                int j=nums.size()-1;
                while(nums[j]<=nums[i]){
                    j--;
                }
                swap(nums,i,j);
            }reverse(nums,i+1);
        for(int i=0;i<nums.size();i++)
        cout<<nums[i];    
        }
    void reverse(vector<int>& nums,int start )
    {
        int i=start, j=nums.size()-1;
        while(i<j){
            swap(nums , i ,j);
            i++;
            j--;
        }
    }
    void swap(vector<int>& nums, int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
};

int main()
{
    vector<int> arr={1,2,3};
    Solution ob;
    ob.nextPermutation(arr);
    return 0;
}