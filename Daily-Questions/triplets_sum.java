/* Approach
1. Sort the array.
2. Element 1 ---> Traverse i from 0 to (n-2)
3. for each element in step-2: We'll have two index start and end 
    start ---> (i+1) & end ----> (n-1)
4. Using 2-pointer look for a number whose value is (Sum - a[i])
5. if  target == a[start]+a[end] ---> Print + (start++) and (end--)
6. If target>a[start]+a[end] -->_Start++
    else decrement --;
*/
import java.util.*;
public class triplets_sum {
    public static void triplets(int a[], int n, int sum)
    {
        // Sorting Array
        Arrays.sort(a);
        boolean flag = false;
        // Iterate from 0 to n-2
        for(int i=0;i<n-2;i++)
        {
            if (a[i] == a[i+1])
            {
                continue;

            }
                int start = i+1;
                int end = n-1;
                int target = sum-a[i];
                while(start<end)
                {
                    if(start>i+1 && a[start] == a[start-1])
                    {
                        start++;
                        continue;
                    }
                    if (end<n-1 && a[end] == a[end + 1])
                    {
                        end--;
                        continue;
                    }
                    
                    if (target == a[start] + a[end])
                    {
                        System.out.print("[" + a[i]+ "," + a[start]+ "," + a[end] + "] ");
                        flag = true;    
                        start++;
                        end--;
                    }
                    else if (target > (a[start] + a[end]))
                    {
                        start++;
                    }
                    else 
                        end--;
                }
            
        }        
        if(flag == false)
        System.out.println("Triplets doesn't exist");

    }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
      {
          a[i] = sc.nextInt();
      }
      int target = sc.nextInt();
      triplets(a, n, target);
  }  
}
