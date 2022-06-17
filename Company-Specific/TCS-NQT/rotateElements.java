// Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.
// Input: N = 5, array[] = {1,2,3,4,5} K=2
// Output: {3,4,5,1,2}
import java.util.*;
public class rotateElements {
    public static void rotateArray(int a[], int k)
    {
        int temp[] = new int[k];
        for(int i=0;i<k;i++)
        temp[i] = a[i];

        for(int i=k;i<a.length;i++)
        System.out.println(a[i]);

        for(int i=temp.length)

        
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        rotateArray(a, k);
    }
}
