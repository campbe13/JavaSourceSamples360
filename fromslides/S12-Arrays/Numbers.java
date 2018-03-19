// remove line or change packageName to reflect your directory structure
//package packageName;
// needed if using Scanner
import java.util.Scanner;
/**
 * read in 5 numbers give the sum/ average
 * @author P.M.Campbell
 * @version today
 **/

public class Numbers
{
   public static void main(String[] args)
   {
     int num1, num2,num3,num4, num5;
     Scanner kb = new Scanner(System.in);

     // read in 5 numbers
     // for ( init ; condition ; change cond )
     // for (int i=0; i < 5 ; i++) {
		 System.out.println("Enter 5 numbers:");
		 num1 = kb.nextInt();
		 num2 = kb.nextInt();
		 num3 = kb.nextInt();
		 num4 = kb.nextInt();
		 num5 = kb.nextInt();
     // average  & sum
     System.out.println("Average "+
            (num1+num2+num3+num4+num5)/5);
     System.out.println("Sum "+
            (num1+num2+num3+num4+num5) );
   } // main()
}  // Numbers class