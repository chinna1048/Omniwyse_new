import java.io.*;
import java.util.*;
public class collect_words_without_using_free_libraries
{
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int len=str.length();
		int i=0,j,count=1;
		String[] temp= new String[len];
		for(j=0;j<len;j++)
		{
			if(str.charAt(j)>=32 && str.charAt(j)<=64 || str.charAt(j)>=91 && str.charAt(j)<=96 || str.charAt(j)>=123 && str.charAt(j)<=127)
			{
				char ch=' ';
				String tempstr =String.valueOf(ch);
				temp[i]=tempstr;
				count=count+1;
				//String medari= new String(temp);
			}
			else
			{
				char ch=str.charAt(j);
				String tempstr =String.valueOf(ch);
				temp[i]=tempstr;
			}
			i++;
		}
		StringBuffer medari = new StringBuffer();
		for(j=0;j<i;j++)
		{
			medari.append(temp[j]);
		}
		String kumar=medari.toString();
		//System.out.println(kumar);
		StringBuffer one = new StringBuffer();
		String arr[] = new String[count];
		int n=0;
		for(j=0;j<kumar.length();j++)
		{
			if(kumar.charAt(j)!=32)
			{
				//System.out.print(" 32 : " +kumar.charAt(j));
				one.append(kumar.charAt(j));
			}			
			else if(kumar.charAt(j)==32 )
			{
				String ex=one.toString();
				arr[n]=ex;
				//System.out.println(arr[n]);
				one.delete(0,one.length());
				n++;
			}
			if(kumar.length()-1==j)
			{
				if(str.charAt(j)>='a' && str.charAt(j)<='z' || str.charAt(j)>='A' && str.charAt(j)<='Z' )
				{
					String ex=one.toString();
					arr[n]=ex;
					//System.out.println(arr[n]);
					one.delete(0,one.length());
				}
			}
		}
		int x;
		for(x=0;x<n;x++)
		{
			if(arr[x].length()>0)
			System.out.println(arr[x]);
		}
	}
}