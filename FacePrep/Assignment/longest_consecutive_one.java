
import java.util.*;
public class longest_consecutive_one {
    public static int con(int x)
    {
        int one = 0;
        while (x!=0)
        {
            x = (x & (x << 1));
            one++;
        }
 
        return one;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++)
        {
            int x = sc.nextInt();
            System.out.println(con(x));
        }

    }
}
