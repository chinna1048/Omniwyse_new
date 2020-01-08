import java.io.*;
import java.util.*;
public class str_length
{
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		str_length_class len = new str_length_class();
		System.out.println(len.lengthOfString(str));
	}
}