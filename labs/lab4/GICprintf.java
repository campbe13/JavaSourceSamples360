import java.util.Scanner;
/**
 * Given the starting balance and years to invest as input
 * calculate the compound interest at the end.
 * this is the same code as GIC but using printf to format
 * the output
 * @author PMC
 * @version lab4 2018
 * */
public class GICprintf  {
	public static void main (String[] args) {
		double RATE = .075; 
	 	int years;
		double principle, finalBalance;
		Scanner keyboard = new Scanner(System.in );
		
		System.out.print("Please enter the amount to invest $ ");
		principle = keyboard.nextDouble();
		
		System.out.print("Please enter the years to invest  ");
		years = keyboard.nextInt();
		
		finalBalance = principle * Math.pow(1 + RATE, years);
		
		System.out.printf("\nPrinciple $%.2f\n", principle);
		System.out.printf("Interest    %02.4f\n", RATE);
		System.out.printf("Result    $%.2f\n", finalBalance);
	}	
}
