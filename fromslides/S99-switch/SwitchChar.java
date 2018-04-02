//package fromslides.S08;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 * This class illustrates exercises from the slide deck for the course
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/

public class SwitchChar {
    public static void main(String[] args) {
        char convertTo;
        Scanner kb = new Scanner(System.in);
        
        // Using JOptionPane for input:
        /*
        String inputStr;
        inputStr = JOptionPane.showInputDialog(
                "Convert to Meters or Kilometers (m or k):");
        convertTo = inputStr.charAt(0);
        */
        
        System.out.print("Convert to Meters or Kilometers (m or k):");
        convertTo  = kb.next().charAt(0);
        
        switch (convertTo) {
        case 'm':
        case 'M':
            System.out.println("Converting to meters");
            break;
        case 'k':   case 'K':
            System.out.println("Converting to kilometers");
            break;
        default:
            System.out.println("Input not valid.");
    }

} // main()
} // SwitchGrades