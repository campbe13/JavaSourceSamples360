import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * Using looping & method calls calcualte PI 
 * 
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/

public class Pi {
    public static void main(String[] args) {
        double pi = calcPi(0.0000001);
        System.out.printf("Estimate of PI is: %.10f\n", pi);
    }
/**
 * Estimating PI using the Leibniz formula
 * 
 * @param  accuracy at which to stop estimating
 * @return PI double
 **/

    public static double calcPi(double accuracy) {
            // declare and initialize estimates
            double current = 0;
            double next = 4.0 / 1;
            int n = 1;

            while (Math.abs(next - current) >= accuracy) {
                current = next;
                next = current + 4. * Math.pow(-1, n) / (2 * n + 1);
                n++;
            }
            return current;
        } // main()
} // Pi
