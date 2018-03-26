package fromslides.S14;

import java.util.Scanner;

/**
 * Create an array,
 *
 * @author     pmc
 * @version    slide deck 14
 */

public class ReturnArray {
	public static void main(String[] args) {

			int[] result = extractDigits(12345);
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		} //end main method

	public static int[] extractDigits(int num) {
			int[] result = new int[5];

			for (int i = 0; i < result.length; i++) {
				result[i] = num / (int) Math.pow(10, i) % 10;
			}
			return result;
		} // extractDigits()

} //end class
