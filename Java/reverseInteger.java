import java.util.*;
public class reverseInteger {
    public static int reverse(int x)
    {
        int result =0;
        while(x!=0)
        {
            // x=123
            int lsb = x%10;//lsb = 3
            int newRes = result*10+lsb;// 0*10+3 = 3
            if((newRes-lsb)/10!=result) 
            {
                return 0;
            }
            result = newRes;//res = 3
            x = x/10; 

        }   return result;
        
    }
    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverse(num));
    }
}
