/**
 * Class to test Dice class
 * 420-112-DW
 * methods
 * 
 * @author PMC
 * @version 2015-2016
 */
public class DoubleSix
{
//  Creates two Dice objects and rolls them both until double sixes 
   public static void main (String[] args)
   {
      int count = 0;
      int num1, num2;
      boolean doubleSix = false;

      Dice dice1 = new Dice();
      Dice dice2 = new Dice();

      System.out.println("7 11 here comes heaven! Vegas baby! ");
      
	  

      while(!doubleSix)
      {
         num1 = dice1.roll();
         num2 = dice2.roll();
         count++;
		 System.out.println("Dice 1 "+ num1 +" Dice 2 " + num2);
         if (num1 == 6 && num2 == 6)    // check for sixes
				doubleSix = true;

      }

      System.out.println ("Number of rolls: " + count);
   }
}