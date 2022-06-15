import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class reverseLinkedList {
    public static Node insert(Node head, int data)
    {
        Node curr = new Node(data);
        if(head == null)
            return curr;
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }temp.next = curr;
        }
        return head;
        
    }
    public static Node reverse(Node head)
    {
        if(head == null || head.next == null)
        return head;
        Node newHead = reverse(head.next);
        Node nextHead = head.next;
        nextHead.next = head;
        head.next=null;
        return newHead;
    }
    public static Node middle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Boolean isPallindrome(Node head)
    {
        Node mid = middle(head);
        Node last = reverse(mid.next);
        Node curr = head;
        while(last!=null)
        {
            if(curr.data != last.data)
            return false;
            last= last.next;
            curr = curr.next;

        }
        return true;


    }
    public static void traverse(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
 

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Length of linked list
        Node head = null;
        while(n-->0)
        {
            head = insert(head, sc.nextInt());
        }
        if(isPallindrome(head) == true)
            System.out.println("It's a Pallindrome");
        else    
            System.out.println("Not a Pallindrome");
        
    }
}
