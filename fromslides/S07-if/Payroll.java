//package fromslides.S06;
import java.util.Scanner;
/**
 * Calculate pay based on input hours
 * overtime after 40 hours (time & a half)
 *
 * @author P.Campbell
 * @version today
 **/

public class Payroll {
    public static void main(String[] args)   {
		final double REG_PAY = 10.0;
		final double OVERTIME_PAY = REG_PAY*1.5;
		final int REG_HOURS = 40;
		int hours;
		double pay;
		Scanner kb = new Scanner(System.in);
		
		//REG_PAY = 35;   // this will give a compile error

		System.out.print("Hours Worked: ");
		hours = kb.nextInt();
		
		if (hours > REG_HOURS) {
			pay = REG_HOURS * REG_PAY;
			// overtime
			pay += (hours - REG_HOURS) * OVERTIME_PAY;
		} else {
			pay = hours * REG_PAY;
		}
			// todo:  modify to display reg pay, 
			//        overtime pay
			//        total pay
		System.out.printf("Total Pay: $%.2f ", pay);
		
        }
}