import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class floydCycleDetection {
    public static Node detectCycle(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }

        }
        return null;
    }
    public static Node insert(Node head, int data)
    {
        Node curr = new Node(data);
        if(head == null)
        return curr;
        else{
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;

            }temp.next = curr;
        }
        return head;
    }
    public static Node detectFirst(Node head)
    {
        Node meet = detectCycle(head);
        Node start = head;
        while(start!=meet)
        {
            start= start.next;
            meet = meet.next;
        }
        return meet;
    }
    public static void traverse(Node head)
    {
        Node curr = head;
        while(head !=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        while(n-->0)
        {
            head = insert(head, sc.nextInt());
        }
        System.out.println("Your Linked List");
        traverse(head);

        Node detect = detectCycle(head);
        System.out.println("Cycle :"+detect);

        Node first = detectFirst(head);
        System.out.println("First node for cycle is : "+first);
    }
}
