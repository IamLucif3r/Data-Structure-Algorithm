import java.util.*;
public class nexxt_greatest {
    public static void nsg(int a[], int n)
    {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n-1;i++)
        {
            while(a[i+1]<a[i])
            {
                if(i==n-1)
                s.push(-1);
                if(a[i+1]>a[i])
                s.push(a[i+1]);
                else
                s.push(-1);
                i++;
            }
        }
        for(int i:s)
        System.out.println(i);

    }
    public static void main(String args[])
    {
        int a[] = {3,10,4,2,1,2,6,1,7,2,9};
        int n = a.length;
        nsg(a, n);
    }
}
