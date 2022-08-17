// Given an array consisting of only 0s, 1s and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Input: nums = [2,0,1]
// Output: [0,1,2]

// Input: nums = [0]
// Input: nums = [0]
import java.util.*;
class main{
    public static void sortNums(int a[])
    {
        int lo=0,mid=0,hi=a.length-1, temp=0;
        while(mid<=hi)
        {
            switch(a[mid]){
                case 0:{
                    swap(a,lo,mid);
                    lo++; mid++;
                    break;
                }
                case 1:{
                    mid++; 
                    break;
                }
                case 2:{
                    swap(a,mid,hi);
                    hi--;break;
                }
            }
        }
    }
    protected static void swap(int a[], int i, int j)
    {
        int temp =a[i];
        a[i]=a[j];
        a[j] = temp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = {2,0,2,1,1,0,1};
        sortNums(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}