import java.util.*;
public class euclideian {
    public static int gcd(int a,int b)
    {
        //base condition
        if(a==0)
        return b;

        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of "+a+" & "+b+" is : "+gcd(a,b));

    }
    
}
