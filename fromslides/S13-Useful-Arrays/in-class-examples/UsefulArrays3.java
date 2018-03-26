// remove line or change packageName to reflect your directory structure
// package packageName;
// needed if using Scanner
import java.util.Scanner;
/**
 * compare 2 arrays
 * you will construct methods to create and use arrays
 *
 * @author your name
 * @version today
 **/
// class name in title case first word begins with capital letter
public class UsefulArrays3
{
   public static void main(String[] args)
   {
	int array1[] = {1, 5, 4, 6, 7};
	int array2[] = {1, 5, 4, 6, 7};
	int array3[];
	int array4[] = {1, 5, 4, 4, 7};
	array3 = array1;

    if (same(array1, array2)) {
       System.out.println("Array1 and Array2 are the same");
   }
    else  {
		System.out.println("Array1 and Array2 are NOT the same");
		displayArray(array1);
		displayArray(array2);
	}
	
	if (same(array1, array3)) {
       System.out.println("Array1 and Array3 are the same");
   }
    else  {
		System.out.println("Array1 and Array3 are NOT the same");
		displayArray(array1);
		displayArray(array3);
	}
	if (same(array1, array4)) {
       System.out.println("Array1 and Array4 are the same");
   }
    else  {
		System.out.println("Array1 and Array4 are NOT the same");
		displayArray(array1);
		displayArray(array4);
	}
   }  // main()
   public static boolean same(int array1[], int array2[]){
	   // exactly same array (same data in heap)
	   if (array1 == array2)
	      return true;
	   // if leng diff, then arrays diff
	   if (array1.length != array2.length)
	       return false;
	   // if leng same, do the drudge work
	   for (int i=0; i< array1.length; i++) {
		    if (array1[i] != array2[i])
		       return false;
		   }
	    return true;
   }
} // UsefulArrays3