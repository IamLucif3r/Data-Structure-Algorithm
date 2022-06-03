import java.util.*;
public class priority_queue {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        pq.add(7);
        pq.add(3);
        pq.add(5);
        pq.add(6);
        pq.add(9);
        System.out.println("Size of PQ:"+ pq.size());
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
