import java.util.Scanner;
/**
*  Square Root 
*
*  this solution does not use methods.
* 
*  @author PMC
*  @version 2017-02-14
*/
public class SqrtTableAll {
    public static void main(String[] args) {
    double x;
    
    System.out.println("Brought to you by Dawson College");
    
    System.out.println( "Problem with + 0.1\x \t\tSquare root x" );
	x = 0.1;
    while (x <= 2.0) {
        System.out.println( x + "\t\t" + Math.sqrt(x));
        x += 0.1; 
        }

    System.out.println( "Solution 1 Round it every time." );        
    System.out.println( "Solution 1\nx \t\tSquare root x" );
    x = 0.1;
    while (x <= 2.0) {
            System.out.println( x+"\t\t"+Math.sqrt(x));
            x = Math.round((x+0.1)*10)/10.0;
        }
        
	System.out.println( "Solution 2 Use an integer counter & divide every time." );
    System.out.println( "Solution 2\nx \t\tSquare root x" );
    counter = 1;
    while (counter <= 20) {
        x = counter/10.;
        System.out.println( x+"\t\t"+Math.sqrt(x));
        counter++; 
        }
    } // main()
} // class SqrtTableAll
