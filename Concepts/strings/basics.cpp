#include <bits/stdc++.h>
using namespace std;

int main()
{
    // string name = "Anmol"; // Manually initialize string value
    string name; // Declaration
    cout<<"Enter your name:";
    // cin>>name; // Only One Word Input
    getline(cin,name,'\n'); // Take Whole Line INput: \n is for terminating one
    cout<<"Hello "<<name<<endl;
    cout<<"Length: "<<name.length();
    // cout<<"Full name: "<<name
    //[*]--------- Bug with not using \n ----------------
    int age;
    cout<<"nEnter Your Age:";
    cin>>age; // When you enter your Name, and hit enter, you are sending an Int value and '\n' along with it. When you're prompted to below line, it'll take \n as well and won't ask input.
    cout<<"\nWhat's your name?";
    getline(cin,name);    
    return 0;
}
