import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * This is the solution see PayCalc for the starter code
 * 
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 * 
 **/
public class PayCalcSolution {
   public static void main(String[] args)    {
   // constants go at the top & must be ALLCAPS and underscores
   final double PAY_RATE = 10.25;
   final double OVERTIME = 1.5;
   final int REG_HOURS = 40;
   // variables next first letter always lower case, the rest camel case
   Scanner keyboard = new Scanner(System.in);
   int hours;
   double regularPay; 
   
   System.out.print("How many hours did you work this week: ");
   hours = keyboard.nextInt();
   
   if (hours > REG_HOURS) {
        regularPay   = PAY_RATE * OVERTIME * (hours - REG_HOURS);
        regularPay += PAY_RATE * REG_HOURS;
   } else {
       regularPay = PAY_RATE * hours;
   } 
   
   // CHALLENGE:   modify to dispaly overtime pay, regular pay and total pay
   
   
    // using println    
    System.out.println("Hours " + hours + " Pay $" + regularPay);
    // using printf
    System.out.printf("Hours %d Pay $%.2f\n", hours, regularPay);
   }
}