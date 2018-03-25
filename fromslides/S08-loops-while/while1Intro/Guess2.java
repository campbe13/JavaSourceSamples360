import java.util.Scanner;

/**
 * This class illustrates exercises from the slide deck for the course
 * it uses a while loop with a sentinel
 * user guesses a number
 * as Guess1.java with a hint every 4 tries
 *
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class Guess2 {
   public static void main(String[] args) {
   final int SECRET_NUMBER = 535;
   int guess;
   Scanner kb = new Scanner(System.in);
   
   int count = 0;  
   
   // initialize the border condition variable
   System.out.print("Guess the secret number: ");
   guess = kb.nextInt();
   
   while (guess != SECRET_NUMBER)  {
      count++;     // count the attempts
      System.out.print("Guess again: ");
      guess = kb.nextInt();
      // hint every 4th attempt (same hint)
      if (count%4 == 0)  {
         System.out.println("3 digit number > 530");
      }
   
   }
   
   System.out.println("You got it! "+guess);
        
   } // main()
}    // CountDown