/**The Anagram String_Java
Write a Program to determine whether two strings are the anagram
Sample Input :
Apple
apple
Sample Output :
Anagram 
 * 
 */
import java.util.*;
public class anagram {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int flag = 0;
        if(s1.length != s2.length)
        {
            System.out.println("Not Anagram");
        }
        else{
            Arrays.sort(s1);
            Arrays.sort(s2);
            for(int i=0;i<s1.length;i++)
            {
                if(s1[i]!=s2[i])
                flag = 1;
                else
                flag = 0;
            }
        }
        if(flag ==1)
        System.out.println("Not Anagram");
        else
        System.out.println("Anagram");
    }
}
