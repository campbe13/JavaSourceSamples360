import java.util.Scanner;
/**
 * give them a credit card if 
 * both salary >= 30000 and years worked >= 2
 *
 * @author P.Campbell
 * @version today
 **/

public class DebtCard2 {
    public static void main(String[] args)   {
		final double MIN_SALARY = 30000;
		final int MIN_WORKED = 2;
		Scanner kb = new Scanner(System.in);
		int yearsWorked;
		double yearlySalary;
				  
		System.out.print("Salary: ");
		yearlySalary = kb.nextDouble();
		System.out.print("Years Worked: ");
		yearsWorked = kb.nextInt();		
			
		if (yearlySalary >= MIN_SALARY &&
			  yearsWorked >= MIN_WORKED) {
				System.out.println("You get a Visa");
			} else {
				System.out.println("No credit card");
			}
		
		
        } // main
} //class