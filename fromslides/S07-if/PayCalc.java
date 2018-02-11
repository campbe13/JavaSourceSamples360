package fromslides.S07;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class PayCalc
{
   public static void main(String[] args)
   {
   // constants go at the top & must be ALLCAPS
   final float PAY_RATE = 10.25F;
   final float OVERTIME = 1.5F;
   final int REG_HOURS = 40;
   // variables first letter always lower case
   Scanner keyboard = new Scanner(System.in);
   int hours;
   float weeksPay;
   
   System.out.print("How many hours did you work this week:");
   hours = keyboard.nextInt();
   
   if (hours > REG_HOURS) 
        {
        weeksPay = PAY_RATE * OVERTIME * (hours - REG_HOURS);
        weeksPay += PAY_RATE * REG_HOURS;
        }
        else
        weeksPay = PAY_RATE * hours;
        
    System.out.printf("Hours %d Pay $%.2f\n", hours, weeksPay);
        
   }
}