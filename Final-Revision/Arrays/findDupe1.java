import java.util.*;
class main{
    public static int findDupe( int arr[])
    {
        int ans=0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] == arr[i-1])
            ans=arr[i];
            else
            return 0;
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,9,8,9};
        System.out.print("Duplicate Element is: "+findDupe(arr));
    }
}