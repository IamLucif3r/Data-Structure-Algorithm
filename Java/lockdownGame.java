import java.util.*;
public class lockdownGame {
    public static int game(int n, int k)
    {
        if(n==1)
        return 0;
        return((game(n-1, k)+k)%n);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k=0;
        for(int i=0;i<s.length();i++)
         {
            if(s.charAt(i) == 'y') 
            k=i;
        }   
        System.out.println(game(n, k)-1);

    }
}
