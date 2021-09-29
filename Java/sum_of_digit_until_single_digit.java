/*The sum of digits until single digit is obtained
Write a program to find the sum of the digits of a number 
until the sum is reduced to a single digit.
Format:
Input:
The first line of input contains the number of test cases T.
 For each test case, the first line of input contains an integer.
Output:
The output contains a single line integer value for T test cases.
Constraints:
1 ≤ N ≤ 105
1 ≤ T ≤ 10
Example:
Input:
3
12345
749
5298

Output:
6
2
6
Explanation:
Testcase 1: 12345 -> 1+2+3+4+5 = 15 -> 1+5 = 6.
Testcase 2: 749 -> 7+4+9 = 20 -> 2+0 = 2.
Testcase 3: 5298 -> 5+2+9+8 = 24 -> 2+4 = 6.
Case 1
Case 2
Input (stdin)
3
12345
749
5298
Output (stdout)
6
2
6
>>SOlution:
if Num%9==0 : sum = 9;
else if(num%9!=0) : sum = remainder of num%9;
*/

import java.util.*;
public class sum_of_digit_until_single_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//Testcases
        while(t-->0)
        {
            int n= sc.nextInt();
            n = n%9;
            if(n == 0)
                System.out.println(9);
            else 
                System.out.println(n);
        }
        
        
    }
}
