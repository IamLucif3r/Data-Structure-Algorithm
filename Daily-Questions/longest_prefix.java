import java.util.*;
public class longest_prefix {

    public static String longestPrefix(String[] arr, int n)
    {
        String ans = "";
        for(int i=0;i<arr[0].length();i++)
        {
            char ch = arr[0].charAt(i);
            boolean matched = true;
            for(int j=0;j<n;j++)
            {
                if(arr[j].length()<i || arr[j].charAt(i) != ch)
                {
                    matched = false;
                    break;
                }
            }
            if(matched)
                ans+=ch;
            else 
                break;
            
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next();
        }
        System.out.println(longestPrefix(arr,n));
    }
}
