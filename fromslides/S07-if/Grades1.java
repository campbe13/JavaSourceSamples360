package fromslides.S07;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class Grades1
{
   public static void main(String[] args)
   {
   final int PASSGRADE = 60;
   
   Scanner keyboard = new Scanner(System.in);
   int grade;
   
   System.out.print("Enter your grade: ");
   grade = keyboard.nextInt();
   
   if ( grade >= PASSGRADE )
      System.out.println("You passed :)");
   else
      System.out.println("You failed :(");
        
   }
}