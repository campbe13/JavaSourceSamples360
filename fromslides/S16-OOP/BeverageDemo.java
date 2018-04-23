package fromslides.S18;
import java.util.Scanner;

/**
   Use the Beverage class
*/

public class BeverageDemo
{
   public static void main(String[] args)
   {
      Beverage beerCan, beerBottle;
      
      beerCan = new Beverage(0.007, 20.0);
      beerBottle = new Beverage(0.001, 20.0);
      
      
      System.out.println("Starting at 20 degrees");
      System.out.println("After 10 minutes in a 5 degree fridge:");
      beerCan.cool(5, 10);
      beerBottle.cool(5, 10);
      System.out.println(" beer in a can is " + 
                            beerCan.getTemp() + 
                            " degrees");
      System.out.println(" beer in a bottle is " + 
                            beerBottle.getTemp() + 
                            " degrees");
      System.out.println("Starting at 20 degrees");
      beerCan.setTemp(20.0);
      beerBottle.setTemp(20.0);
      System.out.println("After 60 minutes in a 10 degree fridge:");
      beerCan.cool(10, 60);
      beerBottle.cool(10, 60);
      System.out.println(" beer in a can is " + 
                            beerCan.getTemp() + 
                            " degrees");
      System.out.println(" beer in a bottle is " + 
                          beerBottle.getTemp() + 
                            " degrees");                         
   }
}
