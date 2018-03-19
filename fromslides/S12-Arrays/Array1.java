import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 
 * Arrays
 * 
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class Array1 {
    public static void main(String[] args) {
            int num[];
            // instantiate the array (reserve heap memory for it)
            num = new int[3];
            
            // assign integer literals to int variables
            num1 = 5;
            num2 = 10;
            num3 = 15;
            
            //  use int variables
            sum = num1 + num2 + num3;
            mult = num1 * num2 * num3;
            
            System.out.printf("The sum of %d + %d + %d is %d\n",
                    num1, num2, num3, sum);
            System.out.printf("The product of %d * %d * %d is %d\n", 
                    num1, num2, num3, mult);
            
            // assign integer literals to int array elements
            num[0] = 5;
            num[1] = 10;
            num[2] = 15;
            //  use int variables
            sum = num[0] +   num[1] + num[2];
            mult = num[0] * num[1] * num[2];
            
            System.out.printf("The sum of %d + %d + %d is %d\n", 
                    num[0], num[1], num[2],  sum);
            System.out.printf("The product of %d * %d * %d is %d\n", 
                    num[0], num[1], num[2],  mult);
            
            
        } //main()
} //
