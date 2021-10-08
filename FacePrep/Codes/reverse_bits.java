/* 
Given a non-negative integer N. 
Reverse the bits of N and print the number obtained after reversing the bits.

Note: The actual binary representation of the number is being considered,
for reversing the bits. No leading 0’s, are being considered.
Constraint:
1 ≤ N ≤ 109
Example 1:
Input: 
11
Output:
13
Explanation:
(11)10 = (1011)2.
After reversing the bits we get:
(1101)2 = (13)10.
Example 2:
Input: 
10
Output:
5
Explanation:
(10)10 = (1010)2.
After reversing the bits we get:
(0101)2 = (101)2 = (5)10.
*/
import java.util.*;
public class reverse_bits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s= Integer.toBinaryString(n);
        String k="";
        for (int i = s.length()-1; i >=0; i--) {
            k=k.concat(String.valueOf(s.charAt(i)));
        }
        int i=Integer.parseInt(k,2);
        System.out.println(i);
    
}}
