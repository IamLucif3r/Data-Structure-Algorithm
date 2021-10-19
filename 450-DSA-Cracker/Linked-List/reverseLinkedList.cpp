#include<bits/stdc++.h>
using namespace std;

class node {
    public:
    int data;
    node* next;
};

void insertAtHead(node* &head,int n)
{
    node* newNode = new node();
    newNode->data = n;
    newNode->next = head;
    head = newNode;
}

void printList(node* head)
{
    node* temp = head;
    while(temp!=NULL)
    {
        cout<<temp->data<<" ";
        temp = temp->next;
    }cout<<endl;
}

//reverse linkedlist iteratively
void reverse(node* &head)
{
    node *currptr = head, *prevptr = NULL, *nextptr = NULL;
    while(currptr!=NULL)
    {
        nextptr = currptr->next;
        currptr->next=prevptr;
        prevptr = currptr;
        currptr = nextptr;
    }
    head = prevptr;
}

//reverse linkedlist recursively
node* recRevLink(node* &head)
{
    if(head==NULL||head->next==NULL)
    {
        return head;
    }
    node* newHead = recRevLink(head->next);
    head->next->next=head;
    head->next=NULL;

    return newHead;
}

int main()
{
    node* head = NULL;
    insertAtHead(head,6);
    insertAtHead(head,3);
    insertAtHead(head,5);
    insertAtHead(head,2);
    printList(head);
    // reverse(head);
    node* newHead = recRevLink(head);
    printList(newHead);
}