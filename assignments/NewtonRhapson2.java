import java.util.Scanner;
/**
 * This class illustrates applies the newton rhapson method
 * to find the root of a given polynomial.
 * assignment 2 2018
 * f(x) -> 3* Math.pow(x, 5) + Math.pow(x,3) - x - 1.0;
 * f(x) -> 3x^5 + x^3 - x - 1.0
 *
 * f'(x) -> 15*Math.pow(x,4) + 2*x -1
 * f'(x) -> 15x^4 + 2x -1.0
 *
 * teacher's solution
 *
 * @author P.Campbell
 * @version today
 **/
public class NewtonRhapson2 {
    public static void main(String[] args) {
    Scanner kb = new  Scanner(System.in);
    int count=0;
    double x0, xn, xnplus1;

    System.out.print("Enter initial value for x (x sub 0):");
    xn = kb.nextDouble();
    x0 = xn;  // needed to print

    // get initial xnplus1
    // needed to prime the border condition
    xnplus1 = newtonRhapsonF(xn);
    count++;


    while (Math.abs(xn - xnplus1) >= 0.0001) {
      System.out.printf("xn %.7f xnplus1 %.7f\n", xn, xnplus1);
      xn = xnplus1;
      xnplus1 = newtonRhapsonF(xn);
      count++;
    }
    System.out.printf("FINAL:\n xn %.7f xnplus1 %.7f\n", xn, xnplus1);

    System.out.println("\npolynomial 3x^5 +x^3 - x - 1");
    System.out.println("derivative 15x^4 +3x^2 - 1");
    System.out.println("\nInitial xsub0 "+x0);
    System.out.println("root approx   "+xnplus1);
    System.out.println("iterations    "+count);
  } // main()

  /**
  * original function   3x^5 +x^3 - x - 1
  *
  * @param   x
  * @return  the result of the function
  **/

  static double newtonRhapsonF (double x) {
    return x  - f(x) / fprime(x);
  }
  /**
  * original function   3x^5 +x^3 - x - 1
  *
  * @param   x
  * @return  the result of the function
  **/
  static double f (double x) {
    return 3* Math.pow(x, 5) + Math.pow(x,3) - x - 1.0;

  }
  /**
  * derivative of original function   3x^5 +x^3 - x - 1
  * 15x^4 +2x^2 -1
  * @param   x
  * @return  the result of the function
  **/

  static double fprime (double x) {
    return  15*Math.pow(x,4) + 2*x*x -1;
  }

} // class NewtonRhapson
