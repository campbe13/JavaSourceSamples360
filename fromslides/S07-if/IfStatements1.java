package fromslides.S07;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class IfStatements1 
{
   public static void main(String[] args)
   {
   Scanner keyboard = new Scanner(System.in);
   int num1, num2, quotient, remainder;

   System.out.print("Enter an integer: ");
   num1 = keyboard.nextInt();
   
   if (num1 % 2 == 0) 
        System.out.println("Even number "+num1);
        else
        System.out.println("Odd number "+num1);
        
   System.out.print("Enter another integer: ");
   num2 = keyboard.nextInt();
   
   if (num1 > num2) 
        System.out.printf("%d is greater than %d\n", num1, num2);
        else
        System.out.printf("%d is greater than %d\n", num2, num1);
        
    if (num1 == num2) 
        System.out.printf("%d is equal to %d\n", num1, num2);
   
    if (num1 != num2)
        System.out.printf("%d is not equal to %d\n", num2, num1);
    
    if (num2 == 0)
        System.out.println("Division by 0 is a no no!");
    else {
        quotient = num1 / num2;
        System.out.printf("%05d / %05d = %05d\n", num1, num2, quotient);
        remainder = num1 % num2;
        System.out.printf("%05d %% %05d = %05d\n ", num1, num2, remainder);
    }
    
   }
}