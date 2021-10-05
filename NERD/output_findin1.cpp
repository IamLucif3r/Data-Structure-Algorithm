#include<iostream>
using namespace std;
int main(void)
{
    //CASE 1
      if(1,2,3,4,5)
        {
           cout<<"Anmol";
        }
        else
        {
            cout<<"Anmol Singh ";
        }
    // Case 2: Here, assume 0 = false, and ',' means ignore
    // in the last, we have 5, which states true, so execute if
        if(1,2,0,4,5)
        {
           cout<<"\n Anmol";
        }
        else
        {
            cout<<"\n Anmol Singh ";
        }
    // Case 3: here, last value is 0 which stands for false, so execute else part
    if(1,2,3,4,0)
        {
           cout<<"\n Anmol";
        }
        else
        {
            cout<<"\n Anmol Singh ";
        }
}