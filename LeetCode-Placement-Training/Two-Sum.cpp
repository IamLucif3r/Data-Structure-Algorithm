/*
Que. Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.
 Example: 
 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Output: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
#include<iostream>
using namespace std;

void check(int arr[], int target)
{
    for (int i=0;i<4;i++)
    {
        for (int j=i+1;j<4;j++)
        {
            if(arr[i]+arr[j]==target)
            {
                cout<<i<<","<<j<<endl;
            }
        }
    }
}
int main()
{
    int arr[]={1,2,3,4};
    int target;
    int size = sizeof(arr)/sizeof(int);
    cin>>target;
    check(arr,target);
    return 0;
}