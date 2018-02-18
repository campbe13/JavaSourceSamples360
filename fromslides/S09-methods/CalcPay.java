//package fromslides.S09;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class CalcPay
{
 
    public static void main(String[] args)
    {
    Scanner kb = new Scanner(System.in);
    double hours;
    double pay;

    System.out.print("Enter Hours worked: " );
    hours = kb.nextDouble();
    
    pay = calcRegPay(hours, 10);
    
    System.out.printf("Your (regular) pay is $%.2f\n", pay );
    } // main()
    
    /** 
     * Given hours worked, calculates pay
     * 
     * @param hours double
     * @param rate double
     * 
     * @return pay amount double
     * @author PMCampbell
     * @version today
     * */
    
    public static double calcRegPay(double hours, double payRate) {
        double pay;
        
        if (hours > 40) {
            pay = 40* payRate;
        } else {
            pay = hours * payRate;
        }
        return pay;
    }  // calcRegPay
} // CalcPay
