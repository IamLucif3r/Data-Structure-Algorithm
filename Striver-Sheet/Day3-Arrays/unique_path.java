import java.util.*;
class main{
    static int[][] grid;
    public static int uniquePathUtil(int m, int n)
    {
        if(m==1 || n==1)
            return 1;
        
        if(grid[m-1][n-1] != -1)
            return grid[m-1][n-1];
        
        grid[m-1][n-1] = uniquePathUtil(m-1,n) + uniquePathUtil(m,n-1);

        return grid[m-1][n-1];
    }
    public static int uniquePath(int m, int n)
    {
        grid = new int[m][n];
        for(int[] i:grid)
            Arrays.fill(i,-1);
        
        return uniquePathUtil(m,n);

    }
    public static void main(String args[])

    {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(uniquePath(m,n));
    }
}