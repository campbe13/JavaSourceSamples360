//package fromslides.S09;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class PassByValue {
    public static void main(String[] args)     {
    int number = 99;
    
    System.out.println("main: Number is "+number);
 
    changeMe(number); // Call changeMe
     
      // Display the value in number again
      System.out.println("main: number is " + number); // Display the value in number
   } // main()
   
   /**
    * The changeMe method accepts an argument and then
    * changes the value of the parameter
    * what really happens?
    * 
    * @param number int
      @author PMC
      @version today
   */
   public static void changeMe(int number)  {
      System.out.println("changeMe: I am changing the value.");
      number = 0;
      System.out.println("changeMe: Now the value is " + number);
   } //changeMe()
   
} // PassByValue