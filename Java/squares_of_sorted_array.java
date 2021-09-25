/*Given an integer array nums sorted in non-decreasing order,
 return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
*/
import java.util.*;
public class squares_of_sorted_array {
    public static int[] sortedSquare(int[] nums)
    {
        int[] temp = new int[nums.length];
        
        for (int i = 0, j = nums.length - 1, current = j; current >= 0; ) {
            temp[current--] = Math.abs(nums[i]) >= Math.abs(nums[j]) ? nums[i] * nums[i++] : nums[j] * nums[j--];
        }
        return temp;
    }
       
    
    public static void main(String[] args) {
        int[] nums = new int[]{-7,-3,2,3,11};
        int[] result = new int[nums.length];
        result = sortedSquare(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(result[i]); 
        }
        
    }
}
