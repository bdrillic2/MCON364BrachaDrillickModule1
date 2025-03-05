package codeSimpleSorts;

public class LinearSearch {
	
	public static boolean search(int[] vals, int target) {
		
		//iterate through array and compare each value to target value
		for(int i = 0; i < vals.length; i++) {
			
			//if found return true
			if(vals[i] == target) {
				return true;
			}
		}
		
		//else return false
		return false;
	}
	
}