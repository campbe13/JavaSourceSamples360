import java.util.Scanner;
/**
 * Illustrating the effect of a cast between
 * integer data types and floating point data types
 * (drop the decimal values, lose precision)
 * 
 * @author P.M.Campbell
 * @version 2018-02-04
 **/
public class FPIntegerCast
{
   public static void main(String[] args)
   {  
      int num;       // Declare an int variable named num
      double fpNum;    // Declare a double variable named fpNum
      
      fpNum = 123.45678;
      
      num = (int)fpNum;     
      
      System.out.println("num has a value of      "+ num);
      System.out.println("fpNum has a value of "+ fpNum);
   } 
}
