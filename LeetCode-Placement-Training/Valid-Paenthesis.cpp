/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
*/
#include<iostream>
#include<unordered_map>
#include<string>
#include<stack>
using namespace std;
bool isValid ( string s ) {

	if( s.size() == 0 )
		return 0;

	stack<char> encountered;
	unordered_map<char, char> brackets;
	brackets['{'] = '}';
	brackets['['] = ']';
	brackets['('] = ')';

	for ( auto it=s.begin(); it!=s.end(); it++ ) {

		if( brackets.find(*it) != brackets.end() )
			encountered.push(*it);
		else {

			if( !encountered.empty() ) {

				char leftbracket = encountered.top();
				encountered.pop();
				char rightbracket = brackets[leftbracket];
				if( rightbracket != *it )
					return 0;

			} else
				return 0;

		}

	}
	return encountered.empty();
}
int main()
{
    string exp = "()[]{}";
    if(isValid(exp))
    {
        cout<<"The Expression is Balanced";
    } 
    else
    cout<<"Expression Not Balanced";
    return 0;
}