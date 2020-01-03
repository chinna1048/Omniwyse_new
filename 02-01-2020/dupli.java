import java.io.*;
import java.util.*;
public class dupli
{
	public static void main(String... arg)
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int arr[] = new int[n];
		int i,j=0;
		for(i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		
		}
		if (n==0 || n==1) 
		{
			System.out.print(n);
		}
        else
		{
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(arr[i]==arr[j])
					{
						arr[j]=arr[n-1];
						n--;
						j--;
					}		
				}
			}
			
		}		
		for(i=0;i<j;i++)
		{
			System.out.println("Original array "+arr[i]);
		}
	}
}