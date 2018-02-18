//package fromslides.S08;
import java.util.Scanner;

/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class Guess1
{
   public static void main(String[] args)
   {
   final int SECRET_NUMBER = 535;
   int guess;
   Scanner kb = new Scanner(System.in);
   
   // initialize the border condition variable
   System.out.print("Guess the secret number: ");
   guess = kb.nextInt();
   
   while (guess != SECRET_NUMBER)  {
      
      System.out.print("Guess again: ");
      guess = kb.nextInt();
   
   }
   
   System.out.println("You got it!");
        
   } // main()
}    // CountDown