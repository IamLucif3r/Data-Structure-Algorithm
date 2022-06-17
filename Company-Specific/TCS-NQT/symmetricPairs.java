import java.util.*;
public class symmetricPairs {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int first = a[i][0];
            int second = a[i][1];
            if(hashMap.get(second) != null && hashMap.get(second) == first)
            {
                System.out.println("("+first+" "+second+")");
            }
            else
            hashMap.put(first, second);
        }
    }
}
