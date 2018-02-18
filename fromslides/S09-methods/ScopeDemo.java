//package fromslides.S08;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class ScopeDemo
{
    public static void main(String[] args)
    {
    int grade;

    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Brought to you by Dawson College");
    
    // read in first grade
    System.out.print("Enter a grader: ");
    grade =  keyboard.nextInt();
    
    // this code has compile errors due to scope problems, 
    // how would you fix it?
    
    if ( testscore >= 60 ) {
        boolean passed = true;
    } else {
        passed = false;
    }
    if (passed)  {
        System.out.println("You passed! "+grade);
    } else {
        System.out.println("You failed. "+ grade);
    }
    } // main()
} // ScopeDemo
