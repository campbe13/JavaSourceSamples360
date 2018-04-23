package fromslides.S18;
/*
*   Beverage class
*
*/
import java.util.Scanner;
public class Beverage
{
    private double K;
    private double temp;
    
    public Beverage(double k, double temp) {
        K = k;
        this.temp = temp;
    }
    
   public double getK()    {
       return K;
   }
   public double getTemp()    {
       return temp;
   }
   public void setTemp(double temp)    {
       this.temp = temp;
   }
   /**
    * calculate the temp of the drink at:
    * time 
    * given the temperature of the environment:
    * tempFridge
    * @returns  T(t)
    **/
   public void cool(double tempFridge, double time) {
       // temp is T sub 0 => temp of drink at time 0
       // tempFridge is T sub env => temp of envir
       temp =  tempFridge + (temp - tempFridge) * Math.exp(-K*time);
   }
   
}  // Beverage