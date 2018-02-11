import java.util.Scanner;
/**
* Lab 4
* vertical displacement calculator
* @ PMC
* @ lab4-2018
**/

public class VertDisplace {
  public static void main(String args[]) {
    double initSpeed,   // v sub y0
              time;     // t
    double displacement;  // delta y
    double G =  9.8;      // 9.8 m/s/s
    Scanner kb = new Scanner(System.in);

    System.out.print("initial speed:");
    initSpeed = kb.nextDouble();
    System.out.print("time in air:");
    time = kb.nextDouble();
    // make sure time & speed are non negative
    initSpeed = Math.max(initSpeed,0);
    time = Math.max(time,0);

    // delta y = v sub y0 * t - 1/2 * g * t ^ 2

    displacement =  initSpeed* time -
            0.5 * G * Math.pow(time,2);
    System.out.println("vertical displacement is "
              + displacement);

  }
}
