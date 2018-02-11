//package fromslides.S06;
/**
 * This class has examples of printf() using 
 * most of the 
 * @author P.Campbell
 * @version today
 **/

public class Printf {
    public static void main(String[] args)
        {
            int num = 1024;
            double pay = 9875.436;
            String str = "Puppies", str2 = "Penguins";
            
            System.out.printf("Char %c\n", 'P');
            System.out.println("pay $" + pay);
            System.out.printf("pay %f\n", pay);
            System.out.printf("pay %.2f\n", pay);
            pay = 19990.9543;
            System.out.printf("pay $%.2f\n", pay);
            System.out.printf("pay $%,.2f\n", pay);
            System.out.printf("pay $%09.2f\n", pay);
            pay = 10.0;            
            System.out.printf("pay $%,.2f\n", pay);
            System.out.printf("pay $%,.04f\n", pay);

            System.out.printf("pay %08d\n", num);
            
            System.out.printf("pay %8d\n", num);
            
            System.out.printf("My favourite animals are %s, second favourite %s\n", 
            str, str2);
            System.out.printf("%20s, %20s\n", str, str2);
            System.out.printf("%20s, %20s\n", str2, str);
        }
}