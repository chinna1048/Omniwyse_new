import java.io.*;
import java.util.*;
public class larger_letters{
	public static void method(int n,String str)
	{
		System.out.println(n+" "+str);
		String temp[] = new String[n];
		int i,j;
		for(i=0;i<str.length();i++)
		{
			int count=0;
			for(j=0;j<str.length();j++)
			{
				if(str.charAt(i)<str.charAt(j))
				{
					count=count+1;
				}
			}
			System.out.println(count);
		}
	}
	public static void main(String... args)
	{	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine();
		method(n,str);
	}
} 
