import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * Calculate the area of a circle, create a method to do so
 *
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class Circle {

    public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);
      double radius, area;

      System.out.print("Enter the radius for calculating area: " );
      radius = kb.nextDouble();

      area = calcAreaCircle(radius);

      System.out.printf("Your circle of radius %.5f has an area of  %.5f\n", radius, area );
      System.out.printf("Area rounded to 2 decimal points: %.5f ", roundTo(area,2));

    } // main()

    /**
     * Given a radius calculate the area of a circle
     *
     *  Area of a circle f(r) = PI * r^2
     *
     * @param r  radius double
     * @return area of circle double
     * */

    public static double calcAreaCircle(double r) {

        return Math.PI * Math.pow(r,2);

    }  // calcAreaCircle
    /**
     * Given a number, round it to the given number of
     * decimal points
     *
     *  Area of a circle f(r) = PI * r^2
     *
     * @param num   double
     * @param prec double number of decinal points to round
     * @return doulbe num rounded to prec decimal points
     * */

    public static double roundTo(double num, double prec) {
        double tens = Math.pow(10,prec);
        return Math.round(num * tens) / tens;
    }  // roundTo()
} // Circle class
