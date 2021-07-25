#include<bits/stdc++.h>
using namespace std;
// We will defing Number of Characters in the alphabet
#define d 256

//Function for searching
void search(char pat[],char txt[], int q)
{
    int M = strlen(pat);
    int N = strlen(txt);
    int i, j;
    int p = 0; // Hash value for Pattern
    int t = 0; // hash value for txt
    int h = 1;
    //value of h will be calculated as "pow(d,M-1)%q"
    for(i=0;i<M-1;i++)
        h = (h*d)%q;
     // Now, calculate the hash value of pattern & first slot of text
     for(i =0; i<M;i++)
     {
         p = (d*p+pat[i])%q;
         t = (d*t+txt[i])%q;
     }   
     // We will move the pattern over text 1 by 1 
     for(i=0;i<N-M;i++)
     {
         // We will ceck the hash value of current slot of text
         // and pattern, if hash value match - then only char 1 by 1
         if(p==t)
         {
            for(j =0; j<M;j++)
            {
                if(txt[i+j]!=pat[j])
                break;
            }
            if(j==M)
                cout<<"Pattern Found at index"<<i<<endl;
         }
         // Now, caculae the hash value for next slot,
         if(i<N-M)
         {
             t = (d*(t-txt[i]*h) + txt[i+M])%q;
             if(t<0)
             t = (t+q);
         }
     }
}

int main()
{
    char txt[]="THIS IS RABIN KARP";
    char pat[]="RAB";
    // A prime number
    int q = 101;
    search(pat,txt,q);
    return 0;
}