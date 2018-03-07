import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * determine if a number is prime
 * 
 * using for 
 * 
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class PrimeFor {
    public static void main(String[] args) {
	    Scanner kb = new Scanner(System.in);
		boolean isPrime;
		int num;
		System.out.println("Enter numbers to test for prime, <= 0 to exit");
		System.out.print("enter an integer: ");
		num = kb.nextInt();
		
		// this is a sentinal loop, not appropriate to use for loop here
		while (num >= 1 ) {
			// cannot put this var in the for init as we use it outside
			isPrime = true;
			for (int count=2; count <= Math.sqrt(num) &&  isPrime; count++) {
				if (num % count==0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(num + " is prime");
			} 	else {
				System.out.println(num + " is NOT prime");
			}
			System.out.print("enter an integer: ");
			num = kb.nextInt();
		} 

	} //main()
} // Prime  