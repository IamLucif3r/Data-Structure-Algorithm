#include<bits/stdc++.h>
using namespace std;

int main(void)
{
    int n,m;
    cin>>n>>m;
    //Decoare the Adjacent Matrix
    int adj[n+1][n+1]=0;
    //Now tak Edges as Input
    for(int i=0;i<m;i++)
    {
        int u,v;
        cin>>u>>v;
        adj[u][v]=1;
        adj[v][u]=1;
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            cout<<adj[i][j]<<" ";
        }cout<<endl;
    }
}