#include<bits/stdc++.h>
using namespace std;
class Solution{
public:
 int majorityElement(int a[], int size)
    {
       unordered_map<int,int> m;
       for(int i=0;i<size;i++){
           m[a[i]]++;
       }
       for(auto x:m){
           if(x.second>(size/2)){
               return x.first;
           }
       }return -1;
    
    }
};

int main(){
    int t;
    cin >>t;
    int arr[t];
    for(int i=0;i<t;i++){
        cin>>arr[i];
    }
    Solution obj;
    cout<<obj.majorityElement(arr,t)<<endl;
    return 0;
}