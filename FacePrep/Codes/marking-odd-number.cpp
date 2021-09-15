#include<bits/stdc++.h>
using namespace std;

int main(void)
{
    int counter,marks=0;
    int num[100];
    
    do{    
        
        cin>>num[i];
    for(int i=0;i<num[i];i++)
    {
        if(num[i]%2!=0)
        {marks++;
        counter++;}
        else if(num[i]%2==0)
        {
            marks=marks-0.5;
            
        }
        else if(num[i]<0)
        {marks=marks-1;
        break;} 
    }i++;
    }while(counter==3);
    cout<<marks;
}