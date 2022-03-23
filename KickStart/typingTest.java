import java.util.*;
public class typingTest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       for(int u=0;u<t;u++)
        {
            int j=0;int flag = 0;
           java.lang.String I = sc.next();
           java.lang.String P = sc.next();
           java.lang.String n = I;
           java.lang.String m = P;
            for(int i = 0;i<I.length()&& j<P.length();i++)
            {
                char c = n.charAt(i);
                char z = m.charAt(j);
                if(c==z)
                {
                    flag++;
                }
                if(c!=z)
                {
                    j++;
                    i--;
                    continue;
                }
                j++;
            }
            if(flag == I.length())
            System.out.println("Case #"+(u+1)+":"+(P.length()-I.length()));
            else
            System.out.println("CASE #"+(u+1)+":"+"IMPOSSIBLE");
        }
    }
}
