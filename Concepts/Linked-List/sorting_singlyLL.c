#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
};

struct node* head = NULL;
struct node* sorted = NULL;

void push(int val)
{
    struct node* new_node = (struct node*)malloc(sizeof(struct node));
    new_node->data = val;
    new_node->next = head;
    head = new_node;
}
void printList(struct node* head)
{
    while(head!=NULL){
        printf("%d -> ",head->data);
        head=head->next;
    }
    printf("NULL");
}
void sortedInsert(struct node* new_node)
{
    // For Starting / head end
    if(sorted == NULL || sorted -> data >= new_node->data){
        new_node->next = sorted;
        sorted = new_node;
    }else{
        struct node* current = sorted;
        // locate the node before point of insertions
        while(current->next!=NULL && current->next ->data < new_node->data){
            current = current->next;
        }
        new_node->next = current->next;
        current->next = new_node;
    }
}
void insertionSort()
{
    struct node* current = head;
    //Traverse the given linked list & insert every node to sorted.
    while(current!=NULL){
       // Storing next for next iteration
        struct node* next = current->next;
        sortedInsert(current);
        current = next;
    }
    //In last update head pointer to point to sorted linked list
    head = sorted;

}
int main(void)
{
    push(7);
    push(9);
    push(4);
    push(5);
    push(1);
    printf("\nLinked List B4 Sorting: \n");
    printList(head);
    printf("\n");
    printf("\nLinked List After Sorting: \n");
    insertionSort();
    printList(head);
    printf("\n");

}