import java.util.Scanner;
/**
 * driver for accumulator method
 * from labs misc part 0
 * 
 * 360-420-DW Intro to Java
 * @author PMCampbell
 * @version today
 **/
public class DriveAccum {
    public static void main(String[] args) {
		int array[];
		array = accumNum();
		for (int i=0; i < array.length; i++) {
			System.out.print(" i "+i+ ":" + array[i]);
		}
		System.out.println();
        } //main()
	public static int[] accumNum() {
		int num, small, large, count=0, sum=0;
		int result[];
		Scanner kb = new Scanner(System.in);
		System.out.print("enter number: ");
		num = kb.nextInt();
		small = large = num;
		while (num >=0 ) {
			if (num > large) {
				large = num;
			}
			if (num < small) {
				small = num;
			}
			count++;
			sum +=num;
			System.out.print("enter num: ");
			num = kb.nextInt();
			}
		result = new int[3];
		result[0] = large;
		result[1] = small;
		result[2] = sum / count;
		return result;
	}
} //  DriveAccum
