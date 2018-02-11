/**
 * This class illustrates rounding floating point numbers
 * using Math.round()
 *
 * @author P.Campbell
 * @version today
 **/

public class Round {
public static void main (String[] args) {
 final double NUM = 77.5678;
 double d = NUM;
 double dround;
 long   l;

 // cast
 l = (long) d;
 System.out.println(" d " +d + " cast "+l);

 // round
 l = Math.round(d);
 System.out.println(" d " +d + " rounded "+l);

 // note number of zeros == decimal places
 // round 2 decimal places
 System.out.println(" Magic for 2 decimal places");
 d = d*100;
 l = Math.round(d);
 dround = l/100.0;
 System.out.println(" d " +d + " rounded "+l);
 System.out.println(" d " +d + " rounded "+dround);

 d = NUM;
 // round 3 decimal places
 System.out.println(" Magic for 3 decimal places");
 d = d*1000;
 l = Math.round(d);
 dround = l/1000.0;
 System.out.println(" d " +d + " rounded "+l);
 System.out.println(" d " +d + " rounded "+dround);

 d = NUM;
 // round 4 decimal places
 System.out.println(" Magic for 4 decimal places");
 d = d*10000;
 l = Math.round(d);
 dround = l/10000.0;
 System.out.println(" d " +d + " rounded "+l);
 System.out.println(" d " +d + " rounded "+dround);

} // main()
} // Round
