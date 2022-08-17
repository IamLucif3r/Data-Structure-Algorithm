// Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.
// If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
// ---------------------------------------------------------------------------------------------
// Input format: Arr[] = {1,3,2}
// Output: Arr[] = {2,1,3}
// Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,1,3} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.
import java.util.*;
class main{
    public static void nextPermutation(int[] a)
    {
        if(a==null || a.length<=1)
            return;
        int i = a.length-2;
        while(i>=0 && a[i]>=a[i+1])
            i--;
        if(i>=0){
            int j = a.length-1;
            while(a[j]<=a[i])
            j--;
            swap(a,i,j);
        }
        reverse(a,i+1,a.length-1);
    }
    public static void swap(int a[], int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void reverse(int a[], int i, int j){
        while(i<j){
            swap(a,i++,j--);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
       nextPermutation(a);
       for(int i=0;i<n;i++)
       System.out.print(a[i]);
    }
}