/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
*/
#include<iostream>
#include<string>
using namespace std;
string convert(string s, int numRows)
{
if(numRows == 1) return s;
string ret;
int n = s.size();
int cycleLen = 2 * numRows - 2;
for(int i = 0 ; i<numRows; i++){
    for (int j=0;j+i<n; j+=cycleLen){
        ret += s[j+i];
        if(i!=0 && i!=numRows-1 && j+cycleLen-i<n)
        ret += s[j+cycleLen-i];
    }
}
return ret;
}
int main()
{
    string phrase = "PAYPALISHIRING";
    int rows=3;
    cout<<convert(phrase, rows);
    
}