//package fromslides.S08;
import java.util.Scanner;

public class CalcEulersNum
{
    public static void main(String[] args)
    {
    
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Brought to you by Dawson College");
    
    System.out.print( "Enter number of digits precison : " );
    int prec = keyboard.nextInt();
    
    double currentEstimate=1.; 
    double previousEstimate =0.; 
    double accuracy = 0.0001; 
    double euler;
    int counter = 1; 
    
    accuracy = Math.pow(10, -prec);
    System.out.println("Accuracy by "+accuracy);
    
    while (Math.abs(currentEstimate-previousEstimate) > accuracy) 
        { 
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
