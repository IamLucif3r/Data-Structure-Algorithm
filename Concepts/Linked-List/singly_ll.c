#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct node{
    int data;
    struct node *next;
};
// Push func - To add node in front.
void push(struct node** head_ref, int new_data)
{
    //1. Make a new node
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = new_data;
    new_node->next = (*head_ref);
    (*head_ref) = new_node;
}
// insertAfter - To add node aft3r a particular element
void insertAfter(struct node* prev_node,int new_data)
{
    if(prev_node == NULL){
        printf("Previous Node cannot be NULL");
        return;
    }
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = new_data;
    new_node->next = prev_node->next;
    prev_node->next = new_node;
}
//Append:Adding Node at the end
void append(struct node** head_ref, int new_data)
{
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    struct node *p = *head_ref;
    new_node->data = new_data;
    new_node->next = NULL;
    if(*head_ref==NULL)
    {
        *head_ref = new_node;
        return;
    }
    while(p->next!=NULL)
    {
        p = p->next;
    }
    p->next = new_node;
    return;

}
// Printing LIst 
void traverseList(struct node *head)
{
    struct node *temp;
    // Return if list is empty 
    if(head == NULL)
    {
        printf("List is empty.");
        return;
    }
    temp = head;
    while(temp != NULL)
    {
        printf("%d -> ", temp->data); // Print data of current node
        temp = temp->next;                 // Move to next node
    }
    printf("\n");
}
void deleteNode(struct node** head_ref, int key)
{
    struct node *temp = *head_ref;
    struct node *prev;
    // If Head node itself holds key to be deleted
    if(temp !=NULL && temp->data == key)
    {
        *head_ref = temp->next;
        free(temp); //free old head
        return;
    }
    //search for the key to be deleted, 
    //Also keep track of previous node as we need to change
    // prev->next
    while(temp!=NULL && temp->data == key){
        prev = temp;
        temp = temp->next;
    }
    // IF the target not present in the LL
    if(temp == NULL)
    return;
    
    //Else, Unlink the Node by changing pointer
    prev->next = temp->next;
    free(temp);
}
bool search(struct node* head, int x)
{
    if(head == NULL)
    return false;
    if(head ->data == x)
    return true;

    return search(head->next, x);

}
int main(void)
{
    struct node* head = NULL;
    append(&head,6);
    push(&head, 7);
    push(&head, 1);
    append(&head,4);
    insertAfter(head->next, 8);
    traverseList(head);
    //deleteNode(&head, 88);
    search(head,2)?printf("Yes"):printf("No");
}