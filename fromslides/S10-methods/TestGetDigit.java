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

public class TestGetDigit {

    public static void main(String[] args) {
            int num, power, digit;

            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            num = keyboard.nextInt();
            System.out.print("Enter a digit to extract from integer 0-?: ");
            power = keyboard.nextInt();

            while (num > 0 && power > 0) {

                digit = getDigit(num, power);
                System.out.printf("Number %d digit %d value %d\n", num, power, digit);
                System.out.print("Enter an integer: ");
                num = keyboard.nextInt();
                System.out.print("Enter a digit to extract from integer 0-?: ");
                power = keyboard.nextInt();
            }
        } // main()

    /** 
     * Returns the digit in num 
     * in the position of power
     * 
     * @param num integer
     * @param power integer
     * @return digit in position power integer
     * @author PMCampbell
     * @version today
     * */

    public static int getDigit(int num, int pow) {
            // remove less sig digits
            int digit = num / (int) Math.pow(10, pow);
            // remove more sig digits
            digit = digit % 10;
            return digit;
        } // getDigit()

} // TestGetDigit
