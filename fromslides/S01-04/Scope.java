/**
 * This program can't find its variable.
 * @author Sybil N. Gineer
 * @version 1
 */

public class Scope
{
   public static void main(String[] args)
   {
      System.out.println(value);  // ERROR!
      int value = 100;
   }
}


