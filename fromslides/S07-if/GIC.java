import java.util.Scanner;
/**
 * Given the starting balance and years to invest as input
 * calculate the compound interest at the end.
 * @author PMC
 * @version lab4 2018
 * */
public class GIC
{
	public static void main (String[] args)
	{
		final double INTEREST_RATE = .075; 
	 	int years;
		double principle, finalBalance;
		Scanner keyboard = new Scanner(System.in );
		
		System.out.print("Please enter the amount to invest $ ");
		principle = keyboard.nextDouble();
		// give them 1 chance to enter valid data 
		if (principle < 1) {
			System.out.print("try again must be >= 1$ try:");
			principle = keyboard.nextDouble();
			if (principle < 1) {
				System.out.println("do you even read???");
				System.exit(1);    // usually a no-no
			}
		}			
		System.out.print("Please enter the years to invest  ");
		years = keyboard.nextInt();		
		// will not compile:  INTEREST_RATE = .095;
		if (years <= 0) {
			System.out.println("years must be > 0");
			System.exit(1);    // usually a no-no
		}
		
		finalBalance = principle * Math.pow(1 + INTEREST_RATE, years);
		System.out.println();
		System.out.println("Principle $"+ principle);
		System.out.println("Interest   "+ INTEREST_RATE);
		System.out.println("Result    $"+ finalBalance +
					" over years "+years);
		
		System.out.printf("Principle $%.2f\n", principle);
		System.out.printf("Interest %06.4f\n", INTEREST_RATE);
		System.out.printf("Result   $%.2f over years %d\n",
				finalBalance, years);
		
	}	
}
