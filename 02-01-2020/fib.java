import java.io.*;
import java.util.*;
public class fib
{
	public static void main(String... arg)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int start = scan.nextInt();
		int end = scan.nextInt();
		int arr[] = new int[n];
		int i,a=0,b=1;
		for(i=0;i<n;i++)
		{	
			if(i==0)
			{
				arr[i]=i;
			}
			else if(i==1)
			{
				arr[i]=i;
			}
			else
			{
				int res=a+b;
				a=b;
				b=res;
				arr[i]=res;
			}
		}
			for(i=0;i<n;i++)
			{
				if(arr[i]>start && arr[i]<end)
				{
					System.out.println(arr[i]);
				}
			}
	}
}