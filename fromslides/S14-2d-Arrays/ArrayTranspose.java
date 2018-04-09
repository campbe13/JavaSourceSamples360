//package fromslides.S15;

/**
 * Create a 2d array, sum it
 *
 * @author     pmc
 * @version    slide deck 15
 */

public class ArrayTranspose {
    public static void main(String[] args) {
        int[][] a = {
            { 0,1,3,2 }, 
            { 1,4,8,7}, 
            { 9, 7,0,3 }
        };
        int[][] b = {
            { 0,1,3,2 }, 
            { 1,4,8,7, 5, 6 }, 
            { 9, 7,0,3 }
        };
        int  transposedArray[][];

        transposedArray = transpose(a);
        displayArray("Original ", a);
        displayArray("Transposed ", transposedArray);
        
        if (transposedArray == null)
            System.out.println("Original Array is not rectangular");
        else displayArray("Transposed ", transposedArray); 

        transposedArray = transpose(b);
        displayArray("Original ", b);
        
        if (transposedArray == null)
            System.out.println("\nOriginal Array is not rectangular");
        else displayArray("Transposed ", transposedArray); 

        } // end main
    public static int[][] transpose (int[][] array) {
           //check if rectangular  ​
            int col = array[0].length;
            for (int i = 1; i< array.length; i++)
                {
                    if (array[i].length != col)
                        return null;
                }
        // if we get here it must be rectangular so transpose​
           int[][] t = new int[array[0].length][array.length];
           for (int i = 0; i < t.length; i ++)
                    {
                        for (int j=0; j< t[i].length; j++)
                            t[i][j] = array[j][i];
                    }
                    return t;
                    }
/**
        * display the array with a message 
        * @param name   message String  integer array
        * @param arry    integer array
        **/ 
public static void displayArray(String name, int arry[])   {
    System.out.println("\nArray: "+name);
    for (int i=0; i < arry.length; i++)
     System.out.print("["+i+"] = "+ arry[i]+" ");
}
/**
        * display the array with a message 
        * @param name   message String  integer array
        * @param arry    integer array
        **/ 
public static void displayArray(String name, int arry[][])   {
    System.out.println("\nArray: "+name);
    for (int row=0; row < arry.length; row++)   {
        System.out.printf("[ ");
       for (int col = 0; col < arry[row].length; col++ )
             System.out.print(arry[row][col] +" ");
         System.out.printf("]\n");
     }
}
} // end class
