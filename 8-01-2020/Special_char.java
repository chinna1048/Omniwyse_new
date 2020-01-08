import java.util.*;
import java.io.*;
import java.util.regex.*;
public class Special_char
{
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
		Matcher matcher = pattern.matcher(str);
		ArrayList<String> arr = new ArrayList<String>();
		while(matcher.find())
		{
			arr.add(matcher.group());
		}
		System.out.println(arr.toString().replace("[","").replace("]","").replace(",",""));
	}
}