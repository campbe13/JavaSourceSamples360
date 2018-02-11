//package fromslides.S06;
/**
 * This class uses examples of constants of different data types
 * @author P.Campbell
 * @version today
 **/
public class ConstSample {
    public static void main(String[] args)
        {
        // quebec tax values
        final double GSTQST = 1.14975;

        // for use in fahrenheit to kelvin
        final byte FREEZING_PT_WATER_F = 32;
        final float ABS_ZERO_C  = 273.15F;
        final float DIVISOR = 1.8000F;

        // degree symbol in unicode
        final char DEGREE = 176;

        // vars for price
        float price = 10.95F;

        // vars for temp conversion
        int fahrenheit = 54;
        float kelvin;

        kelvin =
        (fahrenheit - FREEZING_PT_WATER_F)
         / DIVISOR + ABS_ZERO_C;

        System.out.printf("Unformatted:\t %d F is %f Kelvin\n",
                     fahrenheit, kelvin);
        System.out.printf("Formatted:\t%03d%c F is %.2f%c Kelvin\n",
                     fahrenheit, DEGREE, kelvin, DEGREE);

        System.out.printf("Unformatted:\tAn item priced $%f costs $%f in Quebec\n",
              price, price*GSTQST);
        System.out.printf("Formatted:\tAn item priced $%,.2f costs $%,.2f in Quebec\n",
              price, price*GSTQST);

    }  // main()
} // ConstSample
