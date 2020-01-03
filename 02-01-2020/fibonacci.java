import java.io.*;
import java.util.*;
public class fibonacci
{
	static int[] method(int arr[],int n,int start)
	{
		int i,a=0,b=1;
		int first=0,second=0;
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
				if(arr[i]>start)
				{
					first=arr[i];
					second=arr[i+1];
					break;
				}
			}
		return new int[]{first,second};  
	}
	public static void main(String... arg)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int start = scan.nextInt();
		//int end = scan.nextInt();
		int arr[] = new int[n];
		int result[]=method(arr,n,start);
		System.out.println("First "+result[0]);
		System.out.println("second "+result[1]);
	}
}