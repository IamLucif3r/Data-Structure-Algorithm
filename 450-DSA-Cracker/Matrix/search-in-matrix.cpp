class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int x) {
          int low = matrix.size(), high = matrix[0].size(), i = 0;
        int j = high - 1;
        
        while(i < low && j >= 0)
        {
            if(matrix[i][j] == x)
                return true;
            else if(matrix[i][j] > x)
            {
                j--;
            }
            else
                i++;
        }
        
        return false;
    }
    
};