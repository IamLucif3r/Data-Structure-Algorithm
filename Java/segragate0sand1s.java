
class segregate0sand1s {
	static void segregate0sand1s(int arr[], int n)
	{
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				count++;
		}
		for (int i = 0; i < count; i++)
			arr[i] = 0;
		for (int i = count; i < n; i++)
			arr[i] = 1;
	}
	static void print(int arr[], int n)
	{
		System.out.print("Segregated Array: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	public static void main(String[] args)
	{
		int arr[] = new int[]{ 0, 1, 0, 1, 0 };
		int n = arr.length;
		segregate0sand1s(arr, n);
		print(arr, n);
		
	}
}
