//package fromslides.S15;

import java.util.Scanner;

/**
 * Create a 2d array, sum it
 *
 * @author     pmc
 * @version    slide deck 15
 */

public class ArraySum2d {
    public static void main(String[] args) {
        int[][] numbers = {
                { 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12}
            };
        
        System.out.println("Total of array is " + sumArray(numbers));

    } // end main
    /**
     * Return the sum of a given array
     * 
     * @param 2 d array
     * @return int sum of the array
     **/
     public static int sumArray(int array[][]) {
        int total, totalAll=0;
        for (int row = 0; row < array.length; row++) {
            total = 0;
            for (int col = 0; col < array[row].length; col++) {
                total += array[row][col];
            }
            System.out.println("Total of row " + row + " is " + total);
            totalAll += total;
        }
        return totalAll;
     } // sumArray()
} // end class
