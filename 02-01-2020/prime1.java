import java.io.*;
import java.util.*;
public class prime1
{
	public static void main(String... arg)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count=0,i;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if(count==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not");
		}
	}
}