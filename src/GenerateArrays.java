import java.util.Random;

/**
 * Title: Generate Arrays
 * Desc:  Generates arrays for testing.
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
public class GenerateArrays {

	
	public ArrayObject generate(int num) {		
		Random generator = new Random();
		
		System.out.println("Generating " + num + " random ints... 0-100");
		
		// Instantiate array of size num
		int[] origArray = new int[num];
		// Generate random ints and add each to array
		for (int i = 0; i < num; i++) {
			origArray[i] = generator.nextInt(101);
		}
		
		// Initialize 2 new arrays sortedArray and reverseArray
		// Clone origArray to both
		int[] sortedArray = origArray.clone();
		int[] reverseArray = origArray.clone();
		
		// Generate ArrayObject object to return to main
		ArrayObject arrays = new ArrayObject(origArray, sortedArray, reverseArray);
		return arrays;
	}
	
}
