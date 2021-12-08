// RECURSION: Permutation of a String
// Use recursion when you have problems with patterns like multiplication of numbers, factorial
/// or fabonicci series.
public class permutation {
    static void permutate(char[] letters, int position)
    {
        String[] ss = new String[100];

        for(int i=position;i<letters.length;i++)// when u have array we have a length attribute, when its string, then we have length().
        {

            // Base Condition
            if(position == letters.length-1)
            {
                //System.out.println(letters);
                ss[i] = letters;
                return;
            }
            // Now Swap the characters present at correct and to its adjacent.
            char temp;
            temp = letters[position];
            letters[position] = letters[i];
            letters[i] = temp;
            permutate(letters, position+1);
        }
        ss.sort();
        System.out.println();
    }
    public static void main(String args[])
    {
        String asy = "ANMOL";
        char letters[] = asy.toCharArray();
        permutate(letters,0);

    }
}
