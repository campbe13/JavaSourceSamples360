//package fromslides.S09;
import java.util.Scanner;

/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 *
 * @author PMCampbell
 * @version today
 **/
public class CountDownMethods2 {
   public static void main(String[] args) {
		 final int LIMIT = 100;
         int start;
         
         // Get the starting point
		 start = getStartingPoint(LIMIT);
		 countIt(start);
         
         System.out.println("End 1st countdown");
         
		 // get the starting point but no intermediate
		 // variable pass it straight to the countIt method
         countIt(getStartingPoint(LIMIT));
         
         System.out.println("Blastoff!");

      } // main()
   /**
   * This method displays the parameter and decrements it by one
   * until it reaches 0
   * 
   * @param num int
   * @return void
   **/
   public static void countIt(int num) {

         while (num >= 0) {

            System.out.println(num);
            num--;

         }
      } // countIt()
	/**
   * This method gets input to start the countdown 
   * but it must be < the limit given to the method.
   *
   * @param limit   maximum for the countdown 
   * @return int   count down starting point
   **/
	public static int getStartingPoint(int limit) {
		 Scanner kb = new Scanner(System.in);
		 int start = 0;
		 
		 while (start <1 || start >limit) {
			System.out.print("Count down from (<="+limit+") :");
			start = kb.nextInt();
         }
		 return start;
	} // getStartingPoint()
} // CountDown class