/* AES Numbers
Varun is the founder of Event Management Company, "Sparsh Services". In the company all the financial 
transactions are carried out online and Varun has strictly insisted his staff to do any transactions on 
web browsers that supports AES encryption numbers.

A number is an AES number if it has exactly four divisors. In other words, there are exactly four numbers 
that divide into it evenly. For example, 10 is an AES number because it has exactly four divisors 
(1, 2, 5, 10). 12 is not an AES number because it has too many divisors (1, 2, 3, 4, 6, 12). 
11 is not an AES number either. There is only one AES number in the range 10...12.

Given a range of numbers, write a program that counts how many numbers from that range are AES numbers. 

Input format
The input consists of 2 space-separated integers, which corresponds to the lower limit and the upper limit 
of the number range.

You may assume that the numbers in the range are less than 1000.

Output format
Output a single line that gives the count of AES numbers from the given range.

Sample testcases
Input 1         Output 1
1 20             5
 */
import java.io.*;
import java.util.*;
class AES_Numbers {
	public static void main(String [] args) {
		int a,b,i,j=0,count=0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
	    for(i=2;a<=b;i++)
	    {
	        if(a%i==0){
                count++;
            }
	        if(i>=a/2){
                if(count==2)
                {
                    j++;
                    count=0;
                }
                i=1;
                a++;
                count=0;
            }
	    }
	    System.out.println(j);

	}
}