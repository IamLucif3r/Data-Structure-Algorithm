// List is a container used to store data
// Bi-Directional List facilitate Addition and Deletion.
// List is used for faster Access
#include<iostream>
#include<list>

using namespace std;

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
    list1.push_back(5);
    list1.push_back(6);
    list1.push_back(7);
    list1.push_back(8);
    //Now making an Iterator
  /*  list<int> :: iterator iter;
    iter = list1.begin();
    cout << *iter<<endl;
    iter++;
    cout << *iter<<endl;
    */
    display(list1);
}