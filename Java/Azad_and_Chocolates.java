import java.io.*;
import java.util.Scanner;
public class Azad_and_Chocolates {
int value(int x) {
while(x>=7)
{
x=x-7;
if(x%3==0)
{
return 1;
}
}
return 0;
}
int valuecheck(int a)
{
if(a%3==0||a%7==0||a%3==7||a%7==3)
return 1;
else
return 0;
}

 public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int cases = sc.nextInt();
int arr[] = new int[cases];
for(int i = 0; i<cases; i++) {
arr[i] = sc.nextInt();
}
Azad_and_Chocolates obj = new Azad_and_Chocolates();
int val;
for(int i = 0; i<cases; i++) {
if(arr[i]<=97)
{
val = obj.valuecheck(100-arr[i]);
if(val == 1)
System.out.println(val);
else
{
val = obj.value(100-arr[i]);
System.out.println(val);
}
}
else
{
System.out.println(0);
}
}
}

}
