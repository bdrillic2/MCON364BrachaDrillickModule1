package codeSimpleSorts;

/**
 * Time complexity: O(N^2) (best case: O(N*))
 * Space complexity: O(1)
 * This sorting algorithm is generally not so efficient; each element in the array needs comparisons with all the other remaining
 * unsorted elements in the array (O(N^2). However, in the best case, the time complexity becomes much closer to O(N) if the array is nearly sorted, since an element
 * will stop performing comparisons with all other elements as soon as it is in its correct position.
 * In terms of memory, the amount of memory it takes up is fixed, and not greater than the data it is storing itself. Swaps are
 * performed within the space allocated for the array.
 */

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] testArray = {5, 3, 2, 1, 4};
		testArray = sort(testArray);
		for(int i = 0; i < testArray.length; i++) {
			System.out.print(testArray[i] + " ");
		}
	}
	
	public static int[] sort(int[] vals) {
		
		//iterate through array beginning with second index until last index
		for(int i = 1; i < vals.length; i++) {
			
			//assign i's value to j
			int j = i;
			
			//iterate through values before index i until i is in correct position
			while(j >= 1 && vals[j] < vals[j - 1]) {
				int temp = vals[j];
				vals[j] = vals[j - 1];
				vals[j - 1] = temp;
				j--;
			}
			
		}
		
		return vals;
	}
	
}