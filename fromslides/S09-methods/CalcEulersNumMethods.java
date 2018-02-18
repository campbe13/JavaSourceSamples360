//package fromslides.S09;
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

    System.out.println("Brought to you by Dawson College");
    
    System.out.print( "Enter number of digits precison : " );
    int prec = keyboard.nextInt();
    
    double euler = eNumber();
    System.out.println("Raw estimate\t\t\t" + euler);
    
    double powr = Math.pow(10,prec);
    System.out.println("Precision " + prec + " digits estimate\t" + Math.round(euler*powr)/powr);
    
    } // main()
    public static long factorial(int num) 
    {
    int product = 1;
    int counter = 1;
    while (counter <= num)
        {
        product = product*counter;
        counter++;
        }
    return product;
    } // factorial()
    
    // Euler method:
    public static double eNumber() 
    { 
    double currentEstimate=1.; 
    double previousEstimate =0.; 
    double accuracy = 0.0001; 
    int counter = 1; 
     
    while (Math.abs(currentEstimate-previousEstimate) > 0.0001) 
        { 
        previousEstimate = currentEstimate; 
        currentEstimate = currentEstimate + 1/(double)factorial(counter); 
        counter++; 
        } 
     
    return currentEstimate; 
    } // eNumber()
} // WhileFloat
