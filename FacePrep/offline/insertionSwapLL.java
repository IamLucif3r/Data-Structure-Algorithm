import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
}
}
class main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int flag = 1;
        while(flag==1)
        {
            int n = sc.nextInt();
            if(n<0)
                flag=0;
            list.add(n);
        }
        for(Integer ele:list)
        System.out.print(ele+" ");
    }
}