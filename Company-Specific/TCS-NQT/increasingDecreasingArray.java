// Problem: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
import java.util.*;
public class increasingDecreasingArray {
    public static void increase(int a[], int start,int end)
    {
        int temp[] = new int[end];
        for(int i=start;i<end;i++)
        {   
            temp[i] = a[i];
        }
        Arrays.sort(temp);
        for(int i=start;i<end;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
    public static void decrease(int a[], int start,int end)
    {
        int temp[] = new int[end];
        for(int i=start;i<end;i++)
        {   
            temp[i] = a[i];
        }
        Arrays.sort(temp);
        for(int i=end-1;i>=start;i--)
        {
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        int mid = n/2;
        // System.out.println(increase(a, 0, mid););
        increase(a,0,mid);
        decrease(a,mid,n);
    }
}
