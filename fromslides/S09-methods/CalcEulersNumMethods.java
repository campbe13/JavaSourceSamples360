import java.util.Scanner;
/**
 * 
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * 
 * This is the same code from S08 but instead of all in the main() method we have methods
 * for factorial() and for eNumber()
 *
 * @author PMCampbell
 * @version today
 **/
 
public class CalcEulersNumMethods
{
    public static void main(String[] args)
    {
    
    Scanner keyboard = new Scanner(System.in);
	int prec=0;
    double euler, powr;
	System.out.println("Brought to you by Dawson College");
    
    while (prec < 1 || prec > 9) {
		System.out.print( "Enter number of digits precision : " );
		prec = keyboard.nextInt();
	}
    
    euler = eNumber(prec);
    System.out.println("Raw estimate\t\t\t" + euler);
    
    powr = Math.pow(10,prec);
    System.out.println("Precision rounded " + prec + 
		" digits estimate\t" + Math.round(euler*powr)/powr);
    
    } // main()
	/**
	* Calculate the factorial of x  return x!
	* non-recursive method
	*
	* @param   num
	* @return  num! (factorial)
	**/
    public static long factorial(int num) {
		int product = 1;
		int counter = 1;
    
		while (counter <= num) {
			product = product*counter;
			counter++;
			}
    return product;
    } // factorial()
    
    
	/**
	* Use Euler's method to calculate the natural log
	* https://en.wikipedia.org/wiki/Euler_method
	* non-recursive method
	*
	* @param   precision to be used for calc (power of 10)
	* @return  natural log
	**/
    public static double eNumber(int precision) { 
    double currentEstimate=1.0; 
    double previousEstimate =0.0; 
    double accuracy; 
    int counter = 1; 
     
	accuracy = Math.pow(10, -Math.abs(precision));
	// keep getting closer until the difference between
	// estimates is < 10^-precision
    while (Math.abs(currentEstimate-previousEstimate) 
		>= accuracy)    { 
        previousEstimate = currentEstimate; 
        currentEstimate = 
			currentEstimate + 1/(double)factorial(counter); 
        counter++; 
        } 
     
    return currentEstimate; 
    } // eNumber()
} // CalcEulersNumMethods class
