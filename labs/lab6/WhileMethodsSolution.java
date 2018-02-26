/** 
 * This class is the teacher's solution
 * for the loop exercises from lab6 
 * 
 * 
 * @author PMCampbell
 * @version today
 **/
    
import java.util.Scanner;

public class WhileMethodsSolution  {
   public static void main(String[] args) {
    int start, end, sum;
    
    start= 7;
    end = 23;
    sum = sumEven1(start,end);
    // exercise 1 accumulation
    System.out.printf("Sum of even numbers between %d and %d is %d\n", start, end, sum);
    
    start= 9;
    end = 45;
    // exercise 1 accumulation
    System.out.printf("Sum of even numbers between %d and %d is %d\n", start, end, 
            sumEven2(start,end));
    // exercise 2 input validation
    System.out.println("result "+enterWithinRange(start,end));
    // exercise 3 sentinal values & largest input
    System.out.println("largest "+largestEntered());
    // exercise 4  until false 
    System.out.println("smallestpow of 7 for 35 \n"
            + smallestPowerOf7(35));
} // end main()
/**
 * sum even numbers between  given start and end points
 * get the first even number in range then loop through 
 * all even numbers
 * 
 * @param int start   starting number for range
 * @param int end     ending number for range
 * @return int sum of even nos within the range
 */
    
public static int sumEven1(int start, int end) {
	int result = 0;
	int counter;

	//initialize counter to the first even number
	if (start%2 == 0)
		counter = start;
	else
		counter = start + 1;

	//loop and add even numbers
	while (counter <= end) 	{
		result = result + counter;
		counter = counter + 2;
	}
	return result;
}
/**
 * sum even numbers between  given start and end points
 * loop through all numbers (even and odd)
 * 
 * @param int start   starting number for range
 * @param int end     ending number for range
 * @return int sum of even nos within the range
 */

public static int sumEven2(int start, int end) {
	int result = 0;
	int counter;

	//loop and add even numbers
	while (start <= end) {
	    if (start%2 == 0 ) {
		    result += start;
	    }
	    start++;
	}
	return result;
}
/**
 * method to validate that an input number is within the range given
 * to the method as start and end points
 * 
 * @param int start   starting number for range
 * @param int end     ending number for range
 * @return int number within the given range
 */

public static int enterWithinRange(int start, int end) {
	int entry;
	Scanner kb = new Scanner(System.in);
	System.out.print("Enter a number between: " + start 
		+ " and " + end + ": ");
	entry = kb.nextInt();
	while (entry < start || entry > end) {
		System.out.print("C'mon! Enter a number between: "
			 + start + " and " + end + ": ");
		entry = kb.nextInt();
	}
	return entry;
}
/**
 * method to read in numbers until a sentinal is read in (-1)
 * as numbers are read in keep the largest
 * display it at end
 * 
 * @param none
 * @return int largest entered
 */
public static int largestEntered() {
	int largest;
	int current;
	Scanner kb = new Scanner(System.in);
	System.out.print("Enter first positive number ");
	current = kb.nextInt();
	//initialize largest to the first number
	// assume it is largest until you get something better
	largest = current; 
	while (current != -1) 	{
		System.out.print("Enter the next positive number, or -1 when done: ");
		current = kb.nextInt();
		if (current > largest) {
			largest = current;
		}
	}
	return largest;
}
/**
 * method given a number return the smallest power of 7
 * close to that number
 * 
 * @param num   (limit for power of 7)
 * @return int the power of 7
 */

public static int smallestPowerOf7(int num) {
	int counter = 0, result;
	while (Math.pow(7,counter) < num)
	{
		counter ++;
	}
	//counter now holds the smallest exponent
	//Math.pow returns a double, so cast to an int
	//n.b. this is safe because power's of 7 have no decimal components 
	result = (int) Math.pow(7, counter);
	return result;
}

} // end class