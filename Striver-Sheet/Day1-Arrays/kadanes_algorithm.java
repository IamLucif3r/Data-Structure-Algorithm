// Kadanes Algorithm : Maximum Subarray Sum in an Array
// Given an integer array arr, find the contiguous subarray (containing at least one number) which
// has the largest sum and return its sum and print the subarray.
// Example 1:
// Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 
// Output: 6 
// Explanation: [4,-1,2,1] has the largest sum = 6. 
// Examples 2: 
// Input: arr = [1] 
// Output: 1 
// Explanation: Array has only one element and which is giving positive sum of 1. 


import java.util.*;
class main{
     public static int maxSubArray(int[] nums,ArrayList<Integer> subarray) { 
        int msf=Integer.MIN_VALUE , meh=0 ; 
        int s=0;
        for(int i=0;i<nums.length;i++){ 
            meh+=nums[i]; 
            
            if(meh>msf)
            { 
                subarray.clear();
                msf=meh; 
                subarray.add(s); 
                subarray.add(i); 
            } 
            if(meh<0)
            {
                meh=0; 
                s=i+1;
                
            } 
        } 
 
        return msf; 
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        ArrayList<Integer> subarray = new ArrayList<>();
        int lon = maxSubArray(a,subarray);
        System.out.println("Maximum Sum : "+lon);
        System.out.println("The SubArray with Max Sum is:");
        for(int i=subarray.get(0);i<=subarray.get(1);i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}