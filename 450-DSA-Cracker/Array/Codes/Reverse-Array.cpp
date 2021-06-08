#include <iostream>
#include <vector>
using namespace std;

int main(void)
{
    vector<int> v;
    v.push_back(3);
    v.push_back(2);
    v.push_back(4);
    cout<<v[0]<<"\n";
    cout<<v[1]<<"\n";
    cout<<v[2]<<"\n";
    cout<<"The Size of Array is:"<<v.size();
    qsort(v.begin(),v.end());
    reverse(v.begin(),v.end());
random_shuffle(v.begin(),v.end());
cout << *v.begin() << "\n";
return 0;
}