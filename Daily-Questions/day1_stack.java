// Implementation of Stack using Array
import java.util.*;
public class stack{
    public int a[];
    public int top=-1;
    public int capacity=0;

    public void stack(int capacity){
        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
    }
    public void push(int data)
    {
        if(top == capacity-1)
        {
            throw new Exception("Stack is Full");
        }
        top++;
        a[top] = data;
    }

}
public class day1_stack {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        stack s = new stack();
        int s.capacity = sc.nextInt();
        s.stack(capacity);
        for(int i=0;i<capacity;i++)
        {
            int data = sc.nextInt();
            s.push(data);
        }

    }

}
