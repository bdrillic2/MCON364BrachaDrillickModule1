package codeSimpleSorts;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testSortsAndSearch {
	
	private Random random = new Random();
	private int[] randArray;
	private int[] sortedArray = new int[5];
	private int[] reverseSortedArray = new int[5];
	
	@BeforeEach
	void setup() {
		System.out.print("\nSetting up...");
		
		//create array of random length filled with random numbers
		randArray = new int[random.nextInt(25)];
		for(int i = 0; i < randArray.length; i++) {
			randArray[i] = random.nextInt(100);
		}
		
		System.out.print("\nRandom array: ");
		for(int i = 0; i < randArray.length; i++) {
			System.out.print(randArray[i] + " ");
		}
		
		//assign values to sorted and reverse sorted arrays
		sortedArray[0] = 1;
		sortedArray[1] = 2;
		sortedArray[2] = 3;
		sortedArray[3] = 4;
		sortedArray[4] = 5;
		
		System.out.print("\nSorted array: 1 2 3 4 5");
		
		reverseSortedArray[0] = 5;
		reverseSortedArray[1] = 4;
		reverseSortedArray[2] = 3;
		reverseSortedArray[3] = 2;
		reverseSortedArray[4] = 1;
		
		System.out.print("\nReverse sorted array: 5 4 3 2 1");
	}
	
	@Test
	void testBubbleSort() {
		System.out.print("\nTesting bubble sort...");
		
		//test on random array
		randArray = BubbleSort.sort(randArray);
		
		System.out.print("\nRandom array: ");
		for(int i = 0; i < randArray.length; i++) {
			System.out.print(randArray[i] + " ");
		}
		
		boolean randSorted = true;
		for(int i = 0; i < randArray.length - 1; i++) {
			if(randArray[i] > randArray[i + 1]) {
				randSorted = false;
			}
		}
		assertTrue(randSorted);
		
		//test on sorted array
		sortedArray = BubbleSort.sort(sortedArray);
		
		System.out.print("\nSorted array: ");
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
		
		boolean sortedSorted = true;
		for(int i = 0; i < randArray.length - 1; i++) {
			if(randArray[i] > randArray[i + 1]) {
				sortedSorted = false;
			}
		}
		assertTrue(sortedSorted);
		
		//test on reverse sorted array
		reverseSortedArray = BubbleSort.sort(reverseSortedArray);
		
		System.out.print("\nReverse sorted array: ");
		for(int i = 0; i < reverseSortedArray.length; i++) {
			System.out.print(reverseSortedArray[i] + " ");
		}
		
		boolean reverseSorted = true;
		for(int i = 0; i < randArray.length - 1; i++) {
			if(randArray[i] > randArray[i + 1]) {
				reverseSorted = false;
			}
		}
		assertTrue(reverseSorted);
	}
	
	@Test
	void testInsertionSort() {
		System.out.print("\nTesting insertion sort...");
		
		//test on random array
		randArray = InsertionSort.sort(randArray);
		
		System.out.print("\nRandom array: ");
		for(int i = 0; i < randArray.length; i++) {
			System.out.print(randArray[i] + " ");
		}
		
		boolean randSorted = true;
		for(int i = 0; i < randArray.length - 1; i++) {
			if(randArray[i] > randArray[i + 1]) {
				randSorted = false;
			}
		}
		assertTrue(randSorted);
		
		//test on sorted array
		sortedArray = InsertionSort.sort(sortedArray);
		
		System.out.print("\nSorted array: ");
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
		
		boolean sortedSorted = true;
		for(int i = 0; i < randArray.length - 1; i++) {
			if(randArray[i] > randArray[i + 1]) {
				sortedSorted = false;
			}
		}
		assertTrue(sortedSorted);
		
		//test on reverse sorted array
		reverseSortedArray = InsertionSort.sort(reverseSortedArray);
		
		System.out.print("\nReverse sorted array: ");
		for(int i = 0; i < reverseSortedArray.length; i++) {
			System.out.print(reverseSortedArray[i] + " ");
		}
		
		boolean reverseSorted = true;
		for(int i = 0; i < randArray.length - 1; i++) {
			if(randArray[i] > randArray[i + 1]) {
				reverseSorted = false;
			}
		}
		assertTrue(reverseSorted);
	}
	
	@Test
	void testSelectionSort() {
		System.out.print("\nTesting selection sort...");
		
		//test on random array
		randArray = SelectionSort.sort(randArray);
		
		System.out.print("\nRandom array: ");
		for(int i = 0; i < randArray.length; i++) {
			System.out.print(randArray[i] + " ");
		}
		
		boolean randSorted = true;
		for(int i = 0; i < randArray.length - 1; i++) {
			if(randArray[i] > randArray[i + 1]) {
				randSorted = false;
			}
		}
		assertTrue(randSorted);
		
		//test on sorted array
		sortedArray = SelectionSort.sort(sortedArray);
		
		System.out.print("\nSorted array: ");
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
		
		boolean sortedSorted = true;
		for(int i = 0; i < randArray.length - 1; i++) {
			if(randArray[i] > randArray[i + 1]) {
				sortedSorted = false;
			}
		}
		assertTrue(sortedSorted);
		
		//test on reverse sorted array
		reverseSortedArray = SelectionSort.sort(reverseSortedArray);
		
		System.out.print("\nReverse sorted array: ");
		for(int i = 0; i < reverseSortedArray.length; i++) {
			System.out.print(reverseSortedArray[i] + " ");
		}
		
		boolean reverseSorted = true;
		for(int i = 0; i < randArray.length - 1; i++) {
			if(randArray[i] > randArray[i + 1]) {
				reverseSorted = false;
			}
		}
		assertTrue(reverseSorted);
	}
	
	@Test
	void testLinearSearch() {
		System.out.println("Testing linear search...");
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {10, 20, 30, 40, 50};
		int[] arr3 = {5, 10, 15, 20, 25};

		boolean found = LinearSearch.search(arr1, 5);
		assertTrue(found);
		//this takes 5 comparisons as the target values is found in the 5th position
		
		found = LinearSearch.search(arr2, 5);
		assertFalse(found);
		//this takes 5 comparisons as the target values is not contained in the array so all positions must
		//be searched and in total there are 5
		
		found = LinearSearch.search(arr3, 5);
		assertTrue(found);
		//this takes 1 comparison as the target values is found immediately in the 1st position

	}
	
	
	
}