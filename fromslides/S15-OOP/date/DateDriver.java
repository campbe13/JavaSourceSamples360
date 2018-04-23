/**
 * Class to test Date class
 * 420-112-DW
 * methods
 * 
 * @author PMC
 * @version 2015-2016
 */
public class DateDriver {
  
  public static void main (String[] args) {
       Date finalExam = new Date();
       finalExam.dayOfWeek = "Tuesday";
       finalExam.year = 2016;
       finalExam.day = 13;
       finalExam.month = 12;
       finalExam.hour = 14; 
       finalExam.minute = 0;
       finalExam.second = 0;
       
       Date lastDayOfClasses = new Date();
       lastDayOfClasses.dayOfWeek = "Friday";
       lastDayOfClasses.year = 2016;
       lastDayOfClasses.day = 9;
       lastDayOfClasses.month = 12;
       
       System.out.println("Final Exam "+finalExam.dayOfWeek);
       System.out.println("Last day of classes "+lastDayOfClasses.dayOfWeek);
    } // main()
} // DateDriver
