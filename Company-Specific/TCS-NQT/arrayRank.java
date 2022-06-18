import java.util.*;
public class arrayRank {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        for(int i=0;i<n;i++)
        {
            b[i] = a[i];
        }
        Arrays.sort(b);
        Map<Integer,Integer> map = new HashMap<>();
        int temp = 1;
        for(int i=0;i<n;i++)
        {
            if(map.get(b[i])==null) 
            {
                map.put(b[i], temp);
                temp++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(map.get(a[i])+" ");
        }
    }
}
