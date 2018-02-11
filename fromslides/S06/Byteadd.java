//package fromslides.S06;
/**
 * This class illustrates what happens when 
 * you do a narrowing cast from a large data type to a 
 * smaller data type.
 * @author P.Campbell
 * @version today
 **/
public class Byteadd {
    public static void main(String[] args)
        {
        byte b = 1;
        double d = 123.45678;
        int i;
        
        // incr/decr ops do  implicit casting (here from int to byte)
        b++;
        b--;
        
        // compound assignment ops do implicit casting (here from int to byte)
        b += 1;
        b -= 1;
       
        // narrowing problem ! compile error: 
        // possible loss of precision
        // required:    byte
        // found:       int
        // b = b + 1;
        
        // must explicitly cast
        b = (byte) ( b + 1 );
        
        // truncate high order bits
        b = (byte) 260;
        System.out.println("b " + b);
        
        // narrowing problem ! compile error: 
        // possible loss of precision
        // required:    int
        // found:       double
        // i = d;  
        
        i = (int)d; 
        System.out.println("i " + i);
        
    }
}