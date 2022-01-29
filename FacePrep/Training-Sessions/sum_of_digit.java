// Sum of digits until Single Digit Sum is formed.
// eg. 1+2+3+4 = 10 = 1+0 = 1 Ans.
import java.util.*;
public class sum_of_digit{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0;
        if(x%9==0)
            ans = 9;
        else 
            ans = x%9;

        System.out.println(ans);
    }
}