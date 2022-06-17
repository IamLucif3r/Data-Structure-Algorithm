import java.util.*;
public class averageOfElemInArray {
    public static int Average(int a[], int n)
    {
        int sum =0;
        for(int i=0;i<n;i++)
        sum+=a[i];
        return sum/n;

    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        a[i] =sc.nextInt();
        System.out.println(Average(a,n));
    }
}
