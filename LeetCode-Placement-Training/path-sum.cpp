#include<iostream>
using namespace std;
struct TreeNode {
      int val;
      TreeNode *left;
      TreeNode *right;
      TreeNode() : val(0), left(nullptr), right(nullptr) {}
      TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
      TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
  };
class Solution {
public:
    bool hasPathSum(TreeNode* root, int sum) {
        if(root == NULL)
            return false;
        else if (root->val == sum && root->left == NULL && root->right==NULL)
            return true;
        return (hasPathSum(root->left, sum-root->val)||hasPathSum(root->right,sum-root->val));
    }
};
int main()
{
    int arr[]={5,4,8,11,NULL,13,4,7,2,NULL,NULL,NULL,1};
    int targetSum = 22;
    hasPathSum(arr,targetSum);
    return 0;
}