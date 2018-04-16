
import java.util.Scanner;

/**
 * ragged array loop
 *
 * @author     360 section 1
 * @version    2015-03-09
 */

public class RaggedFix {
    public static void main (String[] args) {
	
	int total;
	int num[]  = {{1,2,3,4}, {5,6,7}, 
	{9,10,11,12}};
	
	for (int col=0; col < num[0].length; col++)  {
		total= 0;
		for (int row=0; row < num.length; row++)  {
			total += num[row][col];
			  }  
			 
		System.out.println("Total col" + col +" is " + total);
	}
    } //end main method
} //end  class




