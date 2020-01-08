import java.io.*;
import java.util.*;
public class arraylist1
{
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		int n=0;
		while(n<=2)
		{
			String str=scan.next();
			arr.add(str);
			n++;
		}
		System.out.println(arr.toString().replace("[","").replace("]","").replace(",",""));
	}
}