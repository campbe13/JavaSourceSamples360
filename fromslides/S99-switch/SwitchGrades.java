//package fromslides.S08;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/

// original code in S07  IfStatements2.java
public class SwitchGrades {
    public static void main(String[] args) {
        final int PASS = 60;
        // grade thresholds
        final int D = 70;
        final int C = 80;
        final int B = 90;
        final int A = 100;
        Scanner keyboard = new Scanner(System.in);
        int grade;

        System.out.print("Enter your grade: ");
        grade = keyboard.nextInt();

        switch (grade) {
        case 60:   
        case 61:
        case 62:
        case 63:
        case 64:
        case 65:
        case 66:
        case 67:
        case 68:
        case 69:
            System.out.println("Grade D");
            break;
        case 70:
        case 71:
        case 72:
        case 73:
        case 74:
        case 75:
        case 76:
        case 77:
        case 78:
        case 79:
            System.out.println("Grade C");
            break;
        case 80:
        case 81:
        case 82:
        case 83:
        case 84:
        case 85:
        case 86:
        case 87:
        case 88:
        case 89:
            System.out.println("Grade B");
            break;
        case 90:
        case 91:
        case 92:
        case 93:
        case 94:
        case 95:
        case 96:
        case 97:
        case 98:
        case 99:
        case 100:
            System.out.println("Grade A");
            break;
        default:
            System.out.println("Grade F");
    }

} // main()
} // SwitchGrades