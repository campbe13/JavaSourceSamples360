//package fromslides.S08;
import java.util.Scanner;

/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class CountDown100
{
   public static void main(String[] args)
   {
   
   int start;
   Scanner kb = new Scanner(System.in);
   
   // initialize the border condition variable
   System.out.print("Count down from: ");
   start = kb.nextInt();
   
   while (start < 1 || start > 100)  {
     System.out.print("We need a number between 1-100: ");
     start = kb.nextInt();
     
   }
   while (start >= 0)  {
      
      System.out.println(start);
      start--;
   
   }
   
   System.out.println("Blastoff!");
        
   } // main()
}    // CountDown