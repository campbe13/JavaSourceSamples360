// package fromslides.S07;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class LetterGrade2
{
   public static void main(String[] args)
   {
   final int DGRADE = 60;
   final int AGRADE = 90;
   final int BGRADE = 80;
   final int CGRADE = 70;
   final int MAX_GRADE = 100;
      
   Scanner keyboard = new Scanner(System.in);
   int grade;
   char letterGrade;
   System.out.print("Enter your grade: ");
   grade = keyboard.nextInt();
   
   // else if
   if ( grade < DGRADE ) {
		letterGrade = 'F';
		} else if ( grade < CGRADE ) {
             letterGrade = 'D';
			 } else if ( grade < BGRADE ) {
				letterGrade = 'C';
				} else if ( grade < AGRADE ) {
					letterGrade = 'B';
					} else if ( grade < MAX_GRADE ) {
						letterGrade = 'A';
						} else {
							// should be impossible
							letterGrade = 'X';
						}
            
   System.out.printf("Grade %c was assigned for %03d",
			letterGrade, grade);
     
   }
}