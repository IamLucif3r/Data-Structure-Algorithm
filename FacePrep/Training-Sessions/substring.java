/**Subset of a String_Java
Program to find all subsets of a string and print it in sorted order. In this program, all the subsets of the string need to be printed. The subset of a string is the character or the group of characters that are present inside the string. All the possible subsets for a string will be n(n+1)/2. For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
Sample Input :
java
Output Format :
a
a
av
ava
j
ja
jav
java
v
va 
* 
*/
import java.util.*;
public class substring {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("You have entered: "+s);      
    }
}
