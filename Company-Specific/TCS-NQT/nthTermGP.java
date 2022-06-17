import java.util.*;
public class nthTermGP {
    public static int three(int a, int n)
    {

    int terms = n/2;
    int ans = (int)(a*(Math.pow(3, terms-1)));
    return ans;
    }
    public static int two(int a, int n)
    {
        int terms = (n+1)/2;
        int ans = (int)(a* Math.pow(2, terms-1));
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%2==1)
        {
            System.out.println(three(1,3));
        }
        else{
            System.out.println(two(1,2));
        }
        
    }
}
