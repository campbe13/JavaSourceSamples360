//package fromslides.S08;
import java.util.Scanner;
public class SqrtTableAll
{
    public static void main(String[] args)
    {
    double x=0.1;
    
    System.out.println("Brought to you by Dawson College");
    
    System.out.println( "x \t\tSquare root x" );

    while (x <= 2.0) 
        {
        System.out.println( x + "\t\t" + Math.sqrt(x));
        x += 0.1; 
        }
        
    System.out.println( "Solution 1\nx \t\tSquare root x" );
    x = 0.1;
    while (x <= 2.0) 
        {
            System.out.println( x+"\t\t"+Math.sqrt(x));
            x = Math.round((x+0.1)*10)/10.;
        }
        
    System.out.println( "Solution 2\nx \t\tSquare root x" );
    int counter = 1;
    
    while (counter <= 20) 
        {
        x = counter/10.;
        System.out.println( x+"\t\t"+Math.sqrt(x));
        counter++; 
        }
    } // main()
} // WhileFloat
