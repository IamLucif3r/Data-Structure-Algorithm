import java.util.*;
public class additivePrime{
    static boolean isPrime[] ;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] =new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0;i<n;i++)
        {
          max = Math.max(max,a[i]);
            
        }
        isPrime = new boolean[max+1];
        Arrays.fill(isPrime,false);
        for(int i = 2;i*i<=max;i++)
        {
            for(int j = 2*i;j*i<=max;j++){
                isPrime[j] = true;
            }

        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<n;i++)
        {
            int digit = sum(a[i]);
            if(isPrime[digit] && isPrime[a[i]])
            {
                list.add(a[i]);
            }

        }
        System.out.print(list);

    }
    public static int sum(int n)
    {
        int sum = 0;
        whil(n!=0)
        {
            int d = n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
}