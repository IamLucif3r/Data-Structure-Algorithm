import java.util.*;
import java.lang.*;
import java.io.*;

class Q01Medium_Regex
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System. in);
        String inTxt = "";
		boolean exit = false;
		while (!exit) {
			String line = input. nextLine();
			if (line.equals("q")) {
				exit = true;
			} else {
				String newLine = "\n";
				switch ((int)(Math.random() * 100) % 3) {
					case 0:
					newLine = "\r\n";
					break;
					case 1:
					newLine = "\r";
					break;
					default:
					break;
				}
				inTxt = inTxt + line + newLine;
			}
		}
		String lines[] = inTxt.split("[\\r\\n]+");
		if (inTxt.equals("")) System.out.println(0);
		else System.out.println(lines.length);
	}
}
