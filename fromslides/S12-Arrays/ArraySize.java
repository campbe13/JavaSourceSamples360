package fromslides.S13;
import java.util.Scanner;
public class ArraySize {
	public static void main(String[] args) {
			// declare and instantiate 
			// declare = (memory reserved for the address of the array)
			// instantiate = (memory reserved for the elements in the array)
	
			int numTests, tests[], sum=0, count;
			
			Scanner kb = new Scanner(System.in);
			
			System.out.print("How Many Tests? ");
			numTests = kb.nextInt();
			
			tests = new int[numTests];
			
			count = 0;
			while (count < tests.length) {
				System.out.printf("Mark for test #%d: ", count+1);
				tests[count] = kb.nextInt();
				count++;
			}  
			for (int i=0; i < tests.length; i++)  {
				sum += tests[i];
			}
			System.out.printf("Average %d of %d tests\n",
						sum/tests.length, tests.length);
			     
		} //main()
} // ArraySize