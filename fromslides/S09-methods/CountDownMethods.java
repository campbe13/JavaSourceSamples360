//package fromslides.S09;
import java.util.Scanner;

/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class CountDownMethods {
   public static void main(String[] args) {

         int start;
         Scanner kb = new Scanner(System.in);

         // Get the starting point
         System.out.print("Count down from: ");
         start = kb.nextInt();
         countIt(start);
         
         System.out.println("End 1st countdown");
         
         // Get the starting point
         System.out.print("Count down from: ");
         start = kb.nextInt();
         countIt(start);
         
         System.out.println("Blastoff!");

      } // main()
   /**
   * This method displays the parameter and decrements it by one
   * until it reaches 0
   * 
   * 360-420-DW Intro to Java
   * @author PMCampbell
   * @version today
   * @param num int
   * @return void
   **/
   public static void countIt(int num) {

         while (num >= 0) {

            System.out.println(num);
            num--;

         }
      } // countIt()
} // CountDown