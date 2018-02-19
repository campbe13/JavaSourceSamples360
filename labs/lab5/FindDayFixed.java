import java.util.Scanner;

public class FindDayFixed
{
	public static void main (String[] args)
	{
		int day;
		Scanner keyboard = new Scanner(System.in );
		
		System.out.print("Please enter the day of week (between 1 and 7): ");
		day = keyboard.nextInt();
		
		if ( day  < 1 || day  > 7)  {
			System.out.println("Sorry, I cannot convert into a day");
			System.out.println("Please restart the program");
			}
		else if ( day==1 )
			System.out.println("Sunday");
		else if ( day == 2 )
			System.out.println("Monday");
		else if ( day == 3 )
			System.out.println("Tuesday");
		else if ( day == 4 )
			System.out.println("Wednesday");
		else if ( day == 5 )
			System.out.println("Thursday");
		else if ( day == 6 )
			System.out.println("Friday");
		else 
			System.out.println("Saturday");
	}	
}
