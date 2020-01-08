/*
Example:
Input:
2
6
7 10 4 3 20 15
3
5
7 10 4 20 15
4

Output:
7
15
*/

import java.util.*;
import java.lang.*;
import java.io.*;
public class kth_element
{
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		while(testcase!=0)
		{
		   int n = scan.nextInt();
		   int i,j;
		   int arr[] = new int[n];
		  for(i=0;i<n;i++)
		  {
		      arr[i]=scan.nextInt();
		  }
		   int last=scan.nextInt();
		  for(i=0;i<n;i++)
		  {
		      for(j=0;j<n-i-1;j++)
		      {
		          if(arr[j]>arr[j+1])
		          {
		              int swap=arr[j];
		              arr[j]=arr[j+1];
		              arr[j+1]=swap;
		          }
		      }
		   }
		   arrlist.add(arr[last-1]);
		   testcase--;
		}	
		System.out.println(arrlist.toString().replace("[","").replace("]","").replace(" ","").replace(",","\n"));
	}
}