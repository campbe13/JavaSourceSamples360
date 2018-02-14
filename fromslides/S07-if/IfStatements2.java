import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class IfStatements2
{
   public static void main(String[] args)
   {
   final int PASS = 60;
   // grade thresholds
   final int D = 70;
   final int C = 80;
   final int B = 90;
   final int A = 100;
   
   Scanner keyboard = new Scanner(System.in);
   float grade;
   
   System.out.print("Enter your grade: ");
   grade = keyboard.nextInt();
   
   if (grade < PASS) 
        {
        System.out.println("Grade F");
        }
    else if ( grade < D)
            {
            System.out.println("Grade D");
            }
        else if ( grade < C)
            {
            System.out.println("Grade C");
            }
            else if ( grade < B)
                {
                System.out.println("Grade B");
                }
                else if ( grade <= A)
                    {
                    System.out.println("Grade A");
                    }
                    else 
                        {
                        System.out.println("Impossible to get here.");
                        }
   }   // main()
}  // IfStatements2 