import java.util.*;

class alice_apple {
static int find(int apples){
  int sum=0;
  int x[]=new int[] {-1,-1,-1,0,0,1,1,1};
  int y[]=new int[] {-1,0,1,-1,1,-1,0,1};
  for(int i=0;i<8;i++)
  {
    x[i]=x[i]<0?(x[i]*=-1):x[i];
    y[i]=y[i]<0?(y[i]*=-1):y[i];
  }
  int factor =1;
  while(sum<apples)
  {
    for(int i=0;i<8;i++)
    {
      	sum+=x[i]+y[i];
    }
    if(sum>=apples) break;
    ++factor;
    for(int i=0;i<8;i++)
    {
      	x[i]*=factor;
      	y[i]*=factor;
    }
  }
  return factor<<3;
}
    


	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int apples=sc.nextInt();
		System.out.println(find(apples));
	}
}