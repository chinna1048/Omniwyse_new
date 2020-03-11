package com.settings;

import java.util.*;
import java.io.*;
public class SearchInArray {
	public static boolean methodSearching(int array[][],int search, int first,int last)
	{
		if(last ==first && array[first][last] != search)
			return false;
		else if(array[first][last] == search)
			return true;
		else if(array[first][last] < search)
			return methodSearching(array,search,first+1,last);
		else if(array[first][last] > search)
			return methodSearching(array,search,first,last-1);
		return false ;
	}
	public static boolean passingTwoArguments(int array[][],int search)
	{
		return methodSearching(array,search,0,2);
	}
	public static void main(String... args)
	{
		int array[][]={{1,10,20},{2,15,40},{3,45,60}};
		System.out.println(passingTwoArguments(array,15));
	}
}