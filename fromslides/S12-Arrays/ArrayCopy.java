package fromslides.S13;
import java.util.Scanner;
public class ArrayCopy {
	public static void main(String[] args) {
		
			int array[]  = { 2, 4, 6, 8, 10 };
			int array2[];
			
			// shallow copy, both arrays refer to the same area in heap
			array2 = array;
			System.out.println("shallow copied array:"); 
			System.out.println("array[2] contains " + array[2]);
			System.out.println("array2[2] contains " + array2[2]);

			array[2] = 99;
			array2[2] = 5;
			System.out.println("after mod array[2] = 99 and array2[2] = 5");			
			System.out.println("array[2] contains " + array[2]);
			System.out.println("array2[2] contains " + array2[2]);

			// deep copy, different area in heap for each array
			System.out.println("deep copied array:"); 
			array2 = new int[5];
			for (int i = 0; i < 5; i++) {
				array2[i]  = array[i];
			}
			System.out.println("array[2] contains " + array[2]);
			System.out.println("array2[2] contains " + array2[2]);

			array[2] = 99;
			array2[2] = 15;
			System.out.println("after mod array[2] = 99 and array2[2] = 15");			
			System.out.println("array[2] contains " + array[2]);
			System.out.println("array2[2] contains " + array2[2]);
			
		} //main()
} // ArraySize