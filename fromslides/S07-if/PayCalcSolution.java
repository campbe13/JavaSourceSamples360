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
   double regularPay,overtimePay, totalPay; 
   
   System.out.print("How many hours did you work this week: ");
   hours = keyboard.nextInt();
   if (hours > 0) {
      if (hours > REG_HOURS) {
         overtimePay   = PAY_RATE * OVERTIME * (hours - REG_HOURS);
         regularPay = PAY_RATE * REG_HOURS;
         totalPay = regularPay + overtimePay;
         System.out.println("Hours " + hours + " Pay $" + totalPay);
         // printf instead of println
         System.out.printf("Hours %d Pay $%.2f Overtime included %.2f\n", hours, totalPay, overtimePay);
      } else {
         regularPay = PAY_RATE * hours;
         System.out.println("Hours " + hours + " Pay $" + regularPay);
      } 
   } else { 
      System.out.println("Invalid input hours: " + hours); 
   }
} // end main()
} // end PayCalcSolution class