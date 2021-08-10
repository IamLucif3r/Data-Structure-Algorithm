/*
Approach: Split the string with ‘ . ‘ and then check for all corner cases.
 Before entering the loop, check the size of the string. Generate all the possible 
 combinations using looping through the string. If IP is found to be valid
  then return the IP address, else simply return the empty list.
*/
#include<bits/stdc++.h>
using namespace std;
int is_valid(string ip)
{
    // Splitting by "."
    vector<string> ips;
    string ex = "";
    for (int i = 0; i < ip.size(); i++) {
        if (ip[i] == '.') {
            ips.push_back(ex);
            ex = "";
        }
        else {
            ex = ex + ip[i];
        }
    }
    ips.push_back(ex);
 
    // Checking for the corner cases
    // cout << ip << endl;
    for (int i = 0; i < ips.size(); i++) {
        // cout << ips[i] <<endl;
        if (ips[i].length() > 3
            || stoi(ips[i]) < 0
            || stoi(ips[i]) > 255)
            return 0;
 
        if (ips[i].length() > 1
            && stoi(ips[i]) == 0)
            return 0;
 
        if (ips[i].length() > 1
            && stoi(ips[i]) != 0
            && ips[i][0] == '0')
            return 0;
    }
    return 1;
}
// A Functino to convert String to IP ADdress
void convert(string ip)
{
    int l = ip.length();
    //Now we will check for the string size for validity of IP Address
    if(l>12 || l<4)
    {
        cout<<"Invalid IP Address";
    }
    string check = ip;
    vector<string> ans;
    // generating all possible combinations
    for(int i=1;i<l-1;i++){
        for(int j = i+1;j<l-1;j++){
            for(int k = j+1;k<l;k++){
                check = check.substr(0,k)+"."+check.substr(k,l-k+2);
                check = check.substr(0,j)+"."+check.substr(j,l-j+3);
                check = check.substr(0,i)+"."+check.substr(i,l-1+4);
                //Now, we will check for validity
                if (is_valid(check)) {
                    ans.push_back(check);
                    std::cout << check << '\n';
                }
                check = ip;
            }
        }
    }
}

int main(void)
{
    string A = "25525511135";
    string B = "25505011535";
    convert(A);
    convert(B);
    
}