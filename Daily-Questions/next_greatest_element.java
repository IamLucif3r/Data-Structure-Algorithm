/*Given an array, print the Next Greater Element (NGE) for every element. The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1. 
Examples: 

For an array, the rightmost element always has the next greater element as -1.
For an array that is sorted in decreasing order, all elements have the next greater element as -1.
For the input array [4, 5, 2, 25], the next greater elements for each element are as follows.
Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1
*/
import java.util.*;

import javax.lang.model.element.Element;
class stack{
    int top = -1;
    int a[] = new int[100];

    public void push(int data)
    {
        top++;
        a[top] = data;
    }
    public int pop(){
        int res = a[top];
        top--;
        return res;
    }
    public int top(){
        return a[top];
    }
    
    boolean isEmpty()
    {
        return (top == -1) ? true : false;
    }
}
public class next_greatest_element {

    public static void NSG(int a[], int n)
    {
        stack s = new stack();
        int curr, next;
        // First element of array in stack
        s.push(a[0]);
        // Checking next greatest by iterating 1->n-1
        for(int i=1;i<n;i++)
        {
            next = a[i];
            // if stack isn't empty --> compare top element with next
            if(!s.isEmpty())
            {
                curr = s.pop(); // curr = num to be compared
                while(curr<next)
                {
                    System.out.println(curr +" ----> "+next);
                    if(s.isEmpty())
                        break;
                    curr = s.pop();
                }
                if(curr>next)
                    s.push(curr);
            }
            // Pushing next element to find next greatest for the next element
            s.push(next);
        }
        while(!s.isEmpty())
        {
            curr = s.pop();
            next = -1;
            System.out.println(curr + " ----> "+next);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        NSG(a, n);
    }    
}

