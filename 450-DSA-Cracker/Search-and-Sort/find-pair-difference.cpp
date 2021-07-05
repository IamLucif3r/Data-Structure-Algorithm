#include<bits/stdc++.h>
using namespace std;

bool findPair(int arr[],int size, int n);
int main()
{
    int l,n;
    cin>>l>>n;
    int arr[l];
    for(int i=0;i<l;i++)
    cin>>arr[i];
    if(findPair(arr,l,n))
    cout<<1<<endl;
    else
    cout<<"-1"<<endl;
    return 0;
}

bool findPair(int arr[],int n,int diff){
    sort(arr,arr+n);
    for(int i=0;i<n;i++){
        int num = arr[i] + diff;
        if(binary_search(arr+i,arr+n,num))
        return true;
    }
    return false;
}