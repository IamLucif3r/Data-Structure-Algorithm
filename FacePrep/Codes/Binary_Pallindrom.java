/* Binary Pallindrome
iven an integer N, write program to return yes if the binary 
representation of N is pallindrome, else No
INPUT 9
Output yes
*/
import java.util.*;
public class Binary_Pallindrom {
    public static boolean isPalindrome(int n)
    {
        int rev = 0; 
        int k = n;
        while (k > 0) 
        {
            // Decimal to Binary :use '&' example: a & 1
            rev = (rev << 1) | (k & 1);
            k = k >> 1;     // drop last bit
        }
 
        // Returns true if `reverse(n)` is the same as `n`
        return n == rev;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        //Divide num by 2 store remainders in array, reverse  to check
        System.out.println(isPalindrome(x));  
        in.close();

    }
}
