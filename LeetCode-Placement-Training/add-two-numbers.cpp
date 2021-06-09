/* 
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit.
 Add the two numbers and return the sum as a linked list. 
 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.
*/
#include<iostream>
#include<list>

using namespace std;
void add(list<int> &lit)
{
    list<int> :: iterator it;
    for(it=lit.begin();it!=lit.end();it++)
    {
       lit.push_back(it);
    }
}
void display(list<int> &lst){
    list<int> :: iterator it;
    for(it=lst.begin();it!=lst.end();it++)
    {
        cout<<*it<<endl;
    }
}
int main()
{
    // creating List of 0 length
    list<int> list1;
    // Empty List of Size 7
    //list<int> list2(7);
    add(list1);
    display(list1);
}