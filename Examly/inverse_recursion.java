import java.util.*;
public class inverse_recursion {
    static int rev = 0;
	public static int reverse(int n) {
	    if(n!=0)
	    {
	        rev= (rev*10)+(n%10);
	        reverse(n/10);
	    }
	    return rev;
	}
    public static void main(String[] args) {
        int n;
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		n = reverse(n);
		System.out.println(n);
    }
}
