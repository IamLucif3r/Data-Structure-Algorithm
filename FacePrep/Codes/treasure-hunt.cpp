#include<iostream>
using namespace std;
int main()
{
    int A[3], n=3, i, j, x;
    for (i = 0; i < n; i++)
        cin >> A[i];    
    for (i = 0; i < n; i++)
    {
        for (j = i + 1; j < n; j++)
        {
            if (A[i] < A[j])
            {
                x = A[i];
                A[i] = A[j];
                A[j] = x;
            }
        }
    } cout << "The Box With Treasuse has Numer : " << A[1];
    int st,hcf;
    for(int i=0;i<n;i++)
    {
        st=A[0]<A[1]?(A[0]<A[3]?A[0]:A[3]):(A[1]<A[3]?A[1]:A[3]);
  for (hcf=st;hcf>=1;hcf--) 	{  	  
    if (A[0]%hcf==0 && A[1]%hcf==0 && A[3]%hcf==0)
      break;
  }
  
    }cout<<"\n CODE:"<<hcf<<"\n";
}