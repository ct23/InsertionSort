import java.util.Arrays;

/**
 * Title: Tests
 * Desc:  Runs time tests user-specified number of times.
 */

/**
 * @author Colin
 * @date Jan 31, 2016
 *
 *
 * Modifications:
 * Date			Changes
 * 
 */
public class Tests {
	public void run(int arraySize, int numTests) {
		Sort sorter = new Sort();
		ReverseSort revSorter = new ReverseSort();
		GenerateArrays arrayGenerator = new GenerateArrays();
		long avgRandom = 0;
		long avgBest = 0;
		long avgWorst = 0;
		
		// Generate arrays
		ArrayObject arrays = arrayGenerator.generate(arraySize);
		int[] origArray = arrays.original;
		int[] sortedArray = arrays.sorted;
		int[] reverseArray = arrays.reverse;
		
		// Copy arrays, so as not to modify originals
		int[] usableOArray = origArray.clone();
		int[] usableSArray = sortedArray.clone();
		int[] usableRArray = reverseArray.clone();
		
		// Print original array, sorted array, and reverse sorted array.
		System.out.println("Original array (average input):\n" + Arrays.toString(origArray));
		long duration = sorter.regSort(sortedArray);
		System.out.println("Sorted array (best-case input):\n" + Arrays.toString(sortedArray));
		//System.out.println("Time to sort: " + duration);
		revSorter.revSort(reverseArray);
		System.out.println("Reverse sorted array (worst-case input):\n" + Arrays.toString(reverseArray));
		
		// Run tests specified number of times
		for (int i = 0; i < numTests; i++) {
			// Sort each array
			long avgSortTime = sorter.regSort(usableOArray);
			long bestSortTime = sorter.regSort(usableSArray);
			long worstSortTime = sorter.regSort(usableRArray);
			
			// Print all times
			System.out.println("\nAverage input: " + avgSortTime + "\tBest-case: " + bestSortTime
							   + "\t\tWorst-case: " + worstSortTime);
			
			// Add times to averages
			avgRandom += avgSortTime;
			avgBest += bestSortTime;
			avgWorst += worstSortTime;
			
			// Re-clone original arrays for next test
			usableOArray = origArray.clone();
			usableSArray = sortedArray.clone();
			usableRArray = reverseArray.clone();
		}
		
		// Calculate and print average times
		avgRandom = avgRandom / numTests;
		avgBest = avgBest / numTests;
		avgWorst = avgWorst / numTests;
		System.out.println("\nAverages:\nAverage input: " + avgRandom + "\tBest-case: " + avgBest
							   + "\tWorst-case: " + avgWorst);
		
	}
}
