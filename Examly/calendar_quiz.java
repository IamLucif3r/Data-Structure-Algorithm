/* Calendar Quiz
Super Quiz Bee is a famous quiz Competition that tests students on a wide variety of academic subjects. 
This week’s participants were kids of age 12 to 15 and the quiz questions were based on Gregorian calendar.

In the first round of the competition, the Host of the event told the participants that it was Monday 
on the date 01/01/2001. Later he questioned each one of the participant what would be the day on the
1st January, giving them a particular year. Write a program to help the Host validate the answers given 
by the participants.

Input format
The input consists of an integer that represents the year.

Output format
Output prints the day on which the 1st January of that year lies.

Sample testcases
Input 1
1994
Output 1
Saturday
Input 2
2014
Output 2
Wednesday
*/
import java.util.*;
class calendar_quiz{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int day = 0, total=0;
        for(int i =1900;i<y;i++)
        {
            if(i%400==0)
                total = total+366;
            else if(i%100==0&&i%400!=0)
                total = total+365;
            else if(i%100!=0&&i%4==0)
                total=total+366;
            else if(i%4!=0) 
                total = total+365;
        }
        day = total%7;
        if(day==0)
            System.out.println("Monday");
        else if(day==1)
            System.out.println("Tuesday");
        else if(day==2)
            System.out.println("Wednesday");
        else if(day==3)
            System.out.println("Thursday");
        else if(day==4) 
            System.out.println("Friday");
        else if(day==5)
            System.out.println("Saturday");
        else if(day==6)
            System.out.println("Sunday");
    
            
    }
}