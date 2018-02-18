//package fromslides.S08;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class DataValidation
{
   public static void main(String[] args)
   {
   Scanner kb = new Scanner(System.in);
   double temperature;

   System.out.print("Enter temperature between -45 and 5: " );
   temperature = kb.nextDouble();    // init border variable before entering loop
   
   while (temperature < -45 || temperature > 5 ) {
      System.out.printf("%d is invalid, between -45 and 5: ", temperature );
      temperature = kb.nextDouble();    // modify border condition within  loop
   }
   
   System.out.println("Valid temperature: "+temperature);
        
   } // main()
}    // DataValidation