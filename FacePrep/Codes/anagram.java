/*
Anagram
Write a function to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different.

For example
“abcd” and “dabc” are an anagram of each other.

Constraints:
1<=String Size<=15

Example:
Input 1:
LISTEN
SILENT
Output:
The two strings are anagram of each other
*/
import java.util.*;
class anagram{
    static boolean isAnagram(char[] s1, char[] s2)
    {
        int l1 = s1.length;
        int l2 = s2.length;
        if(l1!=l2)
            return false;
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<l1;i++)
        {
            if(s1[i]!=s2[i])
                return false;
        }
        return true;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char str1[] = sc.nextLine().toCharArray();
        char str2[] = sc.nextLine().toCharArray();
        Arrays.sort(str1);
        System.out.println(str1);
        if(isAnagram(str1, str2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");
    }
}