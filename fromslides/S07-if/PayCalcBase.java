import java.util.Scanner;
/**
 * This class is the base code for the exercise in the
 * slide deck
 *
 * It just calculates regular pay
 *
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 *
 **/
public class PayCalcBase  {
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      int hours;
      double weeksPay;
      // DEMO:
      // calculate overtime (if), use constants, use printf & fmt specifiers
      // nested if   & compound comparison ops
      System.out.print("How many hours did you work this week:");
      hours = kb.nextInt();

      weeksPay = 10.25 * hours;

      System.out.println("Hours " + hours + " Pay $" + weeksPay);

   }
}
