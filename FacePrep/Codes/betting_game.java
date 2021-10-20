/* Betting game

You are in betting game with initial amount of Rs. 10. If you win the game, you get the betting amount and 
if you lose the game you have to give it. The winner will set the bet. If you win the game, you always set
half of the previous bet( if the previous bet is one then set the bet to one instead of half) and if you
lose your opponent will set double the previous bet.

You are given a string with a series of W and L representing wins and losses.
Print -1, if you cannot continue the game and if you complete the entire series print the final 
amount you have and the game begins with a bet of Rs. 1

constraints:
String size <20
Sample Input
WLWLWLWLWLWLW
Sample Output :
17

Case 1
Case 2

Input (stdin)
WLWLWLWLWLWLW
Output (stdout)
17
  
Input (stdin)
WWWLL
Output (stdout)
10
*/
import java.util.*;
class betting_game{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int amt=10,bet=1;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(bet>amt){
                System.out.println("-1");
                flag=true;
                break;
            }
            if(s.charAt(i)=='W'){
                amt=amt+bet;
                bet=bet/2;
                bet=(bet==0)?1:bet;
            }else{
                amt=amt-bet;
                bet=bet*2;
            }
        }
        if(!flag)
        System.out.println(amt);
    }
}