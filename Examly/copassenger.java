/*Co-Partners in Train
Tim and Bob are off to a famous Education Fair "Knowledge Forum 2017" at Uzhlanda. 
This time they have to travel without their guardians. Tim got very interested in the arrangement
of seats inside the train coach.

The entire coach could be viewed as an arrangement of consecutive blocks of size 8. 

BerthNumber Compartment
1-8 1
9-16 2
17-24 3
... and so on
Each of these size-8 blocks are further arranged as:
1LB, 2MB, 3UB, 4LB, 5MB, 6UB, 7SL, 8SU, 9LB, 10MB, ...
......
.......
Here LB denotes lower berth, MB middle berth and UB upper berth.
The following berths are called Co-Partners in Train:
3 UB 6 UB
2 MB 5 MB
1 LB 4 LB
7 SL 8 SU
and the pattern is repeated for every set of 8 berths. 
Tim and Bob are playing this game of finding the co-partner in train of each berth. Write a program to do the same.

Input format
The input consists of an integer N, which corresponds to the berth number whose neighbor is to be found out.

Output format
The output is to display the berth of the neighbor of the corresponding seat.

Sample testcases
Input 1
1
Output 1
4LB
Input 2
5
Output 2
2MB
*/
import java.io.*;
import java.util.*;
class copassenger {
	public static void main(String [] args) {
	    int a,count;
	    Scanner sc = new Scanner(System.in);
	    a = sc.nextInt();
	    count=a%8;
	    if(count==0){ a=a-1;}
	    else if(count<4){a=a+3;}
	    else if(count<7){a=a-3;}
	    else if(count==7){a=a+1;}
	    switch(count)
	    {
	        case 0:System.out.println(a+"SL");break;
	        case 1:System.out.println(a+"LB");break;
	        case 2:System.out.println(a+"MB");break;
	        case 3:System.out.println(a+"UB");break;
	        case 4:System.out.println(a+"LB");break;
	        case 5:System.out.println(a+"MB");break;
	        case 6:System.out.println(a+"UB");break;
	        case 7:System.out.println(a+"SU");break;
	    }

	}
}

