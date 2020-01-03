import java.io.*;
import java.util.*;
public class primerec

{
	static int count=0;
	static int fun(int n,int i)
	{
		if(i<n)
		{
			if(n%i==0)
			{
				System.out.println("if side "+i);
				count=count+1;
				return(fun(n,(i=i+1)));
			}
			else
			{
				System.out.println("else side "+i);
				return(fun(n,(i=i+1)));
			}
		}
		return count;
	}
	public static void main(String... arg)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=2;
			if(fun(n,i)==0)
			{
				System.out.println("Prime number ");
			}
			else
			{
				System.out.println("Not Prime number");
			}
	
	}
}