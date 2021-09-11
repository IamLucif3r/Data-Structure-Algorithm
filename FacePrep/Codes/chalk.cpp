/*
Stuart Bloom's teacher Denise uses chalk to write on the board.
 When the chalk reduces to 1/square root(n) of its original size,
  she keeps the chalk aside as it gets too small. She joins all the small
   pieces of the chalk and makes another chalk of the same size 
   and uses it. If she uses one chalk each day, in how many days
    will she use the given n number of chalks?
*/
#include<bits/stdc++.h>
using namespace std;
int main()
{
	int chalk;
	cin>>chalk;
	cout<<chalk+sqrt(chalk)+1;// Wrong; to be corrected!

}