//package fromslides.S08;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class SumStartEndOdd
{
   public static void main(String[] args)
   {
   Scanner kb = new Scanner(System.in);
   
   int num1, num2;
   int end;          // end
   int start;        // start
   int sum = 0;      // sum
   int current;      // current number
   
   System.out.println("Sum Numbers");
   System.out.print("Starting at: ");
   num1 = kb.nextInt();
   System.out.print("Ending at: ");
   num2 = kb.nextInt();
   
   /* 
   * at first we make assumptions about input
   * and do not do  data validation
   * but then if there are errors code crashes
   * lets do a little validation 
   */
   start = Math.min(num1, num2);
   end = Math.max(num1, num2);
   
   // initialize border conditon
   current =  start;
   
   while (current <= end) {
      if (current %2 == 1) 
         sum += current;
      current++;
   }
   
   System.out.printf("Sum of odd numbers between %d and %d is %d\n",
         start, end, sum);
        
   } // main()
}    // SumNumbers