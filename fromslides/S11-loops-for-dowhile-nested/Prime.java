import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * determine if a number is prime
 * 
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class Prime {
    public static void main(String[] args) {
	    Scanner kb = new Scanner(System.in);
		boolean isPrime = true;
		int count =2, num = 0;
		System.out.println("Enter numbers to test for prime, <= 0 to exit");
		System.out.print("enter an integer: ");
		num = kb.nextInt();
		
		while (num >= 1 ) {
			count = 2;
			isPrime = true;	
			while (count <= Math.sqrt(num) &&  isPrime) {
				if (num % count==0) {
					isPrime = false;
				}
				count++;
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