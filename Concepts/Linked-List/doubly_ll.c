#include<stdio.h>
#include<stdlib.h>
// Only a Data Type is declared, mem alloc still remaining
struct node{
    int data;
    struct node *next;
    struct node *prev;
};
struct node *head;
// Adding A Node at the Beginning
void push(struct node** head_ref, int new_data)
{
    //1. Allocate a new node
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    //2. Put in data
    new_node->data = new_data;
    //3. Make Next of new_node as head
    //   And previous as NULL
    new_node -> next = (*head_ref);
    new_node -> prev = NULL;
    //4. Change previous of head node to new node
    if((*head_ref)!= NULL)
        (*head_ref)->prev = new_node;
    //5. Move head to point the new node
    (*head_ref) = new_node;
}

// Insert a node after a given node
void insertAfter(struct node* prev_node, int new_data)
{
    //1. Check if the prev_node = NULL
    if(prev_node == NULL){
        printf("The given previous node cannot be NULL");
        return;
    }
    //2. Allocate a new node
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    //3. Put in Data
    new_node->data = new_data;
    //4. Make next of new_node as next of prev_node
    new_node -> next = prev_node->next;
    //5. Make next of prev_node as new_node;
    prev_node->next = new_node;
    //6. Make prev_node as previous of new_node
    new_node -> prev = prev_node;
    //7. Change previous of new_node's next node
    if(new_node->next!=NULL)
        new_node->next->prev=new_node;
}
// Adding a note in the end of Linked LIst
void append(struct node** head_ref, int new_data)
{
    //1. Allocate a new node
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    //2. Put in the data
    new_node->data = new_data;
    //3. Make next of New Node as NULL
    new_node->next = NULL;
    //4. if(linked list -> empty): new_node = head
    if(*head_ref == NULL)
    {
        new_node -> prev = NULL;
        *head_ref = new_node;
        return;
    }
    //5. Else traverse till Last Node using a new pointer p
    struct node* last = *head_ref;
    while(last->next!=NULL){
        last = last->next;
    }
    //6. Change next of Last Node
    last -> next = new_node;
    //7. Make last node as previous of New node
    new_node->prev = last;
    return;
}
// Printing a LIst
void printList(struct node* node)
{
    struct node* last;
    printf("\n Traversal in the Forward Direction \n");
    while(node!=NULL){
        printf("%d ", node->data);
        last = node;
        node = node->next;
    }
    printf("\n Traversal in Reverse DIrection \n");
    while(last!=NULL){
        printf("%d ", last->data);
        last = last-> prev;
    }
}

int main(void)
{
    // Start with an Empty List
    struct node* head = NULL;
    //Insert 6. LL becomes: 6->NULL
    append(&head, 6);
    //Insert 7 in beginning: 7->6->NULL
    push(&head, 7);
    push(&head, 1);
    append(&head, 4);
    //Insert 4 in end : 1->7->6->4->NULL
    insertAfter(head->next, 8);

    printf("Created List is");
    printList(head);
    

}