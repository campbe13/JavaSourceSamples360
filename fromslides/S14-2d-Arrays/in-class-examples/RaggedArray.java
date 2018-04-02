import java.util.Scanner;
/**
 * arrays ragged
 * sum
 * @author P.M.Campbell
 * @version today
 **/

public class RaggedArray
{
   public static void main(String[] args)
   {
    int ragged[][]  = { {1,2,3,4},
       					{1,2,3,4,5,6},
       					{5},
       					{1,2,3},
       					{1,2,3,4,5,6,7,8,9,10},
       					};
     int biggestRow=0;
     int biggestRowLength=0;
     for (int row=0; row <ragged.length; row++) {
		System.out.println(" row "+row+
	   			" length " + ragged[row].length);

          if (ragged[row].length > biggestRowLength){
                biggestRowLength = ragged[row].length;
                biggestRow = row;
			}
			}
	 System.out.println("Largest row "+biggestRow+
	   			" length " + biggestRowLength);

   }  // main()
}  // RaggedArray