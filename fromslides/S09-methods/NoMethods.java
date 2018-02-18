//package fromslides.S08;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class NoMethods
{
    public static void main(String[] args)
    {
    int num1, num2, small, big;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Brought to you by Dawson College");
    
    // read in first integer
    System.out.print("Enter an integer: ");
    num1 =  keyboard.nextInt();
    
    // read in second  integer
    System.out.print("Enter an integer: ");
    num2 =  keyboard.nextInt();
    
    // find smallest of first and second integer
    if ( num1  > num2)
           small = num2;
        else 
           small = num1;
           
    System.out.printf("Given %d and %d \n", num1, num2);
          
    // display smallest of first and second integer     
    System.out.println("Smallest is "+ small);
    
    // find biggest of first and second integer
    if ( num1  > num2)
           big = num1;
        else 
           big = num2;
    // display biggest of first and second integer     
    System.out.println("Biggest is "+ big);
    
    System.out.println("Brought to you by Dawson College");

    } // main()
} // NoMethods
