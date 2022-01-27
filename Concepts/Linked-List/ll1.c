#include<stdio.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node *next;
};
void append(struct Node** head_ref, int new_data)
{
    // Allocate a Node
    struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
    struct Node *last = *head_ref;
    // put into the data
    new_node ->data = new_data;
    new_node ->next = NULL;
    // If List is empty
    if(*head_ref == NULL)
    {
        *head_ref = new_node;
        return;
    }
    else{
        while(last->next != NULL)
        {
            last -> next = new_node;
            return;
        }
    }
}
// Printing the Contents of Linked List
void printList(struct Node *node)
{
    printf("\n Linked List Traversal: \n");
    while(node!=NULL)
    {
        printf("%d ", node->data);
        node = node->next;
    }   
}
void push(struct Node** head_ref, int new_data)
{
    struct Node* new_node = (struct Node*)malloc(sizeof(struct Node));
    new_node->data = new_data;
    new_node ->next = (*head_ref);
    (*head_ref) = new_node;
}
void deleteNode(struct Node** head_ref, int key)
{
    struct Node *temp = *head_ref, *prev;
    *head_ref = temp->next;
    
}
int main()
{
    struct Node* head = NULL;
    //append(&head, 6);
    //append(&head, 12);
    //append(&head, 15);
    push(&head, 13);
    push(&head, 14);
    push(&head, 15);
    printf("\n LINKED LIST CONTAINS: \n");
    printList(head); 
}