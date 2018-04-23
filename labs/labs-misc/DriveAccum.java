import java.util.Scanner;
/**
 * implement accumNum() method
 * from the labs-misc Part 0
 * 
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class DriveAccum {
    public static void main(String[] args) {
			int [] test;
			test = accumNum();
			for (int i=0; i < test.length; i++)
				System.out.print(i+": " + test[i] +" ");
			
			System.out.println();
        } //main()
	public static int[] accumNum() {
		Scanner sc = new Scanner(System.in);
		int num, large, small, sum=0,count=0;
		int result[];
		System.out.print("enter a number: ");
		num = sc.nextInt();
		large = small = num;
		while ( num >= 0 ) {
			if (num < small) {
				small = num;
			}
			if (num > large ) {
				large = num;
			}
			count++;
			sum += num;
			System.out.print("enter a number: ");
			num = sc.nextInt();
		}
		result = new int[3];
		result[0] = large;
		result[1] = small;
		result[2] = sum/count;
		return result;
	} // accumNum()
		
} // class
