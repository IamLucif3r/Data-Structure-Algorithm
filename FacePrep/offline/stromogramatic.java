import java.util.*;
public class stromogramatic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(1,1);
        mp.put(6,9);
        mp.put(9,6);
        mp.put(0,0);
        mp.put(8,8);
        
        int dig=0,flag=1;
        int z=n;
        while(z!=0)
        {
            int d=z%10;
            if(mp.containsKey(d))
            dig=dig*10+mp.get(d);
            else
            {
                flag =-1;break;
            }
            z=z/10;
        }
        if(flag!=-1)
        System.out.println(dig);
    }
    
}
