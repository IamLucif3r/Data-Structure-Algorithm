import java.util.*;
public class simple_seive {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n= in.nextInt();
        int arr[] = new int[n+1];
        
        for(int i=2;i<n+1;i++)
        {
            for(int j=2;(i*j)<=n;j++)
            arr[j*i]=1;
        }
        for(int i=2;i<=n;i++)
        {
            if(arr[i]==0)
            System.out.println(i);
        }
    }
}
