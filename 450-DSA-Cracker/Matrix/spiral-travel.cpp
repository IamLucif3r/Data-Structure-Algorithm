#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        vector<int> spirallyTraverse(vector<vector<int>> matrix, int r, int c){
                //Initialise a Vector a
                vector<int>a;
                //We will assume directions to play with later on
                int top, down, left,right;
                //initially direction = 0
                int direction = 0;
                //The Top is assigned as 0
                top = 0;
                // Down means rowwe are on - 1
                down = r-1;
                left = 0;
                // Right means the Column we are on - 1
                right = c-1;
                
                while(left<=right && top <= down) {
                    if(direction == 0) {
                    for(int i = left;i<=right;i++) {
                    a.push_back(matrix[top][i]);
                    }
                    top++;
                }

                else if(direction == 1) {
                    for(int i = top; i<=down;i++) {
                    a.push_back(matrix[i][right]);
                    }
                    right--;
                }

                else if(direction == 2) {
                    for(int i = right ; i>=left;i--) {
                    a.push_back(matrix[down][i]);
                    }
                    down--;
                }

                else if(direction == 3) {
                    for(int i = down; i>=top;i--) {
                    a.push_back(matrix[i][left]);
                    }
                    left++;
                }

                direction = (direction+1)%4;
                }
        return a;
        }
}asy;
int main()
{
    int r,c;
    cin>>r>>c;
    vector<vector<int>> matrix(r);
    for(int i=0;i<r;i++)
    {
        matrix[i].assign(c,0);
        for(int j=0;j<c;j++)
        {
            cin>>matrix[i][j];
        }
    }
    vector<int> result= asy.spirallyTraverse(matrix,r,c);
    for(int i=0;i<result.size();++i)
    {
        cout<<result[i];
    }cout<<endl;
    return 0;
}