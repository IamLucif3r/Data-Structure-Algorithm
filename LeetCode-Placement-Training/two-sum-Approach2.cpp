#include<iostream>
#include<vector>
#include<unordered_map>
using namespace std;

    vector<int> twoSum(vector<int>& nums, int target) 
    {
        
        unordered_map<int,int> mp;
        vector<int> ans;
        for(int i=0;i<nums.size();i++)
        {
            if(mp.find(target-nums[i])!=mp.end())
            {
                ans.push_back(mp[target-nums[i]]);
                ans.push_back(i);
                return ans;
            }
            
            mp[nums[i]]=i;
        }
        return ans;
    }



int main()
{
    int nums[]={1,2,3,4};
    int target = 5;

    return 0;
}