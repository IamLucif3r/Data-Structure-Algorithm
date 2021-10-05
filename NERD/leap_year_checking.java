//Logic of (year%4 ==0 ) will fail in case 1700
// The above logic is not correct for every case
/* Correct Approach:
1. Check if its a century or not : if its a century but not divisible by 400 --> Not Leap Year.
2. If not a century, check if it's divisible by 4: divisible--> LY  else not a LY
*/
import java.util.*;
public class leap_year_checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input of Year
        int year = sc.nextInt();
        // check if its a century, if year % 100 == 0 ---> then its a centry
        if(year % 100 == 0)
        {
            if(year%400==0)// CEntury dvisible by 400 is a leap year
            {
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }   
        }
        // IF its not Century
        else if(year %4 ==0)
        {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
