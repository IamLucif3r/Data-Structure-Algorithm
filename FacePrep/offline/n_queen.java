public class n_queen {

    // checking if the road is safe or not
    static boolean isSafe(boolean[][] board, int x, int y)
    {
        // no need to check Horiziontally,bcoz after checking for first row, we're checking for next row only.
        // Check vertically:
        // Fix the Y and check for 0 to row-1
        // check diagonal: only Upper-Left and Upper-Right diagonal.
        
    }
    static void solve(boolean[][] board, int N, int ROW)
    {
        // Base condition
        if(ROW==N)
        {
            return;
        }
        for(int col=0;col<board.length;col++)
        {
            if(isSafe(board,ROW,col))
            {
                board[ROW][col] = true;
                solve(board, N, ROW);// This function will be called again and again, until exit. so to backtracck, place a negation of above statement, below the current. 
                board[ROW][col] = false;

            }
        }
    }
    public static void main(String[] args) {
        int N = 5;
        // Consider this as a board.
        // Approach: Check every (row,column) to check if it is safe to place a queen there.
        // startng ffrom the first row, place a queen and move on to the next row & check every column if it is saef or not.
        boolean[][] board = new boolean[][]{
            {false,false,false,false,false},
            {false,false,false,false,false},
            {false,false,true,false,false},
            {false,false,false,false,false},
            {false,false,false,false,false},
             };
        solve(board, N, ROW);
    }
    
}
