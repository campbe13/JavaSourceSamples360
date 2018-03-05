/** 
 * This class is the teacher's example of
 * data loss between data types
 * double is 64bits  (IEEE 754)
 * float is 32bits   (IEEE 754)
 * long is 64bits
 * int is 32bits
 * 
 * * 
 * 
 * @author PMCampbell
 * @version today
 **/
    
import java.util.Scanner;

public class DataLoss  {
   public static void main(String[] args) {
    long longVar;
    int intVar, i=0;
    double doubleVar;
    float floatVar;
    
    longVar = 1000000001;
    i = 0;
    while (i++ < 55 ) {
        System.out.printf("\n long %d == float %f", longVar, (float)longVar);
        longVar++;
    }
    longVar = 10000000001L;
    i = 0;
    while (i++ < 55) {
        System.out.printf("\n long %d == float %f", longVar, (float)longVar);
        longVar++;
    }
    longVar = 1000000001;
    i = 0;
    while (i++ < 55) {
        System.out.printf("\n long %d == double %f", longVar, (double)longVar);
        longVar++;
    }
    double a = 12345.0;
    double b = 1e-16;
    //System.out.printf("a %f + b %f == a %f", a, b, a);
    //System.out.printf("a + b => %f", a + b);
    System.out.println("\na " + a + "\n b " +b );
    System.out.println("a + b => "+ ( a + b ) );
    System.out.println(a + b == a);
    // Roundoff error
    // floating point arithmetic is not exact
    // some real numbers need an infinte number of digits
    // ex: 1/3,  natural log, PI
    //  surprise 1/10 not exactly representable
    // see this example:
    double x1 = 0.3;
    double x2 = 0.1 + 0.1 + 0.1;
    System.out.println("x1 " + x1);
    System.out.println("x2 " +  x2);
    System.out.println("x1 == x2 " + (x1 == x2));

    double z1 = 0.5;
    double z2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
    System.out.println("z1 " + z1);
    System.out.println("z2 " +  z2);
    System.out.println("z1 == z2 " + (z1 == z2));

    
   } // main()
} // DataLoss