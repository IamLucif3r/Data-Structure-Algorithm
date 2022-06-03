
/**A linked list is said to contain a cycle if any node is visited more than once while traversing the list. Given a pointer to the head of a linked list, determine if it contains a cycle. If it does, return 1. Otherwise, return 0.
Que: https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
 * 
 */
import java.util.*;
import java.util.LinkedList;
public class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
}

public class cycle_detection {
    int HasCycle(Node head) {
        if (head == null){
            return 0;
        }
    
        Node slow = head;
        Node fast = head;
    
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
    
            if (slow == fast){
                return 1;
            }
        }
    
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(); // no. of nodes 
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        for(int i=0;i<n;i++)
        {
            ll.add(sc.nextInt());
        }
        System.out.println(Cycle(ll)));
    }
}
