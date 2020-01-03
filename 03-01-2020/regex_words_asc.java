import java.io.*;
import java.util.*;
import java.util.regex.*;
public class regex_words_asc
{
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = p.matcher(str);
		int i=0;
		String st[] = new String[100];
		//List<String> st = new List<String>
		while(matcher.find())
		{
			st[i]=matcher.group();
			i++;
		}
		System.out.println(i);
		int j;
		
		int l,k;
		String temp;
		for(k=0;k<i;k++)
		{
			for(l=k+1;l<i;l++)
			{
				if(st[k].compareTo(st[l])>0)
				{
					temp=st[k];
					st[k]=st[l];
					st[l]=temp;
				}
			}
		}
		for(j=0;j<i;j++)
		{
			System.out.println(st[j]);
		}
	}
}