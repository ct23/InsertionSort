/**
 * Title:
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

public class ReverseSort {
	/**
	 * 
	 * @param origArray		Original, unsorted array.
	 */
	public void revSort(int[] origArray) {
		int key;
		int i;
		for (int j = 1; j < origArray.length; j++) {
			key = origArray[j];						// represents object currently being sorted
			// Insert origArray[j] into sorted sequence origArray[1...j-1]
			i = j - 1;								// i is one space to the left of object being sorted (j)
			while (i >= 0 && origArray[i] < key) {
				origArray[i + 1] = origArray[i];	// move object right one
				i--;								// decrement i
			}
			origArray[i + 1] = key;					// place "key" object in proper place
		}
	}
	
}
