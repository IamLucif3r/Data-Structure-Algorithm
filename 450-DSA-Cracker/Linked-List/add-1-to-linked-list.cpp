// { Driver Code Starts
//Initial template for C++

#include <bits/stdc++.h> 
using namespace std; 

struct Node
{
    int data;
    struct Node* next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
};

void printList(Node* node) 
{ 
    while (node != NULL) { 
        cout << node->data; 
        node = node->next; 
    }  
    cout<<"\n";
} 


 // } Driver Code Ends
//User function template for C++

/* 

struct Node
{
    int data;
    struct Node* next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
};

*/

class Solution
{
    public:
    Node *reverse(Node *head)
{
    Node *prev = NULL;
    Node *curr = head;
    
    while(curr != NULL)
    {
        Node *next = curr->next;
        
        curr->next = prev;
        prev = curr;
        
        curr = next;
    }
    
    return prev;
}

Node* addOne(Node *head) 
{
    head = reverse(head);
    
    Node *curr = head, *prev = head;
    
    int sum = (curr->data + 1);
    curr->data = sum % 10;
    int carry = sum / 10;

    curr = curr->next;
    
    while(curr != NULL)
    {
        sum = (curr->data + carry);
        curr->data = sum % 10;
        carry = sum / 10;
        
        prev = curr;
        
        curr = curr->next;
    }
    
    if(carry)
    {
        prev->next = new Node(carry);
    }
    
    head = reverse(head);
    
    return head;
}
};

// { Driver Code Starts.

int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        
        Node* head = new Node( s[0]-'0' );
        Node* tail = head;
        for(int i=1; i<s.size(); i++)
        {
            tail->next = new Node( s[i]-'0' );
            tail = tail->next;
        }
        Solution ob;
        head = ob.addOne(head);
        printList(head); 
    }
    return 0; 
} 
  // } Driver Code Ends