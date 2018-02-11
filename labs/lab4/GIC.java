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
		double RATE = .075; 
	 	int years;
		double principle, finalBalance;
		Scanner keyboard = new Scanner(System.in );
		
		System.out.print("Please enter the amount to invest $ ");
		principle = keyboard.nextDouble();
		
		System.out.print("Please enter the years to invest  ");
		years = keyboard.nextInt();
		
		finalBalance = principle * Math.pow(1 + RATE, years);
		System.out.println();
		System.out.println("Principle $"+ principle);
		System.out.println("Interest   "+ RATE);
		System.out.println("Result    $"+ finalBalance);
	}	
}
