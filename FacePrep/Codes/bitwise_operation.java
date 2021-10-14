/* Bitwise operator
Given an integer, say N. You need to find the following:

1. The number of set bits (that are 1 in the bitwise representation) in N.
2. The position of the least significant set bit.
3. The position of the most significant set bit. The output should be a string of the form: a#b#c, where a, b, c 
    are answers to the above three queries respectively.
Format:
Input:
The input consists of N, denoting an integer.
Output:
Return a string in the form: a#b#c, where a, b, c are the total number of set bits (i.e, 1). 
Least significant position of set bit, and most significant position of the set bit in the bitwise representation of N.
Example:
Input:
10
Output:
2#1#3
*/
import java.util.*;
public class bitwise_operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // COunt no of 1s
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>(100);
        while(n>0)
        {
            int rem = n%2;
            arr.add(rem);
            if(rem == 1)
                count++;
            n = n/2;
        }
        // Finding LSB & MSB
        int msb = 0, lsb=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==1)
            {
                lsb=i;
                break;
            }
        }
        for(int i=arr.size()-1;i>=0;i--)
        {
            if(arr.get(i)==1)
            {
                msb=i;
                break;
            }
        }
        System.out.println(count+"#"+lsb+"#"+msb);
    }
}
