/*
Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
Output: true
Explanation:
The numerical value of firstWord is "acb" -> "021" -> 21.
The numerical value of secondWord is "cba" -> "210" -> 210.
The numerical value of targetWord is "cdb" -> "231" -> 231.
We return true because 21 + 210 == 231.

also, you have to use from a,b,c,....,j, 
*/
#include<bits/stdc++.h>
using namespace std;

bool isSumEqual(string firstWord,string secondWord, string thirdWord)
{
    string valid = "abcdefghij";
    string firstWordNum, secondWordNum, thirdWordNum;
    for(int i=0;i<firstWord.length();i++)
    {
        signed short int fElement = valid.find(firstWord[i]);
        firstWordNum += to_string(fElement);
    }
    for(int i=0;i<secondWord.length();i++)
    {
        signed short int sElement = valid.find(secondWord[i]);
        secondWordNum += to_string(sElement);
    }
    for(int i=0;i<thirdWord.length();i++)
    {
        signed short int tElement = valid.find(thirdWord[i]);
        thirdWordNum += to_string(tElement);
    }
    int source = stoi(firstWordNum)+stoi(secondWordNum);
    int target = stoi(thirdWordNum);
    if(source == target){
        return true;
    }else{
        return false;
    }
}

int main()
{
    string fword="acb";
    string sword="cba";
    string tword="cdb";
    cout<<isSumEqual(fword,sword,tword);
    return 0;
}