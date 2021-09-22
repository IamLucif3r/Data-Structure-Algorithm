
/*
Printing the prime numbers till N
Given a number N, the task is to print all the prime numbers less than or equal to N.
Expected TC: O(nsqrt(n))
Constraint:
1 < N < 106
Example 1:
Input:
10
Output:
2 3 5 7
Example 2:
Input:
5
Output:
2 3 5
*/
import java.io.*;
import java.util.Scanner;
public class print_prime_till_n{

public static void main(String[] args) throws IOException {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int count;
for(int i = 2; i <= N; i++)  //O(n)
{
    count=0;
    for(int j = 1; j <= (int)Math.sqrt(i); j++) //O(Sqrt(n))
    { 
        if(i%j==0)
        count++;
    }
    if(count == 1) {
    System.out.println(i);
    }
}
}

}
