import java.util.*;
public class medianArray {
    public static Double median(int a[], int n)
    {
        double ans;
        if(n%2==0)
        {
            int ind1 = (n / 2) - 1;
		int ind2 = (n / 2);
        ans = (double)(a[ind1] + a[ind2]) / 2;
        }
        else{
            ans  = a[n/2];
            return ans;
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[]  = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(median(a,n));
    }
}
