import java.util.*;
public class best_programmer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        NumberType n = new NumberType();
       int j= n.findType(x);
        if(j==1)
            System.out.println("Deficient");
        else if(j==0)
            System.out.println("No");
    }
}
class NumberType{
    public static int findType(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                sum+=i;
        }
        if(sum==n)
         return 1;
        else 
            return 0;
    }
}
