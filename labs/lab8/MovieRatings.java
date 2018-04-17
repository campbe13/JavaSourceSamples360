import java.util.Scanner;
/**
 * implement average movie ratings method
 *
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class MovieRatings {
    public static void main(String[] args) {
        double average;
        int ratings[][] = { {4,6,2,5},
                            {7,9,4},
                            {6,9,3,7},
                            {9,5,6,1,4}};

        average = averageRatings(25, ratings);
        System.out.println("reviewer 25: " + average);
        average = averageRatings(-5, ratings);
        System.out.println("reviewer -5: " + average);
        average = averageRatings(1, ratings);
        System.out.println("reviewer 1: " + average);
        // over achiever  show all reviewers
        for (int i = 0;i<ratings.length;i++) {
          System.out.printf("\nreviewer %d ratings %.2f ",
                  i, averageRatings(i, ratings));
        }
        } //main()
  /**
  * method to calculate average ratings, given a
  * movie reviewer
  *
  * @param int reviewer    reviewer no (array index)
  * @param int [][] ratings   array of review values
  * @return int         average of all reviewers  \
  *                     or 0 if errir
  **/
	public static double averageRatings(int reviewer,
          int ratings[][]) {
    double total=0;
		if (reviewer >= ratings.length  ||
         reviewer < 0) {   // number of rows/reviewers
      // error condition
      return 0;
    }
    for (int movie=0; movie <ratings[reviewer].length; movie++) { // no of cols
      total += ratings[reviewer][movie];
    }
    return total/ratings[reviewer].length;
	} // averageRatings()

} // class
