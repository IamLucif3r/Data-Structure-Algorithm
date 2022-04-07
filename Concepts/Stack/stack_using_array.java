import java.util.*;
class myStack{
    public int a[];
    public int top;
    public int capacity;
    // Stack Creation - Parameterized Constructor. 
    public myStack(int capacity)
    {
        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
        System.out.println("Stack created");
    }
    // Function to add data into Stack
    void push(int data)
    {
        if(top == capacity-1)
        {
            System.out.println("Overflow Condition Triggered");
        }
        //1.Increment the Top Pointer
        top++;
        //2. At 'top'th index add data into array
        a[top] = data;
        System.out.println("Data added Successfully");
    }
    // Function to PoP Data
    int pop(){
        if(top == -1)
        {
            System.out.println("Underflow Condition Triggered");
        }
        //1. Store data at 'top' index in array a in a varriable temp;
        int result = a[top];
        //2. Reduce the top by 1
        top--;
        // return the result;
        return result;
    }
    // Function to check if Stack is empty.
    boolean isEmpty(){
        return top == -1;
    }
    // Calculate the Size Function
    int size(){
        return top+1;
    }  
}

public class stack_using_array {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        myStack st = new myStack(size);
        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        st.push(40);
        System.out.println("Size of the Stack is: "+st.size());
        for(int i=0;i<size;i++)
        {
            System.out.println(st.pop());
        }
    }
}

