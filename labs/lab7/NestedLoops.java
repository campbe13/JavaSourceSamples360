/**
 * This class is the teacher's solution
 * for the Nested loop exercises from lab7
 * there are other ways to do this, you
 * are seeing the solution that came to
 * mind today.
 *
 * @author PMCampbell
 * @version today
 **/

import java.util.Scanner;

public class NestedLoops  {
   public static void main(String[] args) {
    System.out.println("drawTopTriangle(5, '*')");
    drawTopTriangle(5, '*');
    System.out.println("drawBottomTriangle(4, '+')");
    drawBottomTriangle(4, '+');
    System.out.println("drawStairs(7, '@')");
    drawStairs(7, '@');

} // end main()
/**
 * draws a triangle on the screen with the top
 * max width equal to count
 *
 * @param int count   maximum base of inverted triangle
 * @param char disp   the char to display on screen
 */

public static void drawTopTriangle(int count, char disp) {
    int charStart =-1;
    for (int row=0;row < count;row++) {    // row
      for (int col=0; col < count;col++) {  // cols
        if (col<=charStart) {
          System.out.print(' ');
        }else {
          System.out.print(disp);
        }
      }
      System.out.println();
      charStart++;
    }
}  // drawTopTriangle()
/**
 * draws a triangle on the screen with the bottom
 * max width equal to count
 *
 * @param int count   maximum base of inverted triangle
 * @param char disp   the char to display on screen
 */

public static void drawBottomTriangle(int count, char disp) {
  for (int row=0;row < count;row++) {    // row
    for (int col=0; col <=row ;col++) {  // cols
        System.out.print(disp);
    }
    System.out.println();
  }
}  // drawBottomTriangle()
/**
 * draws a diagonal  on the screen the
 * bottom point at count
 *
 * @param int count   maximum base of inverted triangle
 * @param char disp   the char to display on screen
 */

public static void drawStairs(int count, char disp) {
  for (int row=0;row < count;row++) {    // row
    for (int col=0; col <row ;col++) {  // cols
        System.out.print(' ');
    }
    System.out.println(disp);
  }
}  // drawStairs()
} // end class
