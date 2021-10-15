/* plus one
You are given a large integer represented as an integer array digits, where each digits[i] is the 
ith digit of the integer. The digits are ordered from most significant to least significant in 
left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*/

import java.util.*;
class plus_one{
    public static int[] plus(int[] digits) {
        if(digits == null || digits.length == 0) {
            return null;
        }
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                if(i == 0) {
                    digits[i] = 0;
                    int[] copy = new int[digits.length + 1];
                    copy[0] = 1;
                    for(int j = 1; j < copy.length; j++){
                        copy[j] = digits[j-1];
                    }
                    return copy;
                }
                digits[i] = 0;
            }
        }
        return digits;       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3};
        System.out.println(plus(a));
    }
}