package codeSimpleSorts;

/**
 * Time complexity: O(N^2)
 * Space complexity: O(1)
 * This sorting algorithm is not so efficient in all cases; each element in the array needs comparisons with all the other remaining
 * elements in the array (O(N^2). However, when a boolean flag is added which flags when the array is sorted, the time
 * complexity becomes much closer to O(N) if the array is nearly sorted (best case), due to the extra intermediate swaps which are performed.
 * In terms of memory, the amount of memory it takes up is fixed, and not greater than the data it is storing itself. Swaps are
 * performed within the space allocated for the array.
 */

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] testArray = {5, 3, 2, 1, 4};
		testArray = sort(testArray);
		for(int i = 0; i < testArray.length; i++) {
			System.out.print(testArray[i] + " ");
		}
	}
	
	public static int[] sort(int[] vals) {
		
		//create variables storing last index positions
		int lastIndex = vals.length - 1;
		
		//iterate through array beginning with each index position until the second to last
		for(int firstIndex = 0; firstIndex < vals.length - 1; firstIndex++) {
			
			//iterate through array from the end until the current firstIndex and perform bubble search comparisons
			for(int i = lastIndex; i > firstIndex; i--) {
				
				//if the value stored in i is less than the previous index's value, swap them
				if(vals[i] < vals[i - 1]) {
					int temp = vals[i];
					vals[i] = vals[i - 1];
					vals[i - 1] = temp;
				}
			}
		}
		
		return vals;
	}
	
}