import java.util.*;
public class extractIntfromString {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                list.add(ch);
            }

        }
        for(Integer i:list)
        System.out.println(i);
    }
}
