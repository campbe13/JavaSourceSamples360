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
public class NumbersArrayUserCount
{
   public static void main(String[] args)
   {
     //int num1, num2,num3,num4, num5;
     final int ARRAY_SIZE = 3;
     int entries;
     int num[];  // declare array (pointer in stack)
     int average=0, sum=0;
     Scanner kb = new Scanner(System.in);

	 System.out.print("How many numbers do you want to sum today? ");
	 entries = kb.nextInt();

	 num = new int[entries];  // instantiate array (space in heap)
     // read in 5 numbers
     // for ( init ; condition ; change cond )
	for (int i=0; i < entries ; i++) {
	    System.out.println("Enter a number:");
		num[i] = kb.nextInt();
		System.out.println("DEBUG: i: "+i +
				 " num[i] " + num[i] );
	    }
     // average  & sum
     for (int i=0; i < entries ; i++) {
		 sum += num[i];
     }
     average = sum/entries;
     System.out.println("Average "+average);
     System.out.println("Sum "+sum);

   } // main()
}  // Numbers class