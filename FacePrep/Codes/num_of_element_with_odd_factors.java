/*Number of elements with odd factors in a given range


Write a program to find the number of elements with odd factors in the given range
 (inclusive of ranges).
Format:

Input:
The input consists of two integers.
Output:
The output consists of an integer.
Example:
Input:
1 100
Output:
10
*/
    import java.util.*;
    public class num_of_element_with_odd_factors {
        static boolean checkS(double number)    
        {   
    
        double sqrt=Math.sqrt(number);   
        
        return ((sqrt - Math.floor(sqrt)) == 0);   
        } 
        public static void main(String[] args) {
            int count=0;
            Scanner sc = new Scanner(System.in);
            int l =sc.nextInt();
            int r = sc.nextInt();
            for(int i=l+1;i<r;i++)
            {
                if(checkS(i)==true)
                {
                    count++;
                }
            }System.out.println(count);
        }
    }
