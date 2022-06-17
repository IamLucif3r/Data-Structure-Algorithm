import java.util.*;
public class reverseArray {
  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Reversed Array");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
       
    }
}

