import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class Main {
	public static void main(String [] args) {
		String date1,date2;
		Scanner sc = new Scanner(System.in);
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
		Date start,end;
		try {
			date1 = sc.nextLine();
			start = dateFormat.parse(date1);
			date2 = sc.nextLine();
			end = dateFormat.parse(date2);
			System.out.println(date1);
			System.out.println(date2);
		}
		catch(ParseException e) {
			System.out.println("Input dates should be in the format dd-MM-yyyy-HH:mm:ss");
		}
	}
}
