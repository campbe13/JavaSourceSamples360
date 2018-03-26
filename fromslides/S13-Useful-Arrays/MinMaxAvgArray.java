import java.util.Scanner;

/**
 * Create an array, populate with random # 
 * get highest lowest average
 *
 * @author     pmc
 * @version    today
 */

public class MinMaxAvgArray {
	public static void main(String[] args) {
			int[] numbers = new int[50];
			int highest = numbers[0];
			int lowest = numbers[0];
			int total = 0; // Initialize accumulator
			double average; // Will hold the average
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = (int)(Math.random() * 100) + 1;
			}
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] > highest)
					highest = numbers[i];
				if (numbers[i] < lowest)
					lowest = numbers[i];
				total += numbers[i];
			}
			average = (double) total / numbers.length;
			System.out.println("Highest " + highest);
			System.out.println("Lowest " + lowest);
			System.out.println("Average " + average);
			if (checkDigit(numbers, 55)) {
				System.out.println("55 is in the array :)");
			}
			else {
				System.out.println("55 is not in the array :(");
			}
		} //end main method
    /**
     * check the array for th existence of the digit
     * @param  int array[] to be searched
     * @param  int digit find this digit in array
     * @returns boolean	found: true not found: false
     **/
	public static boolean checkDigit(int[] array, int digit) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == digit)
				return true;
		return false;
	}
} //end class
