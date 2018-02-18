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

public class SimpleMethods {

    public static void main(String[] args) {
            int num1, num2, minNum, maxNum;

            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            num1 = keyboard.nextInt();
            System.out.print("Enter an integer: ");
            num2 = keyboard.nextInt();

            minNum = min(num1, num2);
            maxNum = max(num1, num2);
            
            System.out.printf("Minimum %d Maximum %d\n", minNum, maxNum);
            
        } // main()

    /** 
     * Compares the two parameters 
     * returns the smallest of the two
     * 
     * @param a integer
     * @param b integer
     * @return smallest of a and b integer
     * @author PMCampbell
     * @version today
     * */
    
    public static int min(int a, int b) {
        int small;
        if ( a > b)
           small = b;
        else 
           small = a;
           
        return small;
    }  // min()
    
    /** 
     * Compares the two parameters 
     * returns the largest of the two
     * 
     * @param a integer
     * @param b integer
     * @return largest of a and b
     * @author PMCampbell
     * @version today
     * */
    
    public static int max(int a, int b) {
        int big;
        if ( a > b)
           big = a;
        else 
           big = b;
           
        return big;
    }  // max()
    
} // SimpleMethods

