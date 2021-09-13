/* Question:
INPUT FORMAT:

Input consists of 3 integers and a string.

The first input is an integer which denotes the seating capacity of L1(x).

The second input is an integer which denotes the seating capacity of L2(y).

The third input is an integer which denotes the seating capacity of L3(z).

The fourth input is a string which denotes the lab which is allocated for FACE training.

OUTPUT FORMAT:

Print the minimal seating capacity lab among the available labs.

Refer the sample output for formatting.

SAMPLE INPUT:

30

40

20

L3

SAMPLE OUTPUT:

L1
*/
#include<bits/stdc++.h>
#include<strings.h>
using namespace std;
int main(void)
{
    int x,y,z;
    string labs;
    cin>>x>>y>>z;
    gets(labs);
    cout<<labs;

}