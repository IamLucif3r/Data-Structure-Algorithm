import java.io.*;
import java.util.Scanner;
public class Prime_Number {

 public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int root = (int)Math.sqrt(n);
int count = 0;
for(int i = 1; i <= root; i++) {
if(n%i == 0) {
count++;
}
}
if(count==1) {
System.out.println("The given number is a prime number");
}
else {
System.out.println("The given number is not a prime number");
}
}

}