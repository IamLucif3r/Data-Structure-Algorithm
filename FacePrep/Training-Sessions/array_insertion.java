/**Array insertion
Arun and Ram were playing cards. Arun has 5 cards. Ram wants to insert a new card in between Arun's cards. Ram wants to find the position to insert the card. So help him to find the position to insert a certain card. If Ram inserts a card in a position other than the position of 5 cards, the game will be over. So play carefully. EXAMPLE: consider an array having three elements in it initially and a[0] = 1, a[1] = 2 and a[2] = 3 and you want to insert a number 45 at location 1 i.e
i.e. a[0] = 45, so we have to move elements one step below after insertion a[1] = 1 , and a[2] = 2 and a[3] = 3.
Input Format:

Assume that the maximum number of elements in the array is 20.
Sample Input:
5
1
2
3
4
5
4
10
Sample Output:
Array after insertion is
1
2
3
10
4
5
* 
 */
import java.util.*;
public class array_insertion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int pos = sc.nextInt();
		int ele = sc.nextInt();
		if(n==20)
		{
			for(int i=0; i<n; i++)
			{
				System.out.println(arr[i]);
			}
		}
		else
		{
            ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0; i<pos-1; i++)
			{
				list.add(arr[i]);
			}
			list.add(ele);
			for(int i=pos-1; i<n; i++)
			{
				list.add(arr[i]);
			}
			for(int i=0; i<list.size(); i++)
			{
				System.out.println(list.get(i));
			}
		}
	}
}
