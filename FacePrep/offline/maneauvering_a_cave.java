// A robot wants to move through a cave of grid mxn from (0,0) to (m-1,n-1).
// It can only go Right or Down.
// Calculate the total nymber of ways the robot can reach destination.
// Approach: 
/*  -  One cell exists (destination cell), where you can't move either bottom or right.<-- Base Codition
    -  keep in mind you don't move outside the border.
*/
//  When the result is (m-1,n-1) ---> you're at the destination
import java.util.*;
public class maneauvering_a_cave {

    static int getTotalWays(int x,int y, int currX,int currY)
    {
        // Base Condition: if (currx = m-1 and curry = n-1) i.e. we reach the destination
        if(currX == x-1 && currY == y-1)
        {
            return 1;
        }
        // Check if the Current goes outside the grid
        if(currX>=x || currY>=y)
        {
            return 0;
        }
        return getTotalWays(x,y,currX,currY+1) + getTotalWays(x,y,currX+1,currY);

    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        System.out.println(getTotalWays(x,y,0,0));

    }
}
