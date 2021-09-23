/*Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.
 Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
import java.util.*;
public class two_sum {
    public static int[] summ(int[] nums, int target)
    {
        int[] a = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target && i!=j)
                {
                    a[0]=i;
                    a[1]=j;
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] arr2 = new int[2];
        arr2 = summ(nums,target);
        for(int i =0;i<2;i++)
        {
            System.out.println(arr2[i]);
        } 
       
    }
}
