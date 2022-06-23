import java.util.*;
public class isAnagram {
    public static Boolean checkAnagram(String s1, String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();  
        for(int i=0;i<s1.length();i++)
        {
            if(map.containsKey(s1.charAt(i)))
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            else    
                map.put(s1.charAt(i), 1);
        }
        for(int i=0;i<s2.length();i++)
        {
            if(map.containsKey(s2.charAt(i)))
            map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
        }
        Set<Character> set = map.keySet();
        for(Character ch : set)
        {
            if(map.get(ch)!=0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();
        if(checkAnagram(s1,s2))
            System.out.println("Anagram");
        else    
            System.out.println("Not Anagram");
    }
}
