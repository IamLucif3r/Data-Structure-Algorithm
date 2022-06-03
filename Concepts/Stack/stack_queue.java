import java.util.*;
class stack{
    LinkedList<Integer> q1  = new LinkedList<>();

    void push(int data)
    {
        q1.add(data);
        for(int i=0;i<q1.size()-1;i++)
        {
            q1.add(q1.remove());
        }
    }
    int pop(){
       return q1.remove();
    }
    int top(){
        return q1.peek();
    }
}
public class stack_queue {
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
