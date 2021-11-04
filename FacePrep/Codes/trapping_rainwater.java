import java.util.*;
public class trapping_rainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int mxl[]= new int[n];
            mxl[0]=a[0];
            for(int i=1;i<n;i++)
            {
                mxl[i]=Math.max(mxl[i-1],a[i]);
            }
            int mxr[]= new int[n];
            mxr[n-1]=a[n-1];
            for(int i=n-2;i>=0;i--)
                mxr[i]=Math.max(mxr[i+1], a[i]);
            int water[] = new int[n];
            for(int i=0;i<n;i++)
               water[i]=Math.min(mxl[i],mxr[i])-a[i];
            int sum =0;
            for(int i=0;i<n;i++)
                sum+=water[i];
            System.out.println(sum);            
        }
    }
}
