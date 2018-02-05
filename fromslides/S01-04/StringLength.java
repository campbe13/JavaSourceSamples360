/**
 * This program demonstrates the String class's length method.
 * @author Sybil N. Gineer
 * @version 1
 */

public class StringLength
{
   public static void main(String[] args)
   {
      String name = "Herman";
      int stringSize;

      stringSize = name.length();
      System.out.println(name + " has " + stringSize +
                         " characters.");
   }
}
