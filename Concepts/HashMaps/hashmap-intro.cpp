#include<iostream>
#include<unordered_map>
#include<string>
using namespace std;

int main()
{
    // unodered_map <key, values>
    unordered_map<string, int> ourMap;
    // Insert Elements - Insert Key and Value (pair)
    pair<string, int> p("abc",1);
    ourMap.insert(p);
    //method 2 of insertion
    ourMap["def"] = 2;
    // Find or Access 
    cout << ourMap["abc"]<<endl;
    // Method 2
    cout << ourMap.at("abc")<<endl;
    cout <<"Size: "<< ourMap.size()<<endl;
    // Errors that can be occured:
//    cout << ourMap.at("ghi")<<endl; // This will show error bcoz ghi doesn't exists
  //  cout << ourMap["ghi"]<<endl; // This will put default value 0 and show it to you
    // To check if key is present - Use Presense
    if(ourMap.count("ghi")>0){ // the Count func returns 0 or 1
        cout << "ghi is present "<<endl;
    }else 
    cout << "Not Present";
}