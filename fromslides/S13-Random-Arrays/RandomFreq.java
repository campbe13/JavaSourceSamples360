
import java.util.Scanner;

/**
 * Create an array, populate with random # between 1 & 6
 * gambling dice, 6 sided so values 1 through 6
 *
 * @author     360 section 1
 * @version    2015-03-09
 */

public class RandomFreq
{
    public static void main (String[] args)
    {
	//variable declarations
	int rand[];      //  space in stack for address
	rand = new int [1000];    // space in heap for 1000xints 

	// populate my array with random dice throws
	for (int index=0; index < rand.length; index++)  {
		rand[index]  = (int)(Math.random() * 6) + 1;
	}
	// test by populating the 0th element
	/*
	rand[0]  = (int)(Math.random() * 6) + 1;
	rand[1]  = (int)(Math.random() * 6) + 1;
	rand[2]  = (int)(Math.random() * 6) + 1;
	*/
	/*
	System.out.println("test 0th element " + rand[0]);
	System.out.println("test 1st element " + rand[1]);
	System.out.println("test 2nd element " + rand[2]);
	*/
	// display array forwards 0 to (1000 -1)
	for (int index=0; index < rand.length; index++)  {
		System.out.println("element "+index
		+" is "+rand[index]);
	}
	// display array backwards (1000-1) to 0
	for (int index=(rand.length-1); index >= 0; index--)  {
		System.out.println("element "+index
		+" is "+rand[index]);
	}
    } //end main method
} //end RandomFreq class




