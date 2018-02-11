// package fromslides.S07;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class Grades2
{
   public static void main(String[] args)
   {
   final int PASSGRADE = 60;
   final int AGRADE = 90;
   
   Scanner keyboard = new Scanner(System.in);
   int grade;
   
   System.out.print("Enter your grade: ");
   grade = keyboard.nextInt();
   
   // nested ifs
   if ( grade >= PASSGRADE )
         if ( grade >= AGRADE )
               System.out.println("You got an A!");
            else
               System.out.println("You passed!");
   else 
      System.out.println("You failed.");
         
   // else ifs
   if ( grade >= AGRADE )
      System.out.println("You got an A! :o");
   else if ( grade >= PASSGRADE )
               System.out.println("You passed! :)");
        else
               System.out.println("You failed :(");
        
   }
}