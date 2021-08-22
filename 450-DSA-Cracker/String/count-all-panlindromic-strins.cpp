#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        long long int countPS(string str)
        {
            long long int mod = 1000000007;
int n = s.length();
int dp[n][n];
for(int g = 0; g < n; g++){
for(int j = g, i = 0; j < n; i++, j++){
if(g == 0){
dp[i][j] = 1;
}
else if(g == 1){
if(s[i] == s[j]) dp[i][j] = 3;
else dp[i][j] = 2;
}
else if(s[i] == s[j]){
dp[i][j] = (dp[i][j-1]+ dp[i+1][j] + 1) % mod;
}
else{
long long a = (dp[i][j-1] + dp[i+1][j])%mod;
long long b = dp[i+1][j-1];
dp[i][j] = ((a - b) % mod + mod) % mod;
}
}
}
return dp[0][n-1];
        }
}asy;
int main(void)
{
    string str;
    cin>>str;
    long long int ans = asy.countPS(std);
    
}