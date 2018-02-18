//package fromslides.S08;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class Largest
{
   public static void main(String[] args)
   {
   Scanner kb = new Scanner(System.in);
   
   int largest = 0;
   int count = 1;
   int num;        // input
   
   System.out.println("Largest Number");
   while (count <= 5) {
      System.out.print("Enter +ve number "+ count +":");
      num = kb.nextInt();   
      if (num > largest) {
         largest = num;
      }
      count++;
   }
      
   System.out.println("The largest number is "+largest);

   } // main()
}    // SumNumbers