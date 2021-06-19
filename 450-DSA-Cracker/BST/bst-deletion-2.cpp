#include<bits/stdc++.h>
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
    TreeNode* findMin(TreeNode* root){
        if(!root->left) return root;
        return findMin(root->left);
    }
    
    TreeNode* deleteNode(TreeNode* root, int key) {
        if(root==NULL) return NULL;
        if(root->val < key){
            root->right = deleteNode(root->right, key);
        }
        else if(root->val > key){
            root->left = deleteNode(root->left, key);
        }
        else{
            //3 cases
            // No children
            if(!root->left&&!root->right){
                delete root;
                root = NULL;
            }
            // 1 child (right)
            else if(root->left==NULL){
                TreeNode* temp = root;
                root = root->right;
                delete(temp);
            }
            // 1 child (left)
            else if(root->right==NULL){
                TreeNode* temp = root;
                root=root->left;
                delete temp;
            }
            //2 children
            else{
                TreeNode *temp = findMin(root->right); // find minimal value of right sub tree
                root->val = temp->val; // duplicate the node
                root->right = deleteNode(root->right, temp->val); // delete the duplicate node
            }
            
        }
        return root;
    }
}; 

  int main(void)
  {
    Solution del;
    int *root[] = {5,3,6,2,4,NULL,7};
    int key = 3;
    del.deleteNode(&root,key);   
  }