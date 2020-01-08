/*
Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class clock_arr {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		while(testcase!=0)
		{
		   int n = scan.nextInt();
		   int clock = scan.nextInt();
		   int i,j,len=n-clock,k=0;
		   int arr[] = new int[n];
		   int temp[] = new int[n];
		  for(i=0;i<n;i++)
		  {
		      arr[i]=scan.nextInt();
		  }
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
		 //  for(i=0;i<n;i++)
		//	System.out.println("final sorted  "+arr[i]);
		//   System.out.println("length "+len);
		   for(i=0;i<len;i++)
		   {
		        temp[i]=arr[clock];
		        clock++;
		   }
		   for(j=len;j<n;j++)
		   {
		        temp[j]=arr[k];
		        k++;
		   }		   
		 for(i=0;i<n;i++)
		 {
			//System.out.print(temp[i]+" ");
			 arrlist.add(temp[i]);
		 }
		   testcase--;
		
		}		
	System.out.println("\n"+arrlist.toString().replace("[","").replace("]","").replace(","," "));

	}
}