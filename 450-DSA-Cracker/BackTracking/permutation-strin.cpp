#include<bits/stdc++.h>
using namespace std;
class Solution{
public:
		vector<string>find_permutation(string S)
		{
		    // Code here there
		     
        vector<string> res;
        
        do
        {
            res.push_back(S);
        }
        while(next_permutation(S.begin(), S.end()));
        
        return res;
		}
}asy;

int main(void){
    string S;
    cin>>S;
    vector<string> ans = asy.find_permutation(S);
    for(auto i: ans){
        cout<<i<<" ";

    }cout<<endl;
}