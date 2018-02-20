//package fromslides.S09;
import java.util.Scanner;
/**
 * 
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * 
 * @author PMCampbell
 * @version today
 * 
 **/

public class PassingArgs {

    public static void main(String[] args) {
            double num1=10, num2=5;
            int num3=34, num4=45;
            double result = sumNums(num2, num1);
            System.out.println("main():\t\t num1 "+ num1 +"+ num2 "+num2+" = "+result);
            // this works because an int can fit into a double
            result = sumNums(num3, num4);
            System.out.println("main():\t\t num3 "+ num3 +"+ num4 "+num4+" = "+result);
    
        } // main()

    /** 
     * Returns the sum of the parameters
     * 
     * @param num1 double
     * @param num2 double
     * @return sum of num1 and num2 double
     * @author PMCampbell
     * @version today
     * */

    public static double sumNums(double num1, double num2) {
            double sum = num1+num2;
            System.out.print("sumNums():\t num1 "+num1+" + num2 "+num2);
            System.out.println(" = "+sum);
            return sum;
        } // sumNums()

} // PassingArgs
