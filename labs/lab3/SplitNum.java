//package lab3;
/** 
 * This class reads in a 3 digit whole number and manipulates it into 
 * the component digits:
 * 321 => 3,2,1
 * @author PMCampbell
 * @version today
 **/
    
import java.util.Scanner;

public class SplitNum
{
   public static void main(String[] args)
   {
        int number, d1, d2, d3;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a 3 digit whole number: ");
        number = kb.nextInt();
        
        // 123/100 =>  1 remainder 23
        // 123/10  =>  12 remainder 3
        // 123/1   =>  123 remainder 0   (DO NOT DO this, no need to divide nor mod by 1)
        
        d1 = number / 100;              //  123/100 => 1  
        d2 = (number % 100) / 10;       //  123%100 => 23   23/10 => 2
        d3 = number % 10 ;              //  123%10 => 3
    
        System.out.print("The digits are "+d1);
        System.out.print(", "+d2);
        System.out.println(", and "+d3);
    
    } // main
}  // SplitNum
