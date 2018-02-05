//import java.util.Scanner;
/**
 * Illustrating the effect of a narrowing cast between
 * integer data types  (crop leading bits, results unknown)
 * @author P.M.Campbell
 * @version 2018-02-04
 **/
public class NarrowingCast
{
   public static void main(String[] args)
   {  
      int num;       // Declare an int variable named num
      byte numBytes;    // Declare a byte variable named numBytes
      
      num = 260;      
      numBytes = (byte)num;     
      
      System.out.println("num has a value of      "+ num);
      System.out.println("numBytes has a value of "+ numBytes);
   }
}
