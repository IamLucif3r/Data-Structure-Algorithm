import java.util.*;
class Queue{
    int capacity, rear,a[];
    public Queue(int n)
    {
        capacity = n;
        a = new int[capacity];
        rear = -1;
    }

    public void enque(int data)
    {
        if(rear == capacity-1)
        {
            System.out.print("Queue Not Empty");
        }
        rear++;
        a[rear] = data;
    }
    public int deque(){
        if(rear == -1)
            System.out.println("Empty Queue");
        int result = a[0];
        for(int i=0;i<rear;i++)
        {
            a[i] = a[i+1];
        }
        rear--;
        return result;
    }
    public int getFront()
    {
        if(rear == -1)
            System.out.println("Queue is Empty");
        return a[0];
    }



}
public class queue_using_array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // int cap = sc.nextInt();
        Queue q = new Queue(3);
        q.enque(12);
        q.enque(13);
        q.enque(14);
        System.out.println("Front Element : "+q.getFront());
        System.out.println(q.deque());
        System.out.println("Front Element : "+q.getFront());
        // q.getFront();
        System.out.println(q.deque());
        System.out.println("Front Element : "+q.getFront());
        // q.getFront();
        System.out.println(q.deque());
        q.getFront();
       
    }
}
