import java.util.*;
public class Knight_tour {

    static class Cell{
        int x;
        int y;        
    }

    static ArrayList<Cell> possibleMoves(int x, int y)
    {
        /** All Possible moves 
         * x+1,y+2
         * x-1,y+2
         * x+1,y-2
         * x-1,y-2
         * 
         * x+2,y+1
         * x-2,y+1
         * x+2,y-1
         * x-2,y-1
         * 
        */
        
        ArrayList<Cell> possibleList = new ArrayList<>(); 
        int moveX[] = new int[] {1,-1,1,-1,2,-2,2,-2};
        int moveY[] = new int[] {2,2,-2,-2,1,1,-1,-1};
        for(int i=0;i<=7;i++)
        {
            if((x+moveX[i]>=0) && (x+moveX[i]<=7) && y+moveY[i]>=0 && (y+moveY[i]<=7 )){
                Cell obj = new Cell();
                obj.x = (x+moveX[i]);
                obj.y = (y+moveY[i]);
                possibleList.add(obj);
                
            }
        }
        
        return possibleList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[][]{
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
        };
        for( Cell i :  possibleMoves(4,4))
            System.out.println(i.x+" : "+i.y);
    }
}
