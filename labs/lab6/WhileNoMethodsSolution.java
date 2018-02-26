/** 
 * This class is the teacher's solution
 * for the loop exercises from lab6 
 * 
 * 
 * @author PMCampbell
 * @version today
 **/
    
import java.util.Scanner;

public class WhileNoMethodsSolution  {
   public static void main(String[] args) {
    int start, end, sum;
    
    start= 7;
    end = 23;
	int result = 0;
	int counter;
	
    // exercise 1 accumulation
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
    System.out.printf("Sum of even numbers between %d and %d is %d\n", start, end, result);
    
    // exercise 2 input validation
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

    System.out.println("result "+entry);

    // exercise 3 sentinal values & largest input
	int largest;
	int current;
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
    System.out.println("largest "+largest);
    
    // exercise 4  until false 
	counter = 0;
	int	num=35;
	while (Math.pow(7,counter) < num) {
		counter ++;
	}
	//counter now holds the smallest exponent
	//Math.pow returns a double, so cast to an int
	//n.b. this is safe because power's of 7 have no decimal components 
	result = (int) Math.pow(7, counter);
    System.out.println("smallestpow of 7 for 35 \n"
            + result);
} // end main()

} // end class