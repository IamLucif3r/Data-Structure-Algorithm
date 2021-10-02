/*Cheating Exam - Galois Zigzag
You know Galois is a very smart student. He dislikes History exams and you know that 
he will find a smart way to cheat. You are the supervisor in the exam hall for his History 
exam and you recover from him a sheet of paper that contains several lines that appear to be in 
a language not even remotely resembling English even though the alphabets used are from the 
English language. The Principal will not believe you unless you establish beyond doubt, that the 
paper recovered from him contains an answer to one of the questions. You show the paper to
the head of Computer Science department and he says that it is a well-known crypto method and agrees
to decrypt the same for you. It turns out that Galois did the following,
He writes the original message in a zig-zag pattern and reads of the lines horizontally. 

For example, IAMSMARTERTHANYOU is written first as and encoded as IEUATROMRTYSAHNMA. 
Write in V pattern with 5 rows to picturize it. Given the number of rows used by Galois to encode
the text and the encoded text, write a program to recover the original text. Note that if the length 
of the string is not adequate to complete the pattern, Galois pads it with the character "X" to make 
up the length. These must not appear in the output.

Input Format:
The first line of the input is the number of rows (depth) Galois used in his coding scheme
The next line is the encoded message
Output Format:
The decoded message with all the padding characters (if any) removed.
Constraints:
Depth ≤10
Example 1
Input 
5 
CCEAEOSNDDEYUEHOT
Output 
CANYOUDECODETHESE
Example 2
Input 
5
WTXHUTXAOHXTBIXAS
*/ 
#include <iostream>
#include <cstring>
using namespace std;

 

#define MAX_LEN 1000

 

int main()
{
    string crypted_str;
    char decrypted_str[MAX_LEN];
    int str_len, depth, decrypted_index = 0;
    
    cin>>depth;
    cin>>crypted_str;
    
    if(depth == 1)
    {
        cout<<crypted_str;
        return 0;
    }
    str_len = crypted_str.length();
    int n = (str_len - 1)/(depth + (depth - 2));
    
    int col, row;
    for(col = 0; col < 2*n; col++)
    {
        int is_even_col = (col % 2) == 0;
        for(row = is_even_col ? 0 : (depth - 1); 
                  is_even_col ? (row < depth) : (row >= 0);
                  is_even_col ? row++ : row--)
        {
            int is_first_row = (row == 0);
            int is_last_row  = (row == (depth - 1));
            
            if(is_first_row && is_even_col && col != 0)
            {
             //   printf("Skipping - 1 %d %d\n", col, row);
                continue;
            }
            
            if(is_last_row && !is_even_col)
            {
             //   printf("Skipping - 2 %d %d\n", col, row);
                continue;
            }
            
            int elem_to_skip = is_first_row ? (col / 2) : (n - 1);
            elem_to_skip += is_last_row ? ((col + 1) / 2): 0;
            
            decrypted_str[decrypted_index++] = crypted_str[row * 2 * n + col - elem_to_skip];
        }
    }
    decrypted_str[decrypted_index] = '\0';

 

    // Remove the padded X
    int i;
    for(i = decrypted_index - 1; i >= 0; i--)
    {
        if(decrypted_str[i] != 'X')
        {
            decrypted_str[i + 1] = '\0';
            break;
        }
    }
    cout<<decrypted_str;
    
    return 0;
}