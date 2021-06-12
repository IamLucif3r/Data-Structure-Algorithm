/*
Approach: Follow the steps to solve the problem :
Initialize an unordered set to store the characters of the string while traversing the array.
Traverse the array and for each string, perform the following operations:
Iterate over the characters of the string.
If the current character is already present in the Set, skip it. Otherwise, append it to the output string.
Push the newly generated string into the list initialized to store the output.
Print the list of strings obtained as the answer.
*/

#include <bits/stdc++.h>
using namespace std;

int removeDuplicates(vector<int>& nums)
{
    unordered_set<int> iset;
    int size = nums.size();
    vector<int> output;
    int out_curr;
    for(auto it:nums){
        
        if(iset.find(it)!=iset.end())
            continue;
        out_curr+=it;
        //Insert Characters into set
        iset.insert(it);
    }
    if(out_curr.size)
    {
        output.push_back(out_curr);
    }
    for(int i=0;i<output.size();i++){
        cout<<output[i]<<"";
    }return 0;
}

int main()
{
    vector<int> arr ={1,2,3,1};
    removeDuplicates(arr);
    return 0;
}