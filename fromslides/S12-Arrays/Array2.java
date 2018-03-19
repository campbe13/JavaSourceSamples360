import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 
 * Arrays
 * Parallel arrays
 * Declare, instantiate, initialize in one
 * 
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class Array2 {
	public static void main(String[] args) {
			// declare and instantiate 
			// declare = (memory reserved for the address of the array)
			// instantiate = (memory reserved for the elements in the array)
	
			int daysInMonth[] = {31, 28,31,30,31,30,31,31,30,31,30,31};
			int months[] = {1,2,3,4,5,6,7,8,9,10,11,12};
			String monthsString[] = { "Jan", "Feb", "Mar", "Apr", "May",
									"Jun", "Jul", "Aug", "Sep", "Oct",
									"Nov", "Dec"};
			int month;
			Scanner kb = new Scanner(System.in);
			
			System.out.print("Enter a month: ");
			month = (kb.nextInt() - 1);
			
			System.out.printf("%s has %d days\n", monthsString[month], daysInMonth[month]);
			
		} //main()
} //