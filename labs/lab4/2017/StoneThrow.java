import java.util.Scanner;

public class StoneThrow
{
	public static void main (String[] args)
	{
		int startSpeed;  	// v sub y0
		double time; 		// t
		double displacement; 	// delta y
		final double G = 9.8;    // in m/sec squared
		Scanner kb = new Scanner(System.in );
		
		System.out.print("Please enter initial speed of stone: ");
		startSpeed = kb.nextInt();
		System.out.print("Please enter time stone: ");	
		time = kb.nextDouble();
		
		// delta y = v sub y0 * t - 0.5 * 9.8 * t*t;

		displacement = startSpeed * time - 0.5 * G*time*time;

		System.out.printf("Starting speed: %d\nTime %.2f\nDisplacement: %.2f\n",
			startSpeed, time, displacement);
		 
	}	
}
