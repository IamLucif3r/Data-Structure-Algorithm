import java.util.*;
public class ll1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            ll.add(k);
        }

        //Collections.reverse(ll);
        System.out.println("Initial Linked List "+ll);
        ll.addFirst(10);
        System.out.println("Adding in Start "+ll);
        ll.clear();
        System.out.println(ll);


    }
}
