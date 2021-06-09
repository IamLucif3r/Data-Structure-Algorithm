class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int>v;
        int temp1,temp2;
        int flag;
        int len = nums.size();
        for(int i=0;i<len-1;i++)
        {
            flag=0;
            temp1 = nums[i];
            for(int j=i+1;j<len;j++)
            {
                temp2 = nums[j];
                if(temp1+temp2==target)
                {
                    flag=1;
                    v.push_back(i);
                    v.push_back(j);
                    break;
                }
            }
            
            if(flag==1)
            {
                break;
            }
        }
        return v;
    }
};