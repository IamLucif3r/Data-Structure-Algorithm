/*Given an array of integers nums which is sorted in ascending order,
 and an integer target, write a function to search target in nums.
  If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

*/
import java.util.*;
public class binary_search{
    public static int bSearch(int[] nums, int target)
    {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
          pivot = left + (right - left) / 2;
          if (nums[pivot] == target) return pivot;
          if (target < nums[pivot]) right = pivot - 1;
          else left = pivot + 1;
        }
        return -1;
        
        
    }
public static void main(String[] args) {
    int[] arr = {-1,0,3,5,9,12};
    int target = 9;
   System.out.println(bSearch(arr,target));
}
}