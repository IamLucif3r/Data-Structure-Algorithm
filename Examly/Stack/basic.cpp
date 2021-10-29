#include<iostream>
#include<stack>
using namespace std;
int main(void)
{
    stack<int> stack;
    stack.push(21);
    stack.push(24);
    stack.push(26);
    stack.push(30);
    stack.pop();
    stack.pop();
    while(!stack.empty()){
        cout<<' '<<stack.top();
        stack.pop();
    }
}