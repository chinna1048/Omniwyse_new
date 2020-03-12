package Search;

import static org.junit.Assert.*;

import org.junit.Test;


public class UnitTesting {

	@Test
	public void test() {
		SearchInArray tester = new SearchInArray();
		int array[][]={ {1,10,20,40},
						{2,15,30,50},
						{3,45,60,70},
						{4,75,80,90} };

		int rowsLength=array.length;
		int columslength=array[0].length;
		
		assertEquals(true,(tester.passingTwoArguments(array,array[0][0])));
		assertEquals(true,(tester.passingTwoArguments(array,array[0][columslength-1])));
		assertEquals(true,(tester.passingTwoArguments(array,array[rowsLength-1][0])));
		assertEquals(true,(tester.passingTwoArguments(array,array[rowsLength-1][columslength-1])));

	
		assertEquals(false,(tester.passingTwoArguments(array,-1)));
		assertEquals(false,(tester.passingTwoArguments(array,100)));
		
		assertEquals(true,(	tester.passingTwoArguments(array,array[0][1]) &&
							tester.passingTwoArguments(array,array[0][2])   ));
		assertEquals(true,(	tester.passingTwoArguments(array,array[1][0]) &&
						    tester.passingTwoArguments(array,array[2][0]) ));
		assertEquals(true,( tester.passingTwoArguments(array,array[1][2]) &&
							tester.passingTwoArguments(array,array[2][2])  ));
		assertEquals(true,(	tester.passingTwoArguments(array,array[2][1]) &&
							tester.passingTwoArguments(array,array[2][2])  ));
		
		assertEquals(true,(tester.passingTwoArguments(array,array[1][1]) &&
				   tester.passingTwoArguments(array,array[1][2]) &&
				   tester.passingTwoArguments(array,array[2][1]) &&
			       tester.passingTwoArguments(array,array[2][2])));
		
		assertEquals(false,(tester.passingTwoArguments(array,123))); 
		
		//------------------------------------------------------ rows>columns
		int newColumn=columslength-1;
		assertEquals(true,(tester.passingTwoArguments(array,array[0][0])));
		assertEquals(true,(tester.passingTwoArguments(array,array[0][newColumn-1])));
		assertEquals(true,(tester.passingTwoArguments(array,array[rowsLength-1][0])));
		assertEquals(true,(tester.passingTwoArguments(array,array[rowsLength-1][newColumn-1])));
	
		assertEquals(false,(tester.passingTwoArguments(array,-10)));
		assertEquals(false,(tester.passingTwoArguments(array,149)));
		
		assertEquals(true,(	tester.passingTwoArguments(array,array[0][1])));
		assertEquals(true,(	tester.passingTwoArguments(array,array[1][0]) &&
							tester.passingTwoArguments(array,array[2][0]) )); 
		assertEquals(true,( tester.passingTwoArguments(array,array[1][2]) &&
							tester.passingTwoArguments(array,array[2][2])  ));
		assertEquals(true,(	tester.passingTwoArguments(array,array[2][1]) ));
		
		assertEquals(true,(tester.passingTwoArguments(array,array[1][1]) &&
		           tester.passingTwoArguments(array,array[2][1])));
		assertEquals(false,(tester.passingTwoArguments(array,159))); 
		
		//-------------------------------------- rows < columns
		
		int newRow=rowsLength-1;
		assertEquals(true,(tester.passingTwoArguments(array,array[0][0])));
		assertEquals(true,(tester.passingTwoArguments(array,array[0][columslength-1])));
		assertEquals(true,(tester.passingTwoArguments(array,array[newRow-1][0])));
		assertEquals(true,(tester.passingTwoArguments(array,array[newRow-1][columslength-1])));
		
		
		
		assertEquals(false,(tester.passingTwoArguments(array,-14)));
		assertEquals(false,(tester.passingTwoArguments(array,231)));
		
		assertEquals(true,(	tester.passingTwoArguments(array,array[0][1]) &&
							tester.passingTwoArguments(array,array[0][2]) ));
		assertEquals(true,(	tester.passingTwoArguments(array,array[1][0]) ));
		assertEquals(true,( tester.passingTwoArguments(array,array[1][2]) &&
				tester.passingTwoArguments(array,array[2][2])  ));
		assertEquals(true,(	tester.passingTwoArguments(array,array[2][1])));

		assertEquals(true,(tester.passingTwoArguments(array,array[1][1]) &&
							tester.passingTwoArguments(array,array[1][2])));
		
		assertEquals(false,(tester.passingTwoArguments(array,167))); 
		
		
	}

}