//package fromslides.S09;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class CalcPayAndOvertime
{
 
    public static void main(String[] args)
    {
    Scanner kb = new Scanner(System.in);
    double hours;
    double pay,overtime;

    System.out.print("Enter Hours worked: " );
    hours = kb.nextDouble();
    
    pay = calcRegPay(hours, 10);
    overtime = calcOvertime(hours, 10);
    
    System.out.printf("Your (regular)  pay is $%8.2f\n", pay );
    System.out.printf("Your (overtime) pay is $%8.2f\n", overtime );
    System.out.printf("Your (total)    pay is $%8.2f\n", pay+overtime );
    } // main()
    
    /** 
     * Given hours worked and pay rate, calculates overtime pay
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
    }  // calcRegPay()
    /** 
     * Given hours worked and pay rate, calculates overtime pay
     * overtime pay is time and a half
     * so payRate  * 1.5
     * 
     * @param hours double
     * @param rate double
     * 
     * @return pay amount double
     * @author PMCampbell
     * @version today
     * */
    
    public static double calcOvertime(double hours, double payRate) {
        double pay;
        
        if (hours > 40) {
            // ex: 45 hours overtime is: 5 * payRate *1.5
            pay = (hours - 40) * (payRate*1.5);
        } else {
            // ex: 35 hours overtime is: 0
            pay = 0;
        }
        return pay;
    }  // calcOvertime()
} // CalcPay
