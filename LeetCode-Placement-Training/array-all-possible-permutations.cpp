#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        vector<vector <int>> permute(vector<int>& nums){
            sort(nums.begin(), nums.end());
            vector<vector<int> > v;
            vector<int> v2;
            do{
                for(int i=0;i<nums.size();i++)
                {
                    v2.push_back(nums[i]);
                }
                v.push_back(v2);
                v2.clear();
            }while(next_permutation(nums.begin(),nums.end()));
            return v;
        }
}ob;

//Driver Program
int main()
{
    vector<int> arr={1,2,3};
    int size = sizeof(arr)/sizeof(int);
    ob.permute(arr);
       
    return 0;
}