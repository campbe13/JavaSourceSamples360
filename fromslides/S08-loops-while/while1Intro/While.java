
import java.util.Scanner;
/**
 * 
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * 
 * Examples of using a while loop
 *
 * @author PMCampbell
 * @version today
 **/

public class While {
    public static void main(String[] args)  {
        
    final int MIN_TEMP = -45;
    final int MAX_TEMP = 5;
    
    int x;
    double temp;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Brought to you by Dawson College");
    
	// prime the border condition variable (temp)
    System.out.print("Windchill calculator: Enter temperature between " + MIN_TEMP + " and " + MAX_TEMP+ ": ");
    temp = keyboard.nextDouble();
	
    // data validation:
	// cannot escape the loop until a valid temp is given
    while (temp < MIN_TEMP || temp > MAX_TEMP) {
	    System.out.print("Invalid! Reenter temperature between " + MIN_TEMP + " and " + MAX_TEMP + ": ");
        temp = keyboard.nextDouble();
        }
    
    x = 20;
    while(x > 0) {
        System.out.println(x+" is greater than 0");
        x--;
        }
        
    
    int largest= 0;
    int count = 1;
    int num;
    while (count<= 5) {
        System.out.print("Enter a positive number " + count + ": ");
        num = keyboard.nextInt();
        if (num > largest)
        largest = num;
        count++;
        }
        System.out.println("Largest number entered " + largest);
    } // main()
} // While
