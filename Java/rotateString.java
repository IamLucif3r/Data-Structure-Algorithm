import java.util.*;
public class rotateString {
    public static String rotateLeft(String s, int n )
    {
        String ans = s.substring(n) + s.substring(0, n);
        return ans;


    }
    public static String rotateRight(String s, int n)
    {
        return rotateLeft(s, (s.length() - n));
        
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        if(c == 'L')
            System.out.println(rotateLeft(s,n));
        else if(c == 'R')
            System.out.println(rotateRight(s,n));
        else
            System.out.println("Invalid Input");
    }
}
