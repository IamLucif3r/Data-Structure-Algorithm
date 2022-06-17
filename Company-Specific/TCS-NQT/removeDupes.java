import java.util.*;

import javax.print.attribute.HashAttributeSet;
public class removeDupes {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(a[i]);
        }
        System.out.println(set.size());
    }
}
