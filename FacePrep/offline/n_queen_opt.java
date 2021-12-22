import java.util.ArrayList;
 
class Cell
{
    int x;
    int y;
}
 
class n_queen_opt
{    
    static ArrayList<Cell> possibleMoves(int x , int y, int[][]board)
    {
        /*
            x+1,y+2
            x-1,y+2
            x+1,y-2
            x-1,y-2
            x+2,y+1
            x-2,y+1
            x+2,y-1
            x-2,y-1        
        */
        ArrayList<Cell> possibiList = new ArrayList<>(); 
        int moveX[] = new int[] {1,-1,1,-1,2,-2,2,-2};
        int moveY[] = new int[] {2,2,-2,-2,1,1,-1,-1};
        for(int i=0;i<=7;i++)
        {
            // {(x + moveX[i]),(y + moveY[i])}
            if((x + moveX[i])>=0 && (x + moveX[i])<=7 &&(y + moveY[i])>=0 && (y + moveY[i])<=7 && board[x + moveX[i]][y + moveY[i]]==0)
            {
                Cell obj = new Cell();
                obj.x = (x + moveX[i]);
                obj.y = (y + moveY[i]);
                possibiList.add(obj);
            }
        }
        return possibiList;
    }
 
    public static void main(String[] args) 
    {
        int[][] board = new int[][]{
                                        {0,0,0,0,0,0,0,0},
                                        {0,0,0,0,0,0,0,0},  
                                        {0,0,0,0,0,0,0,0},
                                        {0,0,0,0,0,0,0,0},
                                        {0,0,0,0,0,0,0,0},
                                        {0,0,0,0,0,0,0,0},
                                        {0,0,0,0,0,0,0,0},
                                        {0,0,0,0,0,0,0,0}
                                    }; 
        /*for(Cell i : possibleMoves(2, 2))
        {
            System.out.println(i.x + " : " + i.y);
        }*/
 
        int x = 0 ; // can be changed 
        int y = 0 ; // can be changed
 
        board[x][y] = 1;
        int cellCount = 2;

        for(int k=0;k<63;k++)
        {
            ArrayList<Cell> possibilities = possibleMoves(x, y , board);
            Cell minimum = possibilities.get(0);
 
            for(Cell i : possibilities)
            {
                if(possibleMoves(i.x, i.y, board).size()<=possibleMoves(minimum.x, minimum.y, board).size())
                {
                    minimum.x = i.x;
                    minimum.y = i.y;
                }
            }
            x = minimum.x;  // next X - cordinate
            y = minimum.y; // next Y - cordinate
            board[x][y] = cellCount++;
        }
 
        // Print the board 
        for(int i[] : board)
        {
            for(int j : i)
            {
                if(j<=9)
                {
                    System.out.print("0"+j+" ");    
                }
                else
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

    }
}
