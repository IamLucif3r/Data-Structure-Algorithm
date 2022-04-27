import java.util.*;
public class majority_element_optimized {

    public static void findMajor(int[] a, int n)
    {
        // 1.Create a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        // 2. Traverse Array 'a' i=0-->i=n
        for(int i=0;i<n;i++)
        {
            // 3. Check if 'a[i]' exists as key:
            //       if Exists --> count + 1;
            //       else  insert 'a[i]' in HashMap.
            if(map.containsKey(a[i]))
            {
                int count = map.get(a[i]) + 1;
                // 4. If count > n/2 --> print it as Majority Element
                if(count > a.length/2){
                    System.out.println("Majority Element :"+a[i]);
                    return;
                }
                else{
                    map.put(a[i], count);
                }
            }
            else{
                map.put(a[i], 1);
            }
        }
        // 5. If not Found --> print not Found 
        System.out.println("Majority Element doesn't exist");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        findMajor(a, n);
    }    
}
