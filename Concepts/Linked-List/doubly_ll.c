#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node* next;
    struct node* prev;
};

//Adding a Node at Front
void push(struct node** head_ref, int new_data)
{
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node -> data = new_data;
    new_node -> next = (*head_ref);
    new_node ->prev = NULL;
    if(*head_ref!=NULL)
    (*head_ref)->prev = new_node;
    *head_ref = new_node;
}
// Adding a node after given node.
void insertAfter(struct node* pre_node, int new_data)
{
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = new_data;
    new_node->next = pre_node->next;
    pre_node->next = new_node;
    new_node->prev = pre_node;

    if(new_node->next!=NULL)
        new_node->next->prev = new_node;

}
//Adding a node at end
void append(struct node** head_ref,int new_data)
{
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = new_data;
    new_node->next = NULL;
    struct node* p = *head_ref;

    //if the list is empty then make new node as head
    if(*head_ref==NULL)
    {
        new_node->prev = NULL;
        *head_ref = new_node;
        return;   
    }
    while(p->next!=NULL)
    {
        p = p->next;
    }
    p->next = new_node;
    new_node->prev = p;

    return;
}
void printList(struct node* node)
{
    struct node* last;
    printf("\nTraversal in forward direction \n");
    while (node != NULL) {
        printf(" %d ", node->data);
        last = node;
        node = node->next;
    }
 
    printf("\nTraversal in reverse direction \n");
    while (last != NULL) {
        printf(" %d ", last->data);
        last = last->prev;
    }
}
// deletion of node
void deleteNode(struct node** head_ref, struct node* del)
{
    
}
int main(void)
{
    struct node* head = NULL;
   append(&head, 6);
   push(&head, 7);
   push(&head, 1);
   push(&head, 4);
   push(&head, 9);
   insertAfter(head->next, 8);
    printf("Created DLL is: ");
    printList(head);
}