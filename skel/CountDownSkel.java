import java.util.Scanner;

/**
 * This class is a skeleton for NASA's countdown program
 * 360-420-DW Intro to Java
 *
 * TODO
 *
 * @author PMCampbell
 * @version today
 **/
public class CountDownSkel  {
   public static void main(String[] args) throws InterruptedException   {

   int start;
   Scanner kb = new Scanner(System.in);

   // initialize the border condition variable
   System.out.print("Count down from: ");
   start = kb.nextInt();

   // TODO limit input to between 1-100


   // TODO a) put the countdown into a method  (limit param)
   //   b) use a for loop instead of while
   //   c)  modify the method to have start and end params
   //   d) add a string parameter for the message

   // TODO create a 2nd method to count up

   while (start >= 0)  {

      System.out.println(start);
      start--;
      Thread.sleep(1000);

   }

   System.out.println("Blastoff!");

   // TODO advanced ??   add Thread.sleep(1000);

   } // main()
}    // CountDownSkel
