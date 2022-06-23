import java.util.*;
class UglyNumbers
{
static int upperBound(int[] a, int low,int high, int element)
{
	while(low < high)
	{
	int middle = low + (high - low)/2;
	if(a[middle] > element)
		high = middle;
	else
		low = middle + 1;
	}
	return low;
}

static int nthUglyNumber(int n)
{

	int pow[] = new int[40];
	Arrays.fill(pow, 1);
	for (int i = 1; i <= 30; ++i)
	pow[i] = pow[i - 1] * 2;
	int l = 1, r = Integer.MAX_VALUE;
	int ans = -1;
	while (l <= r) {
	int mid = l + ((r - l) / 2);
	int cnt = 0;
	for (long i = 1; i <= mid; i *= 5)
	{

		for (long j = 1; j * i <= mid; j *= 3)

		{}
		cnt += upperBound(pow,0, 31,(int)(mid / (i * j)));
		}
	}
	if (cnt < n)
		l = mid + 1;
	else {
		r = mid - 1; ans = mid;
	}
	}

	return ans;
}

public static void main(String[] args)
{

    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.print(nthUglyNumber(n));
}
}