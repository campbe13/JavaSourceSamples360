//package fromslides.S08;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class SimpleMethods2
{
 
    public static void main(String[] args)
    {
    int num1, num2;
    
    message("Teachers");

    num1 = readInt();
    num2 = readInt();
    
    showMinMax(num1, num2);
    
    message("P. M. Campbell");
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
    
    /** 
     * Displays the numbers given as params
     * Determines the smallest of the two and  displays it
     * Determines the largest of the two and displays it
     * 
     * @param num1 int
     * @param num2 int
     * @author PMCampbell
     * @version today
     * */
    
    
    public static void showMinMax(int num1, int num2) {
        System.out.printf("Given %d and %d\n", num1, num2);
        System.out.println("Smallest is "+ min(num1,num2));
        System.out.println("Biggest is "+ max(num1,num2));
    }  // showMinMax()
    
    /** 
     * Displays a prompt, reads in an int 
     * 
     * @return int
     * @author PMCampbell
     * @version today
     * */
    
    public static int readInt() {
        int num;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        num =  keyboard.nextInt();
        return num;
        
    }  // readInt()
    
    /** 
     * Displays a message
     * 
     * @param programmer name String
     * @author PMCampbell
     * @version today
     * */

    public static void message(String programmer) {
        System.out.println("Brought to you by Dawson College "+programmer);
    }  // message()
} // SimpleMethods2
