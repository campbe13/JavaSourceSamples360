package labexercises;

import java.util.Scanner;

/**
 * Create an array, populate with random # between 1 & 6
 * Create a second array to contain the frequency of the random numbers
 * using switch
 * Walk through the random number array to and count the frequency
 * of the random numbers in the frequency array
 *
 * @author     360 section 1
 * @version    2015-03-09
 */

public class RandomFreq2
{
    public static void main (String[] args)
    {
	//variable declarations
	int rand[];			     	// space in stack for address
	int freq[] = new int [6]; 	// space in stack for address and space in heap for 6 ints
	rand = new int [1000];  	// space in heap for 1000 ints

	// populate my array
	for (int index=0; index < rand.length; index++)  {
		rand[index]  = (int)(Math.random() * 6) + 1;
	}
	// check for frequence using switch

	for (int index=0; index < rand.length; index++)  {
		switch (rand[index]) {
			case 6:	freq[5]++;
					break;
			case 5: freq[4]++;
					break;
			case 4: freq[3]++;
					break;
			case 3: freq[2]++;
					break;
			case 2: freq[1]++;
					break;
			case 1: freq[0]++;
					break;
			default: System.out.println("Logic error, should never get here ");
					break;
		}  // switch
 } // for
	// display frequency array from highest to lowest
	for (int index=freq.length-1; index >= 0; index--)
		System.out.println("Frequency of " + (index+1) +" is " + freq[index]);

    } //end main method
} //end RandomFreq2 class




