import java.util.Scanner;
/**
 * static 2d array manipulation
 * sum
 * @author P.M.Campbell
 * @version today
 **/
// class name in title case first word begins with capital letter
public class MovieRatings
{
   public static void main(String[] args)
   {
    int ratings[][]  =
      {{ 4,6,2,5 },
      { 7,9,4,8 },
      { 6,9,3,7 } };
      for (int reviewer=0; reviewer<ratings.length; reviewer++)
	      System.out.println("Reviewer" +reviewer +
	         " Average "+averageRatings(reviewer,ratings));
	 display(ratings);
   }  // main()
   public static double averageRatings(int reviewer,
        int ratings[][]){
	    double total=0;

		if (reviewer >= ratings.length ||
		      reviewer < 0){
		      return 0;
		  }
		for (int col=0; col < ratings[reviewer].length; col++) {
			total += ratings[reviewer][col];
		}
		return total/ratings[reviewer].length;

   }  // averageRatings()

   public static void display(int array[][]){
	   for (int row=0; row < array.length; row++) {
		   for (int col=0; col < array[row].length; col++) {
		      System.out.print("row,col "+ row +
		      ","+col + " value " + array[row][col]);
		  }
		  System.out.println();
	   }
	}   //display()
}  // MovieRatings