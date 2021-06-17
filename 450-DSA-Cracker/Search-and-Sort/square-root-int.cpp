#include<bits/stdc++.h>
using namespace std;

class Solution{
    int count;
public:
    int countSquare(int N)
    {
        for(int i=1;i*i<N;i++){
            count ++;
        }return count;
    }
};

int main()
{
    int t;
    cin >> t;
    Solution ob;
    cout<<ob.countSquare(t);

    return 0;
}