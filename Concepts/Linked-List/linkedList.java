import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class linkedList {
    public static Node reverse(Node head)
    {
        Node curr = head;
        Node prev = null;
        while(curr!=null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }
    public static void delete(Node head, int pos){
        if(pos==0)
        {
            head=head.next;
            return;
        }
        Node prev = head;
        for(int i=0;i<pos-1;i++)
        {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }
    public static void insert(int data, Node head, int pos)
    {
        Node toAdd = new Node(data);
        if(pos == 0)
        {
            toAdd.next = head;
            head = toAdd;

        }
        // If Position>0 (Insertion in Middle or End)
        Node prev = head;
        for(int i=0;i<pos-1;i++)
        {
            // Move the Temporary Prev pointer untill we get
            // to the final position for inserting elements
            prev = prev.next;
        }
        toAdd.next = prev.next;
        prev.next = toAdd;
    }
    public static void traverse(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static void main(String args[])
    {
        // Creating Linked List
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        // linking the Nodes
        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        // Traversing Linked list using a Head reference
        traverse(head);
        // Inserting element at specific position.
        insert(15, head, 2);
        System.out.println("After Adding");
        traverse(head);
        // System.out.println("After Deleting");
        // delete(head, 2);
        // delete(head, 0);
        // delete(head, 1);
        // traverse(head);
        System.out.println("REVERSING Linked list");
        System.out.println(reverse(head));
        
    }
}
