/**
 *
 * Working code skeleton for exercises to be done
 * with for loops and methods slide deck 11
 *
 *   nested for loop (algorithm first)
 *
 * 360-420-DW Intro to Java
 *
 *
 * @author your name goes here
 * @version  2018-02-??  (todays date goes here, delete this text)
 **/

public class ForExercise {
    public static void main(String[] args)  {
        // logic goes here & delete or replace this comment
        System.out.println("Brought to you by Dawson College");
        // TODO  draw the algorithm first for :
        // TODO modify the method to show the minutes (nested for)
        // TODO modify the method to have 2 params, hours to start & end


        showHours();
        // TODO advanced add seconds   (another level of nesting)
        // I will not demo this
	} // main()

   /**
	* show all hours in a 24 hour clock.
	*
	* 360-420-DW Intro to Java
	* @param   none
	* @return  void
	**/
	public static void showHours() {
	  for (int hours=0;hours <=24;hours++)  {
	      System.out.printf("Hour:%02d\n",hours);
	  }
	 } // showHours()


} // ForExercises
