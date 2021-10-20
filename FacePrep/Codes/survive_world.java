/*Survive World

There are n people standing in a circle waiting to be executed. The counting out begins at some point in the circle 
and proceeds around the circle in a fixed direction. In each step, a certain number of people are skipped and the next 
person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed 
people are removed), until only the last person remains, who is given freedom. Given the total number of persons n and 
a number k which indicates that k-1 persons are skipped and kth person is killed in circle. The task is to choose the 
place in the initial circle so that you are the last one remaining and so survive.

 Where k = 2
Constraints:
N>=0
N<=100
Sample Input :
100
Sample output :
72
Input 
51
output
38
*/
import java.util.*;
public class survive_world {
    public static int fun(int n)
    {
      if(n%2 == 0)
        return 2*fun(n/2);
      else
        return 2*fun((n-1)/2)+2;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fun(x));
    }
}
