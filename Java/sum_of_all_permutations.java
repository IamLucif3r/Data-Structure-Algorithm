/* Sum of all permutations
Given the size N of array A, followed by the line of array elements.
 Find the sum of all possible permutation values without duplicates.
Constraints:
1 < N < 9
0 < A[i] < 10
Example 1:
Input:
2
1 2
Output:
33
Explanation:
The possible permutations are 12 and 21. Their sum will be 33.
Example 2:
Input:
3
1 2 3
Output:
1332
*/
import java.util.*;
public class sum_of_all_permutations {

    static long fact(int n)
    {
        long f=1;
        for(int i=n;i>1;i--)
        {
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;//2
    int i,a,sum=0;
    for(i=0;i<n;i++)
    {
        a = sc.nextInt();//1,2
        sum = sum+a; // 1+2=3
    }
    int j=1;
    while(--n!=0)//2;1
    j=j*10+1;//
    System.out.println(sum*fact(temp-1)*j);
    }


}
