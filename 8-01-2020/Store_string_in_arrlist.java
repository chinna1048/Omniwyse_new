import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Store_string_in_arrlist
{
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Pattern pattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = pattern.matcher(str);
		ArrayList<String> arr = new ArrayList<String>();
		while(matcher.find())
		{
			arr.add(matcher.group());
		}
		System.out.println(arr.toString().replace("[","").replace("]","").replace(",",""));
		System.out.println(arr.get(2));
		System.out.println(arr.size());
		
	}
}