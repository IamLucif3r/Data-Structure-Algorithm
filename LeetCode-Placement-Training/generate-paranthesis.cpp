/*
Given n pairs of parentheses,
 write a function to generate all combinations
  of well-formed parentheses.

Example:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
*/

#include<iostream>
#include<vector>
#include<string>
using namespace std;
class Solution {
public:
    void solve(int o,int c,string res,vector<string>& ans)
    {
        if(o==0&&c==0)
        {
            ans.push_back(res);
            return;
        }
        if(o!=0)
        {
            string op1=res;
            op1.push_back('(');
            solve(o-1,c,op1,ans);
        }
        if(c>o)
        {
            string op1=res;
            op1.push_back(')');
            solve(o,c-1,op1,ans);
        }
    }
    vector<string> generateParenthesis(int n) {
        vector<string>ans;
        string res;
        int o=n,c=n;
        solve(o,c,res,ans);
        return ans;
    }
   
}a;

int main()
{
    int n;
    cin >>n;
    a.generateParenthesis(n);
    
}