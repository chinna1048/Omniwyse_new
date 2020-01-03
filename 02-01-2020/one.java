import java.io.*;
import java.util.*;
public class one
{
	public static int method(int arr[],int n)
	{
		int i,sum=1;
		for(i=0;i<n;i++)
		{
			arr[i]=sum+arr[i];
			System.out.print(" "+arr[i]);
		}	
		return arr;
	}
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		int i=0;
		while(i<n)
		{
			arr[i]=scan.nextInt();
			i++;
		}
		method(arr,n);
		while(i<n)
		{
			System.out.println("   "+arr[i]);
			i++;
		}
	}
}