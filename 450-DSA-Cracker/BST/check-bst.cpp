#include<bits/stdc++.h>
using namespace std;
#define MAX_HEIGHT 100000
vector<int> vec;
struct Node{
    int data;
    Node *left;
    Node *right;
    Node(int val){
        data = val;
        left = right = NULL;
    }
};
void inorder(Node* x)
{
    if(x==NULL)
    return;
    // Recursive Part - L D R pattern 
    inorder(x->left);
    vec.push_back(x->data);
    inorder(x->right);
}



class Solution{
    public:
    bool isBST(Node* root)
    {
        vec.clear();
        inorder(root);
        for(int i=1;i<vec.size();i++){
            if(vec[i]>vec[i-1])
                return false;
            

        }
     return true;   
    }
};

//Function to Build Tree
Node* buildTree(string str)
{
    //Corner Case
    if(str.length() == 0 || str[0] =='N')
    return NULL;
    
    vector<string> ip;
    istringstream iss(str);
    for(string str;iss>>str;)
        ip.push_back(str);
    //Create the root of the tree
    Node* root = new Node(stoi(ip[0]));
    //Push the Root to the queue
    queue<Node*> queue;
    queue.push(root);
    //Starting from Second Element
    int i=1;
    while(!queue.empty()&& i<ip.size()){
        Node* currNode = queue.front();
        queue.pop();
        //Fet the Current Node's value from the string
        string currVal = ip[i];
        //if the Left child is not nULL
        if(currVal!="N"){
            //create the child for the current node
            currNode->left = new Node(stoi(currVal));
            //push it to the queue
            queue.push(currNode->left);
        }
        //For the Right child
        i++;
        if(i>=ip.size())
        break;
        currVal = ip[i];
        //if the right child is not NULL
        if(currVal!="N"){
            //create the Right Child for the current node
            currNode->right = new Node(stoi(currVal));
            //pus it to the queue
            queue.push(currNode->right);
        }
        i++;
    }
    return root;

}


int main()
{
    int t;
    string tc;
    getline(cin,tc);
    t=stoi(tc);
    while(t--)
    {
        string s;
        getline(cin, s);
        Node* root = buildTree(s);
        Solution ob;
        if(ob.isBST(root)){
            cout<<"1\n";  }
        else
            cout<<"0\n";
      
        return 0;
    }
}