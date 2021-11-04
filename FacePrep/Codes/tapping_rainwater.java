/**rapping Rain Water
Given an array arr[] of N non-negative integers representing the height of blocks. If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.

Constraints:
3 <= N <= 107
0 <= Ai <= 108

Example 1:
Input:
T=1
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
Explanation: 
T denotes the number of test cases.

Example 2:
Input:
T=1
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by the above block of height 4 is 3 units and above block of height 0 is 7 units. So, the total unit of water trapped is 10 units.

Example 3:
Input:
T=1
N = 3
arr[] = {6,9,9}
Output:
0
Explanation:
No water will be trapped.
 * 
 */
import java.util.*;
class tapping_rainwater {
	public static int maxWater(int[] height)
	{
		Stack<Integer> stack = new Stack<>();
		int n = height.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			while ((!stack.isEmpty())&& (height[stack.peek()] < height[i])) {
				int pop_height = height[stack.peek()];
				stack.pop();
				if (stack.isEmpty())
					break;
				int distance = i - stack.peek() - 1;
				int min_height= Math.min(height[stack.peek()],height[i])- pop_height;
				ans += distance * min_height;
			}
			stack.push(i);
		}
		return ans;
	}
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            System.out.print(maxWater(arr));
        }
	}
}
