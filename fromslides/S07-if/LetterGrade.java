// package fromslides.S07;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class LetterGrade
{
   public static void main(String[] args)
   {
   final int DGRADE = 60;
   final int AGRADE = 90;
   final int BGRADE = 80;
   final int CGRADE = 70;
      
   Scanner keyboard = new Scanner(System.in);
   int grade;
   char letterGrade;
   System.out.print("Enter your grade: ");
   grade = keyboard.nextInt();
   
   // else ifs 
   if ( grade >= AGRADE ) {
		   letterGrade = 'A';
		 } else if ( grade >= BGRADE ) {
             letterGrade = 'B';
			 } else if ( grade >= CGRADE ) {
				letterGrade = 'C';
				} else if ( grade >= DGRADE ) {
					letterGrade = 'D';
					} else {
						letterGrade = 'F';
					}
            
   System.out.printf("Grade %c was assigned for %03d",
			letterGrade, grade);
     
   }
}