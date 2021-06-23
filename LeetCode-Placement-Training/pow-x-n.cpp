#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        double myPow(double x, int n)
        {
            double temp;
            if(n==0)
                return 1;
            temp = myPow(x,n/2);
            if(n%2 == 0)
                return temp*temp;
            else{
                if(n>0)
                    return x*temp*temp;
                else
                    return (temp*temp) / x;

            }

        }        

}asy;
int main()
{
    double x;
    int n;
    cin >> x >>n;
    cout<<asy.myPow(x,n);
    return 0;
}