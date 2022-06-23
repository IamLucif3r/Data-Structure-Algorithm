
import java.util.*;

public class nearestPrime {

    public static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }

    public static int closetPrime(int number)
	{
		if (number == 1)
			return 2;
		else {
			Integer[] arr = primeNumber.toArray(
				new Integer[primeNumber.size()]);
			// searching the index
			int index
				= upper_bound(arr, 0, arr.length, number);

			if (arr[index] == number
				|| arr[index - 1] == number)
				return number;
			else if (Math.abs(arr[index] - number)
					< Math.abs(arr[index - 1] - number))
				return arr[index];
			else
				return arr[index - 1];
		}
	}
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=1;i<n*2;i++)
        {
            if(isPrime(i))
            primes.add(i);
        }
        System.out.println(primes);
        int diff = 0;
        for(int i=0;i<primes.size()-1;i++)
        {
            int temp = primes.get(i+1)-primes.get(i);
            diff = Math.min(0,);
        }
        System.out.println(diff);
        System.out.println(n+diff);
    }
}
