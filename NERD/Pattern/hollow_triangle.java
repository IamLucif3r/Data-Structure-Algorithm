package Pattern;
import java.util.*;
public class hollow_triangle {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
       

        int rows = scanner.nextInt();
       
        
        for (int i=1; i<=rows; i++)
        {
            // Print space in decreasing order
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1 || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
