#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        vector <int> commonElements(int A[],int B[],int C[],int n1, int n2, int n3)
        {
            vector <int> ans;
            int i=0,j=0,k=0;
            int lst = INT_MIN;
            while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k] && lst != A[i]) {
            ans.push_back(A[i]);
            lst = A[i];
            i++;
            j++;
            k++;
        }
        else {
        if (min(A[i], min(B[j], C[k])) == A[i])
        i++;
        else if (min(A[i], min(B[j], C[k])) == B[j])
        j++;
        else if (min(A[i], min(B[j], C[k])) == C[k])
        k++;
        }
        }
        return ans;
}}asy;

int main(void){
    int n1,n2,n3;
    cin>>n1>>n2>>n3;
    int a[n1];
    int b[n2];
    int c[n3];
    for(int i=0;i<n1;i++) cin>>a[i];
    for(int i=0;i<n2;i++) cin>>b[i];
    for(int i=0;i<n3;i++) cin>>c[i];
    vector <int> res = asy.commonElements(a,b,c,n1,n2,n3);
    if(res.size()==0)
        cout<<-1;
    for(int i =0;i<res.size();i++)
        cout<<res[i];
        cout<<endl;
    }