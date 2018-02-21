
import java.util.Scanner;
/**
 * 
 * Working code skeleton for exercises to be done 
 * with slide deck 8 - while looping
 * 
 * 360-420-DW Intro to Java
 * 
 * Examples of using a while loop & methods
 *
 * @author your name goes here
 * @version  2018-02-??  (todays date goes here, delete this)
 **/

public class WhileExerciseSolution {
    public static void main(String[] args)  {
		int num;
		Scanner kb = new Scanner(System.in);
        
        // logic goes here & delete or replace this comment
        System.out.println("Brought to you by Dawson College");
		System.out.print("Count down from: ");
        num = kb.nextInt();
        countDown(num);
        System.out.println("Blastoff!");         
        System.out.println("End 1st countdown");
        countDown(10);
		System.out.println("Blastoff!");        
        countDown(3);
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
   public static void countDown(int num) {

         while (num >= 0) {

            System.out.println(num);
            num--;

         }
      } // countIt()

} // WhileExercises
