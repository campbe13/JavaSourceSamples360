import java.util.Scanner;

/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 *
 * while loops & methods
 *
 * @author PMCampbell
 * @version today
 **/
public class CountDown
{
   public static void main(String[] args)
   {
   
   int start;
   Scanner kb = new Scanner(System.in);
   
   // initialize the border condition variable
   System.out.print("Count down from: ");
   start = kb.nextInt();
   
   while (start >= 0)  {
      
      System.out.println(start);
      start--;
   
   }
   
   System.out.println("Blastoff!");
        
   } // main()
}    // CountDown