import java.util.*;
public class heapSort {
    public static void heapSort(int a[],int n )
    {
        for(int i=n-1;i>0;i--)
        {
            swap(a, 0, i);
            heapify(a, i-1, 0);
        }
        System.out.println("Sorted Array using HeapSort");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
    public static void swap(int a[],int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void heapify(int a[],int n, int i)
    {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<=n && a[l]>a[largest])
            largest = l;
        if(r<=n && a[r]>a[largest])
            largest = r;
        if(largest != i)
        {
            swap(a,i,largest);
            heapify(a,n,largest);
        }
    }
    public static void buildHeap(int a[], int n)
    {
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(a,n,i);
        }
    }
    public static void main(String args[]) {
        System.out.println("HEAPIFY !!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        buildHeap(a,n);
        for(Integer j:a)
        System.out.print(j+" ");
        System.out.println("---------------------------");
        heapSort(a, n);
    }
}