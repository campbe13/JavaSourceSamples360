import java.util.Scanner;
/**
*  Calculate Euler's Number 
*  ask the user for the number of digits of precision.
*
*  this solution does not use methods.
* 
*  @author PMC
*  @version 2017-02-14
*/
public class CalcEulersNum {
    public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
	double currentEstimate=1.; 
    double previousEstimate =0.; 
    double accuracy; 
    double euler;
    int prec = 0,counter = 1; 
    
	System.out.println("Brought to you by Dawson College\nCalculate Euler's number");
    
	// data validation, must be between 1-15 inclusive
	while (prec < 1 || prec > 9) {
		System.out.print( "Enter number of digits precision 1-9: " );
        prec = kb.nextInt();
    }
	// accuracy will be used to determine if the 
	// number of decimal places in the answer is sufficient
    accuracy = Math.pow(10, -prec);
    System.out.println("Accuracy by "+accuracy);
    
    while (Math.abs(currentEstimate-previousEstimate) >= accuracy) { 
        previousEstimate = currentEstimate; 
        // calculate factorial to counter
        int facProduct = 1;
        int facCounter = 1;
        while (facCounter <= counter)
            {
            facProduct = facProduct*facCounter;
            facCounter++;
            }
        // factorial = product;
        currentEstimate = currentEstimate + 1/(double)facProduct;
        counter++; 
        } 
    euler = currentEstimate; 
    
    System.out.println("Raw estimate\t\t\t" + euler);
    
    double powr = Math.pow(10,prec);
    System.out.println("Precision " + prec + " digits estimate\t" + Math.round(euler*powr)/powr);
    
    } // main()
} // WhileFloat
