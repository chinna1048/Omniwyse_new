import java.io.*;
import java.util.*;
import java.util.regex.*;
public class collect_words_from_paragraph_and_sort
{
	public static int strmethod(String a, String b)
	{
		int min=0,i,result=0;
		if(a.length()>=b.length())
			min=b.length();
		else
			min=a.length();
		for(i=0;i<min;i++)
		{
			if(a.charAt(i)>b.charAt(i))
			{
				result=1;
				break;
			}
			if(a.charAt(i)<b.charAt(i))
			{
				result=-1;
				break;         
			}
			else 
			{
				continue;
			}
		}
		return result;
	}
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Pattern p = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = p.matcher(str);
		int i=0;
		String st[] = new String[100];
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
			//st[k].compareTo(st[l])
				if(strmethod(st[k],st[l])>0)
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