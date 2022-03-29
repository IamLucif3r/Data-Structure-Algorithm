import java.util.*;
class intro_stack{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int n = sc.nextInt();
        while(n-->0)
        {
            int x = sc.nextInt();
            s.push(x);
        }

        System.out.println(s);
        int yt = s.peek();
        System.out.println(yt);
        s.pop();
        System.out.println("After pop 1: "+s);

        boolean ans = s.isEmpty();
        if(ans == true)
        System.out.println("Empmty");
        else
        System.out.println("Not Empmty");
    }
}