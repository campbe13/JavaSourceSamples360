//package fromslides.S08;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/

public class SwitchMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int month;

        System.out.print("Enter the month number: ");
        month = keyboard.nextInt();

        switch (month) {
        case 1:
            System.out.print("January ");
            break;
        case 2:
            System.out.print("February ");
            break;
        case 3:
            System.out.print("March " );
            break;
        case 4:
            System.out.print("April ");
            break;
        case 5:
            System.out.print("May ");
            break;
        case 6:
            System.out.print("June ");
            break;
        case 7:
            System.out.print("July ");
            break;
        case 8:
            System.out.print("August ");
            break;
        case 9:
            System.out.print("September ");
            break;
        case 10:
            System.out.print("October " );
            break;
        case 11:
            System.out.print("November ");
            break;
        case 12:
            System.out.print("December ");
            break;
        default:
            System.out.println("Month does not exist.");
    }
    switch (month) {
        case 1: case 2: case 3:
            System.out.print("Brrrrrr");
            break;
        case 4: case 5: 
            System.out.print("Spring!");
            break;
        case 7:
            System.out.print("Canada Day ");
        case 6: case 8:
            System.out.print("Summer");
            break;
        case 9:
            System.out.print("Back to School ");
        case 10: 
            System.out.print("Fall");
            break;
        case 12:
            System.out.print("Christmas ");
        case 11: 
            System.out.print("Winter ");
            break;
        default:
            System.out.println("Month does not exist.");
    }

} // main()
} // SwitchGrades