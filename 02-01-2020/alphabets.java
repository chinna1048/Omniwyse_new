import java.io.*;
import java.util.*;
import java.util.regex.*;
public class alphabets
{
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = p.matcher(str);
	}
}