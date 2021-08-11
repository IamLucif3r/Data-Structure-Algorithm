/*Algorithm: 
Initialize count = 0 and traverse the string character by character and keep track 
of the number of 0s and 1s so far, whenever the count of 0s and 1s become equal
 increment the count. As in the given question, if it is not possible to split string
  then we must not have any sub string having equal number of 0’s and 1’s on that
   time count = 0 then return -1 else print the value of count after the traversal
    of the complete string.
*/
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
        int maxSubStr(string str,int n){
            //TO Store the counts of 0s and 1s
            int count0 = 0, count1 = 0;
            //To keep a count of maximum substring
            int cnt;
            for (int i = 0; i < n; i++) {
                if (str[i] == '0') {
                    count0++;
                }
                else {
                    count1++;
                }
                if (count0 == count1) {
                    cnt++;
                }
            }
            if (cnt == 0) {
            return -1;
            }
        return cnt;
        }    
}asy;

int main(void)
{
    string str = "0100110101";
    int n = str.length();
    cout<<asy.maxSubStr(str,n);

}