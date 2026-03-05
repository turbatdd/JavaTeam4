
// Solution to problem 3

package Lesson4;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] theArray = { 5, 2, 100, 50, 75, 12, 89, 51, 36, 28, 99 };
		System.out.println("Your array is: " + Arrays.toString(theArray));
		//theArray must be sorted
		Arrays.sort(theArray); 
		
		System.out.println("Your sorted array is: " + Arrays.toString(theArray));
		
		//print of the position of the target in a sorted array 
		
		System.out.println("The position of the target  in the sorted array:  "+ recursiveBinarySearch(theArray, 50));
		
	}
	
	static int recursiveBinarySearch(int[] myArray, int target) { 
	      return binarySearch(myArray, target, 0, myArray.length - 1);
	   }
	  
	//Helper method and the most important step in the recursive step
	   private static  int binarySearch(int[ ] a, int myTarget,  int lowerBound, int upperBound) {
	      if (lowerBound > upperBound) return -1; 
	      int midValue = (lowerBound + upperBound)/2;
	      if (a[midValue] == myTarget) return midValue;
	      else if (a[midValue] < myTarget)
	         return binarySearch(a, myTarget, midValue+1, upperBound); // perform binary search to the right of mid 
	      else
	         return binarySearch(a, myTarget, lowerBound, midValue-1);//perform binary search to the left of mid 
	   }
}


//OUTPUT 
/*
Your array is: [5, 2, 100, 50, 75, 12, 89, 51, 36, 28, 99]
Your sorted array is: [2, 5, 12, 28, 36, 50, 51, 75, 89, 99, 100]
The position of the target  in the sorted array:  5
 
 */


