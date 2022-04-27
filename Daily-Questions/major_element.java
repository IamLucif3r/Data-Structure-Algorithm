import java.util.*;
public class major_element {

    public static int findMajor(int[] a, int n)
    {
        Arrays.sort(a);
        int count = 1, max = -1;
        int temp = a[0], z = 0;
        int flag = 0;
        for(int i=1;i<n;i++)
        {
            if(temp == a[i])
                count++;
            else    
            {
                count = 1;
                temp = a[i];
            }   
            if(max < count)
            {
                max = count;
                z = a[i];
                if(max > (n/2))
                {
                    flag = 1;
                    break;
                }
            }
        }
        return (flag == 1? z : -1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }        
        System.out.println("Major Element :"+findMajor(arr, n));
    }
}
