import java.util.*;
class main{
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> rows, prev= null;
        
        for(int i=0;i<numRows;++i)
        {
            rows = new ArrayList<Integer>();
            for(int j=0;j<=i;++j)
            {
                if(j==0 || j==i)
                    rows.add(1);
                else
                    rows.add(prev.get(j-1)+ prev.get(j));
                
            }
            prev = rows;
                ans.add(rows);  
        }
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        ans=generate(n);
        System.out.print(ans);
    }
}