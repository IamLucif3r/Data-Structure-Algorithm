/**There are N people standing in a circle waiting to be executed. The counting begins at some point in the circle and proceeds around the circle in a fixed direction. In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller, as the executed people are removed), until only the last person remains, who is given freedom. Given the total number of persons N and a number K which indicates that K-1 persons are skipped and the kth person is killed in a circle. The task is to choose a place in the initial circle. So that you are the last one remaining and you survive.

 Format:
Input:
The first line consists of an integer value, which is the total number of people. The second line consists of a Kth person to be killed in a circle.
Output:
We have to obtain the same stack on the third rod.
 
Constraints:
1 <= N <= 100000
1 <= K <= 500
Example:
Input:
100
2
Output:
73
* 
 */
public class josephus {
    static int josephus_(int n, int k)
    {
        // base condition willl be when n==1
        if(n==1)
        {
            return 1;
        }
        else{
            return (josephus_(n-1, k)+ k - 1)%n+1;
        }
    }
    public static void main(String args[])
    {
        int n=100;
        int k= 2;
        System.out.println(josephus_(n, k));
    }    
}
