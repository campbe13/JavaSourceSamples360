import java.util.Scanner;
/**
 * give them a credit card if 
 * both salary >= 30000 and years worked >= 2
 *
 * @author P.Campbell
 * @version today
 **/

public class DebtCard {
    public static void main(String[] args)   {
		final double MIN_SALARY = 30000;
		final int MIN_WORKED = 2;
		Scanner kb = new Scanner(System.in);
		int yearsWorked;
		double yearlySalary;
				  
		System.out.print("Salary: ");
		yearlySalary = kb.nextDouble();
		
		if (yearlySalary >= MIN_SALARY) {
			// modified: only ask for years worked if
			// minimum salary is valid  		
			System.out.print("Years Worked: ");
			yearsWorked = kb.nextInt();		
			if (yearsWorked >= MIN_WORKED) {
				System.out.println("You get a Visa");
			} else {
				System.out.println("No credit card");
			}
		} else {
			System.out.println("No credit card");
		}
		
        } // main
} //class