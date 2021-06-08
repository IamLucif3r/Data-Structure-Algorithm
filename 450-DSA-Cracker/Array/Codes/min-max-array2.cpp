#include<iostream>
using namespace std;
struct Pair
{
    int min;
    int max;
};

struct Pair getMinMax(int arr[],int low, int high)
{
    struct Pair minmax, mml,mmr;
    int mid;
    // When Only One Element is present
    if (low == high)
    {
        minmax.max = arr[low];
        minmax.min = arr[low];
        return minmax;
    }
    // If there are 2 elements
    if(high == low+1)
    {
        if (arr[low]>arr[high])
        {
            minmax.max = arr[low];
            minmax.min = arr[high];
            return minmax;
        }
        else
        {
            minmax.max = arr[high];
            minmax.min = arr[low];
        }
        return minmax;
    }
    // When More than 2 elements are presemt
    mid = (low + high)/2;
    mml = getMinMax(arr, low, mid);
    mmr = getMinMax(arr, mid+1, high);

     // Compare minimums of two parts
    if (mml.min < mmr.min)
        minmax.min = mml.min;
    else
        minmax.min = mmr.min; 

    // Compare maximums of two parts
    if (mml.max > mmr.max)
        minmax.max = mml.max;
    else
        minmax.max = mmr.max;    
     
    return minmax;
}

int main()
{
    int arr[]={1000,11,445,1,330,3210};
    int arr_size=sizeof(arr)/sizeof(int);
    struct Pair minmax = getMinMax(arr,0,arr_size-1);
    cout<<"Minimum Element is:"<<minmax.min<<endl;
    cout<<"Maximum Element is:"<<minmax.max;
    return 0;
}