// Java program to print all
// primes smaller than or equal to
// n using Sieve of Eratosthenes
import java.util.*;
class simple_sieve_one {
	public static void sieveOfEratosthenes(int n)
	{
		// Create a boolean array
		// "prime[0..n]" and
		// initialize all entries
		// it as true. A value in
		// prime[i] will finally be
		// false if i is Not a
		// prime, else true.
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++) //O(n)
			prime[i] = true;

		for (int i = 2; i * i <= n; i++) //O(log(log n))
		{
			// If prime[p] is not changed, then it is a
			// prime
			if (prime[i] == true)
			{
				// Update all multiples of p
				for (int j = i * i; j <= n; j += i)
					prime[j] = false;
			}
		}

		// Print all prime numbers
		for (int i = 2; i <= n; i++)
		{
			if (prime[i] == true)
				System.out.print(i + " ");
		}
	}

	// Driver Code
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Prime Numbers Less than "+n+" are :");
		SieveOfEratosthenes g = new SieveOfEratosthenes();
		g.sieveOfEratosthenes(n);
	}
}


