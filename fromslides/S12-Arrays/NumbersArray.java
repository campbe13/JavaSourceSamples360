// remove line or change packageName to reflect your directory structure
//package packageName;
// needed if using Scanner
import java.util.Scanner;
/**
 * read in 5 numbers give the sum/ average
 * using an array
 * @author P.M.Campbell
 * @version today
 **/

// reference == pointer == address
public class NumbersArray
{
   public static void main(String[] args)
   {
     //int num1, num2,num3,num4, num5;
     final int ARRAY_SIZE = 3;
     int num[];  // declare array (pointer in stack)
     int average=0, sum=0;
     Scanner kb = new Scanner(System.in);

	 num = new int[ARRAY_SIZE];  // instantiate array (space in heap)
     // read in 5 numbers
     // for ( init ; condition ; change cond )
	for (int i=0; i < ARRAY_SIZE ; i++) {
	    System.out.println("Enter a number:");
		num[i] = kb.nextInt();
		System.out.println("DEBUG: i: "+i +
				 " num[i] " + num[i] );
	    }
     // average  & sum
     for (int i=0; i < ARRAY_SIZE ; i++) {
		 sum += num[i];
     }
     average = sum/ARRAY_SIZE;
     System.out.println("Average "+average);
     System.out.println("Sum "+sum);

   } // main()
}  // Numbers class