#include <bits/stdc++.h>
#include<algorithm>
using namespace std;
class Solution {
public:    
    void swap(vector<int>& matrix, int a, int b)
    {
        auto temp = matrix[a];
        matrix[a] = matrix[b];
        matrix[b] = temp;
    }
    
    int findPivot(vector<int>& matrix, int start, int end)
    {
        int j = start - 1, i;
        int pivot = matrix[end - 1];
        for(i = start; i < end - 1; i++)
        {
            if(matrix[i] <= pivot)
            {
                j++;
                swap(matrix, i, j);
            }
        }
        swap(matrix, end - 1, j + 1);
        return j + 1;
    }
    
    int quickSelect(vector<int>& matrix, int k, int start, int end)
    {
        int pivot = findPivot(matrix, start, end);
        if(pivot == k)
        {
            return matrix[pivot];
        }
        else if(pivot < k)
        {
            return quickSelect(matrix, k, pivot + 1, end);
        }
        return quickSelect(matrix, k, start, pivot);    
    }
    
    int kthSmallest(vector<vector<int>>& matrix, int k) {
        int n = matrix.size(), p = 0;
        vector<int> arr(n * n, 0);
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[p] = matrix[i][j];
                p++;
            }
        }
        if(n == 1)
        {
            return arr[0];
        }
        k--;
        return quickSelect(arr, k, 0, n * n);
    }
};
int main()
{
    int arr[]={7,10,4,20,15};
    int k = 4;
    int l=0;
    int r = sizeof(arr)-1;
    cout<<"smallest element number"<<k<<"is:";
    cout<<kthsmallest(arr,l,r,k);
return 0;
}