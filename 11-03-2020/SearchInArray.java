package Search;

public class SearchInArray {
	public static boolean methodSearching(int array[][],int search, int first,int last)
	{
		int row = array.length;
		int column = array[0].length;
		 
		if (array[first][last] == search) {
			return true;
		} 
		else if(array[0][0] > search ) {
			return false;
		}
		else if(array[row-1][column-1] < search) {
			 return false;
		}
		else if (first == row && last == column  && array[first][last] != search) {
			return false;
     	} 
		else if(array[first][last] < search)
			return methodSearching(array,search,first+1,last);
		else if(array[first][last] > search)
			return methodSearching(array,search,first,last-1);
		return false ;
	}
	public static boolean passingTwoArguments(int array[][],int search)
	{
    		return methodSearching(array,search,0,array[0].length-1);
	} 
	
	public static void main(String... args)
	{
		int array[][]={ {1,10,20,40},
						{2,15,30,50},
						{3,45,60,70},
						{4,75,80,90} };
		System.out.println(passingTwoArguments(array,45));
//		int length1 = array.length ; //-->  returns the length of the rows in the array
//		int length = array[0].length; // -->  returns the length of the columns in the array
	 }
}