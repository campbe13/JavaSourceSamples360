//package fromslides.S08;

/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class SumNumbers
{
   public static void main(String[] args)
   {

   int n = 10;     // limit
   int sum = 0;   // sum
   int ctr = 0;   // counter
   
   while (ctr <= n) {
      sum += ctr;
      ctr++;
   }
   
   System.out.println("Sum of numbers up to: " + --ctr+ " is " + sum);
        
   } // main()
}    // SumNumbers