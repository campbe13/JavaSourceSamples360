import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class Credit
{
   public static void main(String[] args)
   {
   final float MINIMUM_SALARY = 30000F;
   final int MINIMUM_YEARS = 2;
   
   Scanner keyboard = new Scanner(System.in);
   float salary;
   int years;
   
   System.out.print("Enter your salary: ");
   salary = keyboard.nextFloat();
   System.out.print("Enter years at the job: ");
   years = keyboard.nextInt();
   
   if ( salary >= MINIMUM_SALARY ) {
      if ( years >= MINIMUM_YEARS ) {
         System.out.println("Let's talk!");
         }
      else {
         System.out.println("You need 2 years at the job.");
         }
      }
   else 
      System.out.printf("You need a salary of > $%.2f", MINIMUM_SALARY);
   }
}