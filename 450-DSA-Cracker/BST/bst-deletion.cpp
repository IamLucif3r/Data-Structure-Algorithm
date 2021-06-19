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
class Solution{
    public:
        TreeNode* deleteNode(TreeNode* root, int key){
            //first we will find the node with the given key
            TreeNode* searchNode = search(root,key);
            //If Node is not found:
            if(searchNode == NULL)
                return root;
            // If the Node is Leaf Node, just delete the Node:
            else if(searchNode->left==NULL && searchNode->right==NULL)
                return delLeafNode(root,searchNode);
            //In Case of Single Child Node, rest of the successor is added to the parent node.
            else if (searchNode->left == NULL || searchNode->right == NULL)
                return deleteSingleChildNode(root,searchNode);
            // In case of Double Child, we will find the rightmost node of the left child.
            else{
                TreeNode* maxLeft=maxInLeftSubTree(searchNode->left);
                int x=maxLeft->val;
                //if the left child has no right node, then it becomes the case of single child
                if(maxLeft->right==NULL)
                    deleteSingleChildNode(root,maxLeft);
                else
                    delLeafNode(root,maxLeft);
                searchNode->val=x;
                return root;
            }
            return root;
        }
        TreeNode* search(TreeNode* root, int key)
        {
            if(root==NULL|| root->val==key)
                return root;
            else if(key>root->val)
                return search(root->right,key);
            else return search(root->left,key);
        }
        TreeNode* delLeafNode(TreeNode* root, TreeNode* searchNode)
        {
            if(root==NULL||root==searchNode)
                return NULL;
            else if(searchNode->val > root->val)
                root->right=delLeafNode(root->right,searchNode);
            else
                root->left=delLeafNode(root->left,searchNode);
            return root;
        }
        TreeNode* deleteSingleChildNode(TreeNode* root, TreeNode* searchNode)
        {
            if(root==NULL)
                return NULL;
            else if(searchNode->val==root->val)
            {
                if(root->left)
                    return root->left;
                return root->right;
            }
            else if(searchNode->val>root->val){
                root->right=deleteSingleChildNode(root->right,searchNode);
            }
            else
            root->left=deleteSingleChildNode(root->left,searchNode);
            return root;
        }
        TreeNode* maxInLeftSubTree(TreeNode* root)
        {
            if(root->right){
                return maxInLeftSubTree(root->right);
          
            }
         return root;
        }

};

 int main(void)
{
    Solution del;
    int root[] = {5,3,6,2,4,NULL,7};
    int key = 3;
    del.deleteNode(root,key);

}