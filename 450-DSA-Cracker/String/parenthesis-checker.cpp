/*
Que: Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.
*/
#include<bits/stdc++.h>
using namespace std;

class Solution{
    public:
        bool ispar(string x)
        {
            stack<char>s;
            for (int i = 0; i < x.size(); i++) {
            char c = x[i];
            if (c == '{' || c == '[' || c == '(')
            s.push(c);
            else if (c == '}') {
                if ( !s.empty() && s.top() == '{' )
                    s.pop();
                else
                    return 0;
            }
            else if (c == ']') {
                if (!s.empty() && s.top() == '[' )
                    s.pop();
                else
                    return 0;
            }
            else if (c == ')') {
                if (!s.empty() && s.top() == '(' )
                    s.pop();
                else
                    return 0;
            }
            }
            if (s.empty())
                return true;
            else
                return false;
        }

}asy;

int main()
{
    string a;
    cin>>a;
    if(asy.ispar(a))
        cout<<"Balanced";
    else
        cout<<"Not Balanaced";
}