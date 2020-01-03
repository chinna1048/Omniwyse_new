import java.io.*;
import java.util.*;
public class fib_range
{
	public static void main(String... arg)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int start = scan.nextInt();
		int end = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("-------Output-------");
		int i,a=0,b=1;
		int count=0;
		int incre=0;
		for(i=0;count!=1;i++)
		{
			arr[i]=a;
			int temp=a+b;
			a=b;
			b=temp;
			if(arr[i]>start && arr[i]<end)
			{
				System.out.println(arr[i]);
				incre=incre+1;
			}
			if(arr[i]>end || incre==n)
			{
				count=1;
			}
		}
		
	}
}