#include<bits/stdc++.h>
using namespace std;

class Solution{

    public:
        vector<int> factorial(int N){
 vector<int> ans;
        ans.push_back(1);
        int carry = 0;
        for(int i=2;i<=N;i++){
            for(int j=ans.size();j>=0;j--){
                int product = ((ans[j] * i ) + carry ) ;
                carry = product/10;
                ans[j]=product%10;
            }
            if(carry == 0)continue;
            while(carry!=0)
            {
                ans.insert(ans.begin(), carry%10);
                carry/=10;
            }
            carry =0;
        }return ans;
    }
}asy;

int main(void){
    int N;
    cin>>N;
    vector<int> result = asy.factorial(N);
    for(int i=0;i<result.size();i++){
        cout<<result[i];
    }
    cout<<endl;
}