import java.io.*; 
import java.util.*;
class Solution
{ 
public static void main (String[] args)
   { 
       Scanner scan = new Scanner(System.in);
       int n=scan.nextInt();
       int q=scan.nextInt();
       int i,j,k;
       int arr[] = new int[n];
       for(i=0;i<n;i++)
       {
           arr[i]=scan.nextInt();
       }
      while(q)
      {
           int l=scan.nextInt();
           int r=scan.nextInt();
           for(i=l;i<=r;i++)
           {
               //arr[i] arr[r]  3456
               int z;
               int temp = new temp[(r+1)-l];
               for(z=0;z<(r+1)-l;z++)
               {
                   temp[z]=arr[l];
                   l++;
               }
               for(j=0;j<((r+1)-l)-1;j++)
               {
                   for(k=j+1;k=((r+1)-1)-j-1;k++)
                   {
                       if(temp[j]<temp[i+1])
                       {
                           int swap = temp[j];
                           temp[j] = temp[j+1];
                           temp[j+1]=swap;
                       }
                   }
               }
               int count=0;count1=0,count1=0;
               for(i=l,j=0,z=(r+1)-l;i<=r,j<(r+1)-l,z=0;i++,j++,z--)
               {
                   if(arr[i]==temp[j])
                   {
                        count=count+1;
                   }
                   if(arr[i]==temp[z])
                   {
                       count1=count+1;
                   }
                  
               }
               if((r+1)-l==count)
               {
                   System.out.println("YES");
               }
               else if((r+1)-l==count1)
               {
                   System.out.println("YES");
               }
               else
               {
                   System.out.println("NO");
               }
           }
           
           q--;
      }
   } 
}