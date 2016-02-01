/**
 * Title: Array Object
 * Desc:  Object class to return multiple arrays.
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
public class ArrayObject {
	public final int[] original;
	public final int[] sorted;
	public final int[] reverse;
	
	public ArrayObject(int[] original, int[] sorted, int[] reverse) {
		this.original = original;
		this.sorted = sorted;
		this.reverse = reverse;
	}
}
