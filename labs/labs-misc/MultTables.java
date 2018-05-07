import java.util.Scanner;
/**
 * implement multTable() method
 * from the labs-misc Part 1
 * 
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class MultTables {
    public static void main(String[] args) {
	int array[][];
	System.out.println("multTable()");
	multTable();
	System.out.println("multTableArray()");
	array = multTableArray();
	printArray(array);
	System.out.println("multTable(10)");
	multTable(10);
	System.out.println("multTableArray(10)");
	array = multTableArray(10);
	printArray(array);
	System.out.println("geomSeries(10,1000,10)");
	geomSeries(10,1000,10);
	System.out.println("\ngeomSeries(3,99,4)");
	geomSeries(3,99,4);
	System.out.println();
   }
    public static void multTable() {
      for(int i=0;i<6;i++) {
	System.out.print(i+"\t");
      	for(int j=1;j<6;j++) {
	  if (i == 0) 
	     System.out.print(j+"\t");
	  else 
	     System.out.print(j*i+"\t");
	
	} 
	System.out.println();
	} 
	} 
   public static void printArray(int array[][]) {
      for(int i=0;i<array.length;i++) {
      	for(int j=0;j<array[i].length;j++) {
	  System.out.print(array[i][j]+"\t");
	}
	System.out.println();
	}
   }
   public static int[][] multTableArray() {
      int mult[][] = new int[6][6];
      for(int i=0;i<6;i++) {
	mult[i][0] = i;
      	for(int j=1,j2=0;j2<5;j2++,j++) {
	  // debug System.out.println(i+ " "+j2+" "+" J "+j);
	  if (i == 0) 
	     mult[i][j2+1] = j;
	  else 
	     mult[i][j2+1] = j*i;
	} 
	} 
	return mult;
	} 
		
   public static void multTable(int limit) {
      for(int i=0;i<limit+1;i++) {
	System.out.print(i+"\t");
      	for(int j=1;j<limit+1;j++) {
	  if (i == 0) 
	     System.out.print(j+"\t");
	  else 
	     System.out.print(j*i+"\t");
	
	} 
	System.out.println();
	} 
	} 
   public static int[][] multTableArray(int limit) {
      int mult[][] = new int[limit+1][limit+1];
      for(int i=0;i<limit+1;i++) {
	mult[i][0] = i;
      	for(int j=1,j2=0;j2<limit;j2++,j++) {
	  // debug System.out.println(i+ " "+j2+" "+" J "+j);
	  if (i == 0) 
	     mult[i][j2+1] = j;
	  else 
	     mult[i][j2+1] = j*i;
	} 
	} 
	return mult;
	} 
   public static void geomSeries(int first, int last, int incr) {
	for (;first <= last; first+=incr) {
	   System.out.print(first+"\t");
	 }
   }
} // class
