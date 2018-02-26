/** 
 * This class is the teacher's example of 
 * implementing & using a function as a method
 * 
 * The function is the formula for the area of a circle
 * f(r) = 3.14159 * r^2
 * 
 * It also has an example of using a sentinal (-1) to end a loop
 * 
 * 
 * @author PMCampbell
 * @version today
 **/
    
import java.util.Scanner;

public class CircleCalc  {
   public static void main(String[] args) {
    double radius;
    
    radius = getRad();
   
    // display the area of a circle until a negative value is input 
    while (radius > 0 ) { 
    	System.out.printf("A circle of r=%6.4f has an area of %6.4f", radius, circArea(radius));
    	radius = getRad(); 
    }
} // end main()
/**
 * given a radius return the area of the circle
 *
 * @param double radius
 * @return double  area of circle
 */
public static double circArea(double r) {
	double area;
	area = Math.PI * Math.pow(r,2);
	return area;
} 
/**
 * prompt the user to input a radius
 *
 * @return double radius 
 */
public static double getRad() {
	Scanner kb = new Scanner(System.in);
	double radius;
	System.out.print("\nEnter a radius, negative number or 0 to end: ");
    radius = kb.nextDouble(); 
    return radius;
}
} // end class