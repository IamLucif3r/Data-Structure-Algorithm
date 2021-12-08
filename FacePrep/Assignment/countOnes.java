public class countOnes {
    int countOnes(int arr[], int low, int high)
    {
        if (high >= low)
        {
            // get the middle index
            int mid = low + (high - low) / 2;
 
            // check if the element at middle index is last
            // 1
            if ((mid == high || arr[mid + 1] == 0)
                && (arr[mid] == 1))
                return mid + 1;
 
            // If element is not last 1, recur for right
            // side
            if (arr[mid] == 1)
                return countOnes(arr, (mid + 1), high);
 
            // else recur for left side
            return countOnes(arr, low, (mid - 1));
        }
        return 0;
    }
 
    /* Driver code */
    public static void main(String args[])
    {
        countOnes ob = new countOnes();
        int arr[] = { 1, 1, 1, 1, 0, 0, 0 };
        int n = arr.length;
        System.out.println("Count of 1's in given array is "
                           + ob.countOnes(arr, 0, n - 1)+"\n");
    }
}
