import java.util.*;
public class secondSmallest {
  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        // Arrays.sort(a);
        Arrays.sort(a);
        System.out.println("Sorted Array");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Second Smallest Element: "+a[1]);
    }
}
