import java.util.*;
public class searchElementInJava {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(search == a[i])
            System.out.println("Element found at index :"+i);
        }
    }
}
