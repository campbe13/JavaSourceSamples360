import java.util.Scanner;
/**
 * This class may be used with RandomArray.java
 * you will construct methods to create and use arrays
 *
 * @author your name
 * @version today
 **/
// class name in title case first word begins with capital letter
public class UsefulArrays
{
   public static void main(String[] args)
   {
    int randomNum[];

    randomNum  = createArray(1, 6, 10000);
    System.out.println("This is the array with random nos");
    displayArray(randomNum);
    int freq[] = checkFrequency(randomNum);
    System.out.println("This is the frequency of the random nos");
    displayArray(freq);
   //    System.out.printf("5 %d \t 99  %d\n", randomNum[5], randomNum[99]);
   }
   // your methods
   public static int[] createArray(int min, int max, int size) {
	   int randomNum[] = new int [size];
	   // scale = max - min + 1
	   //   6 -1 + 1 => 6
	   for (int i=0; i < randomNum.length ; i++)  {
      		randomNum[i] = (int)(Math.random() *
      				(max-min+1)) + min ;
       }
       return randomNum;
   }   // createArray()
   public static void displayArray(int randArray[]) {
	   for (int i=0; i < randArray.length ; i++)  {
	       System.out.printf("i %d num %d\t", i, randArray[i]);
       }
   }   // createArray()
   public static int[] checkFrequency(int rand[]){
	   // hints bit.ly/java360  -> S14-Random-Arrays
	   int freq [] = new int [6];
	   for (int index=0; index < rand.length; index++)  {
		         freq[rand[index]-1]++;
		   /*
	   			if (rand[index]  == 6)
	   	            freq[5]++;
	   			else if (rand[index]  == 5)
	   	             freq[4]++;
	   	             else if (rand[index]  == 4)
	   	            	freq[3]++;
	   	            	else if (rand[index]  == 3)
	   	            		freq[2]++;
	   	            		else if (rand[index]  == 2)
	   	            			freq[1]++;
	   	            			else if (rand[index]  == 1)
	   	            				freq[0]++;
	   	     */
	   			  }  // for
	   return freq;
   }
}