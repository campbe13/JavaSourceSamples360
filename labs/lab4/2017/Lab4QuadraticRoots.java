import java.util.Scanner;
/**
*  Quadratic equation, real roots  

	good test values 
	a=2, b=5, c=2  gives
		r1 = -0.5, r2 = -2.0
	http://www.purplemath.com/modules/quadform2.htm
	a=1, b= -2, c= -4  gives
		r1 = 3.24  r2 = 1.24

**/ 

public class Lab4QuadraticRoots
{
	public static void main (String[] args)
	{
		double a, b, c;
		double root1, root2;

		Scanner kb = new Scanner(System.in );
		System.out.print("Please enter a: ");
		a = kb.nextDouble();
		System.out.print("Please enter b: ");
		b = kb.nextDouble();
		System.out.print("Please enter c: ");
		c = kb.nextDouble();
		
		System.out.printf("Solving for: %f*x*x + %f*x + %f = 0\n", a, b, c); 
              
                if ( a ==  0 ) {
			root1 = -c/b;
			root2 = c/b;
			System.out.println("The equation is linear a="+a);
			System.out.printf("Real root 1 %.2f\nReal root 2 %.2f\n", 
				root1, root2);
		  // eliminate square root of 1 (imaginary number)
		} else if ( (b*b - 4*a*c) > 1) {
			root1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2*a);
			root2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2*a); 
			System.out.printf("Real root 1 %.2f\nReal root 2 %.2f\n", 
				root1, root2);
		} else {
			root2 = root1 = Double.NaN;
			System.out.println("No real roots");
		}
	
		
	}	
}
