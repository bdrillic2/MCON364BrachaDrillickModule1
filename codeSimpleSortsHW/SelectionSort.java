package codeSimpleSorts;

/**
 * Time complexity: O(N^2) in all cases
 * Space complexity: O(1)
 * This sorting algorithm is not efficient; each element in the array will perform comparisons with all the other remaining
 * unsorted methods in the array (O(N^2), regardless of whether the array has already been completely sorted.
 * In terms of memory, the amount of memory it takes up is fixed, and not greater than the data it is storing itself. Swaps are
 * performed within the space allocated for the array.
 */

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] testArray = {5, 3, 2, 4, 1};
		testArray = sort(testArray);
		for(int i = 0; i < testArray.length; i++) {
			System.out.print(testArray[i] + " ");
		}
	}
	
	public static int[] sort(int[] vals) {
	
		//iterate through each index of the array from the first to the second to last
		for(int i = 0; i < vals.length - 1; i++) {
			
			//set smallestIndex to the first initially to compare others against
			int smallestIndex = i;
			
			//use for loop to iterate through the rest of the values in array and compare against smallest index
			for(int j = i + 1; j < vals.length; j++) {
				
				//if value is smaller than current smallestIndex, reassign smallestIndex to the value's index
				if(vals[j] < vals[smallestIndex]) {
					smallestIndex = j;
				}
			}
			
			//swap index i with the smallestIndex
			int temp = vals[i];
			vals[i] = vals[smallestIndex];
			vals[smallestIndex] = temp;
			
		}
		
		return vals;
	}
	
}