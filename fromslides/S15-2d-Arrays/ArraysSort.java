package fromslides.S15;

import java.util.Scanner;

/**
 * Create an array, populate with random #
 * get highest lowest average
 *
 * @author     pmc
 * @version    slide deck 15
 */

public class ArraysSort {
    public static void main(String[] args) {
            int array1[] = createRandom(5, 1, 10);
            System.out.println("Before sort");
            display(array1);
            sortAscending(array1);
            System.out.println("After sort");
            display(array1);
        } // end main

    public static int[] createRandom(int length, int minimum, int maximum) {

            // create the array.
            int[] rand = new int[length];

            //variables
            int scalingFactor = maximum - minimum + 1;

            // assign a random value to all elements in the array
            for (int i = 0; i < rand.length; i++) {
                rand[i] = (int)(Math.random() * scalingFactor) + minimum;
            }

            //return the array
            return rand;
        } // createRandom()


    public static void display(int[] intArray) {
            for (int i = 0; i < intArray.length; i++)
                System.out.println(intArray[i]);
        } // display()
    public static void sortAscending(int[] array) {
            int start;
            int small;
            int temp;
            int i;
            for (start = 0; start < array.length; start++) {
                small = start;
                for (i = start + 1; i < array.length; i++) {
                    if (array[i] < array[small])
                        small = i;
                }
                temp = array[start];
                array[start] = array[small];
                array[small] = temp;
            }
        } // sortAscending()
} // end class
