#include<bits/stdc++.h>
using namespace std;
void insert(vector<int>&v, int temp )
{
    if(v.size()==0||v[v.size()-1]<=temp)
    {
        v.push_back(temp);
        return;
    }
    int x = v[v.size()-1];
    v.pop_back();
    insert(v,temp);
    v.push_back(x);
}

void sort(vector <int> &v)
{  //Base Condition
    if(v.size()<=1)
        return;
    //1. Hypothesis
    int temp = v[v.size()-1];
    v.pop_back();
    sort(v);
    //Induction
    insert(v,temp);

}

int main(void)
{
     vector<int>v={2,3,7,6,4,5,9};
     sort(v);
     for(auto i:v)
        cout<<i<<" ";
     return 0;
    
}