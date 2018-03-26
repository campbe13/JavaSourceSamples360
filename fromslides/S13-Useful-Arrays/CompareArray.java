//package fromslides.S14;

import java.util.Scanner;

/**
 * Create an array,
 *
 * @author     pmc
 * @version    today
 */

public class CompareArray {
	public static void main(String[] args) {

			int[] firstArray = {2, 4, 6, 8, 10};
			int[] secondArray = {2, 4, 6, 8, 10 };
			boolean arraysEqual = true;
			int i = 0;
			
			// First determine whether the arrays are the same size.
			if (firstArray.length != secondArray.length)
				arraysEqual = false;
			showArray("firstArray", firstArray);
			showArray("secondArray", secondArray);
			// Next determine whether the elements contain the same data.
			while (arraysEqual && i < firstArray.length) {
				if (firstArray[i] != secondArray[i])
					arraysEqual = false; //exit loop as soon as two are not the same
				i++;
			}

			if (arraysEqual)
				System.out.println("The arrays are equal.");
			else
				System.out.println("The arrays are not equal.");
			
			changeArray(firstArray, 2, 99);
			showArray("firstArray", firstArray);
			showArray("secondArray", secondArray);
			
			i=0;
			while (arraysEqual && i < firstArray.length) {
				if (firstArray[i] != secondArray[i])
					arraysEqual = false; //exit loop as soon as two are not the same
				i++;
			}

			if (arraysEqual)
				System.out.println("The arrays are equal.");
			else
				System.out.println("The arrays are not equal.");
			
		} //end main method
		
		/**
		* change the array @ i to value
		* @param arry   integer array
		* @param i       integer index 
		* @param value   integer new value for array
		**/ 
		public static void changeArray(int arry[], int i, int value)   {
			// I can change the contents of the array
			// because I have the address (reference)
			// to the array data
			if (i > 0 && i < arry.length) 
			    arry[i]  = value;
		}    //changeArray()
		/**
		* display the array with a message 
		* @param name   message String  integer array
		* @param arry    integer array
		**/ 
		public static void showArray(String name, int arry[])   {
			System.out.println("\nArray: "+name);
			for (int i=0; i < arry.length; i++)
			   System.out.print("["+i+"] = "+ arry[i]+" ");
		}
		
} //end class
