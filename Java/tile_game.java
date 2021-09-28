public class tile_game {
    public static double checkS(int n)
    {
        double a = Math.sqrt(n);
        return a;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int area = a*a;
        double x = 2.0;
        while(x!=(int)Math.sqrt(b))
        {
            x = checkS(b);
            b--;
        }
        System.out.println(b*area);
    }
}
