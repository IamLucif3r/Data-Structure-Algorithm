//Given a sentence in the form of a string, convert 
//it into its equivalent mobile numeric keypad sequence. 
//Approach: Store key equivalent of a character in array
// and calculate the number by subtracting ASCII value of
// current chharacter by ASCII value of A
#include<bits/stdc++.h>
using namespace std;

string printSeq(string arr[],string input){
    string output="";
    int n = input.length();
    for(int i=0;i<n;i++)
    {
        //We will check for spaces
        if(input[i]==' ')
            output=output+"0";
        else
        {
            //Now calculate the index of each character
            int position = input[i]-'A';
            output =output + arr[position];
        }
    }
    return output;
}

int main(void){
    string str[]={"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
    string input = "ANMOLSINGHYADAV";
    cout<<printSeq(str,input);
}
