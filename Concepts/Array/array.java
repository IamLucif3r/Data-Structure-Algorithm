import java.util.*;
public class array {
    public static void main(String[] args) {
        
        int a[][] = {
                    {1,2,3,4},
                    {2,4,6,8},
                    {3,5,7,9,}
                    } ;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}
