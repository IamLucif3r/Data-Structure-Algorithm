/*Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
 For example, 121 is palindrome while 123 is not.
 Example 1:
Input: x = 121
Output: true

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-.

*/
import java.util.*;
public class pallindrome {
    public static boolean isPallindrome(int x)
    {
        int result = 0;
        // for single digits & negative numbers
        if(x<0||(x%10==0 && x!=0))
        {
            return false;
        }
        // Until the 121>0 // 2nd round- 12>0
        while(x>result)
        {
            result = result*10+x%10;// result = 121*10+121/10
            x/=10;                  // 121 = 121/10 = 12
        }return x == result||x==result/10; // 12 ==result 
    }
    public static void main(String[] args){
        int x = 121;
        System.out.println(isPallindrome(x));
    }

}
