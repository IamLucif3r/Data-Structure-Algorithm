#include<iostream>
using namespace std;

int height(Node* root)
{
    int left_height, right_height;
    //Step 3: Base Condition
    // Smallest Valid Input - NULL
    if(root ==nullptr)
        return 0;
    //Step 1: Hypothesis:
    height(root);
    // We will call Height function for Right and Left both
    left_height = height(root->left);
    right_height = height(root->right);
    //Step -2: After we get height from both the tree (i.e. Left & right)
    // We will take the Maximum of both of them - which will be answer
    return 1+max(left_height,right_height);
    
}
//Driver Function
int main()
{
 
}