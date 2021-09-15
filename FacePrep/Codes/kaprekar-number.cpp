/*Kaprekar number
Joffrey Baratheon wanted to excel in Math. He was learning about Kaprekar number from Olenna Tyrell,his Maths teacher. She gave him a few random numbers and asked him to find whether they are Kaprekar number or not. (Consider an n-digit number k. Square it and add the right n digits to the left n or n-1 digits. If the resultant sum is k, then k is called a Kaprekar number. For example, 9 is a Kaprekar number since 92 = 81 & 8 + 1 = 9 297 is a Kaprekar number as 2972 = 88209 & 88 + 209 = 297 )Can you help Joffrey to write a C++ program to find whether the given number is a Kaprekar number or not.

 

INPUT & OUTPUT FORMAT:

Input consists of a single integer.
Refer sample output for details.

SAMPLE INPUT & OUTPUT:
9

Kaprekar Number

*/
#include<iostream>
using namespace std;
bool kaprekar(int n)
{
    int sq=(n*n);//9x9=81
    
    

}
int main()
{
    int n;
    cin>>n;
    cout<<kaprekar(n);
}