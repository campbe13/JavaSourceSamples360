package fromslides.S11;
import java.util.Scanner;
public class For {
	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);

			// table of square of numbers 1 to 10
			System.out.println("Number   Number Squared");
			System.out.println("-----------------------");
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + "\t\t" + Math.pow(i, 2));
			}
			//equivalent while loop
			int i = 1;
			while (i <= 10) {
				System.out.println(i + "\t\t" + Math.pow(i, 2));
				i++;
			}
			// compound int
			double bal = 1000; // initial balance
			double rate = 0.08; // interest rate
			System.out.println("0 \t" + Math.round(100 * bal) / 100.);
			for (int year = 1; year <= 10; year++) {
				bal = bal + rate * bal;
				//System.out.println(year + " " + Math.round(100 * bal) / 100.);
				System.out.printf("%d \t%.2f\n", year,  Math.round(100 * bal) / 100.);
			}


		} //main()
} //