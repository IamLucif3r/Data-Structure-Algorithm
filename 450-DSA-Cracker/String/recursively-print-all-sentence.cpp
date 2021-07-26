#include<bits/stdc++.h>
using namespace std;
#define R 3
#define C 3
// A recursive function to print every possible sentences

void printUtil(string arr[R][C], int m, int n, string output[R])
{
    output[m]=arr[m][n];
    if(m==R-1)
    {
        for(int i=0;i<R;i++)
        cout<<output[i]<<" ";
        cout<<endl;
        return;
    }
    for(int i =0;i<C;i++)
        if(arr[m+1][i]!=" ")
        printUtil(arr,m+1,i,output);

}
void print(string arr[R][C])
{
   // Create an array to store sentence
   string output[R];
 
   // Consider all words for first row as starting points and
   // print all sentences
   for (int i=0; i<C; i++)
     if (arr[0][i] != "")
        printUtil(arr, 0, i, output);
}


int main(void)
{
    string arr[R][C]={{"you","we"},{"have","are"},{"sleep","eat","drink"}};
    print(arr);
    
}