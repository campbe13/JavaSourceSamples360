import java.util.Scanner;
/**
* Lab 4
* find the real roots of a quadratic equation
* given a, b, c
*
* general form:   ax^2 + bx + c = 0
*
* @ PMC
* @ lab4-2018
**/

public class RealRoots {
  public static void main(String args[]) {
    double root1, root2, a,b,c;
    Scanner kb = new Scanner(System.in);
    // init vars for the compiler's blind spot
	root1 = root2 = 0;
    //root1 = 0;
	//root2 = 0;
	//root1 = 0; root2 = 0;
	
    System.out.println("Calculate Quadratic roots\ngeneral form ax^2 + bx + c = 0\n");
    System.out.print("a: ");
    a = kb.nextDouble();
    System.out.print("b: ");
    b = kb.nextDouble();
    System.out.print("c: ");
    c = kb.nextDouble();
	
    if (((b*b -4*a*c) > 0) && (a > 0)) {
        root1 = ( -b + Math.sqrt(b*b - 4*a*c) ) / (2*a);
        root2 = ( -b - Math.sqrt(b*b - 4*a*c) ) / (2*a);
		System.out.println("Equation: "+a
			+ "x^2 +" + b + "x +" + c +" = 0");
		System.out.printf("Equation: %.3fx^2 + %.3fx + %.3f = 0\n",
					a,b,c);
		System.out.println("\n\nRoot 1: "+ root1 
			+ "\nRoot 2: "+ root2);
	} else {
      System.out.println("invalid data");
    }

  }  // main()
}  // class RealRoots
