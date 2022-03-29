import java.util.*;
class balancing_parenthesis {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        java.lang.String st = sc.next();
        for(int i=0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(ch);
            }
            else if(ch == ')'|| ch == ']' || ch == '}'){
                s.pop();
            }
            System.out.println(s);
        }
    }    
}
