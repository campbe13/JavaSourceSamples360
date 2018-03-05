package fromslides.S11;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
    	Scanner keyboard = new Scanner(System.in);

int num;  // not initialized
do		
{
	// do while >= 1 iteration(s)
	// while  >= 0 iterations
	System.out.print("Enter an even number: ");
	num = keyboard.nextInt();
}
while (num %2 == 1);

} //main()
} // 