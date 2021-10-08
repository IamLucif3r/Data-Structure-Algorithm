/*Bit Difference
We define f(X, Y) as a number of different corresponding bits in the binary representation of X and Y.
 For example, f(2, 7) = 2, since binary representations of 2 and 7 are 010 and 111, respectively.
  The first and the third bit differ, so f(2, 7) = 2.

You are given an array A of N integers, A1, A2,…, AN.
 Find the sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. 
 Return the answer modulo 109+7.
Constraints:
1 ≤ N ≤ 104
-2,147,483,648 ≤ A[i] ≤ 2,147,483,647
Example 1:
2
2
4
Output:
4
Explaintion:
We return f(2, 2) + f(2, 4) + f(4, 2) + f(4, 4) = 0 + 2 + 2 + 0 = 4.
Example 2:
Input:
3
1
3
5
Output:
8
Explanation:
We return f(1, 1) + f(1, 3) + f(1, 5) + f(3, 1) + f(3, 3) + f(3, 5) + f(5, 1) + f(5, 3) + f(5, 5) = 0 + 1 + 1 + 1 + 0 + 2 + 1 + 2 + 0 = 8.
*/
import java.util.*;
public class bits_difference {
    public static void main(String[] args) {
        
    }
}
