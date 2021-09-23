/*Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.
 Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
TIME COMPLEXITY = O(n)
*/
import java.util.*;
public class two_sum_optimized {
    public static int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> compute = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(compute.containsKey(target-nums[i]))
            {
             return new int[] {i,compute.get(target-nums[i])};
            }
            else{
                compute.put(nums[i],i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] arr2 = new int[2];
        arr2 = twoSum(arr,target);
        for(int i =0;i<2;i++)
        {
            System.out.println(arr2[i]);
        }   

    }    
}
