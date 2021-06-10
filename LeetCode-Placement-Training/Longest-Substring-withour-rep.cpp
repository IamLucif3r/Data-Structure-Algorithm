/*
Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
*/
#include<iostream>
#include<string>

using namespace std;
int lengthOfLongestSubstring(string s)
{
    if (s.length() == 0)
    {
        return s.length();
    }

    int sub_length = 0;
    int sub_begin = 0;

    for (int i = 0; i < s.length(); i++)
    {
        string sub = s.substr(sub_begin, i - sub_begin);

        if (sub.find_first_of(s[i]) != string::npos)
        {
            sub_begin = s.find_first_of(s[i], sub_begin) + 1;
        }
        else
        {
            sub_length = max(i - sub_begin + 1, sub_length);
        }
    }

    return sub_length;
}
int  main()
{
    string s = "abczabcaac";
    cout<<lengthOfLongestSubstring(s);
    return 0;
}
/*
In C++, std::substr() is a predefined function used for string handling.
 string.h is the header file required for string functions.

This function takes two values pos and len as an argument 
and returns a newly constructed string object with its value
initialized to a copy of a sub-string of this object.
Copying of string start from pos and done till
pos+len means [pos, pos+len).
*/