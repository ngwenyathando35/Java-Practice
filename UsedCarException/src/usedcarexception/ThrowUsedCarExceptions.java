/* I'll come back to you
 * Filename ThrowUsedCarExceptions.java
 * Written by Thando Ngwenya pg 660
 * Written on 11Jan2021
 * Description : This program establishes an array of seven UsedCar objects and handles any Exceptions. It then 
        displays a list of only the UsedCar objects that were constructed successfully.  */
package usedcarexception;
public class ThrowUsedCarExceptions 
{
    public static void main(String[] args) 
    {
        int count = 1;
        UsedCar car[] = new UsedCar[7];
        try 
        {
            car[0] = new UsedCar("1001", "Ford", 2014, 23000, 12000);
            System.out.println("Car " + count + "\nVIN    : " + car.vin);
            car[1] = new UsedCar("2001", "BMW", 2015, 55550, 13640);
            car[2] = new UsedCar("3001", "VW", 2002, 55550, 13640);
            car[3] = new UsedCar("4001", "Mercedes", 1885, -1, 13640);
            car[4] = new UsedCar("5001", "BMW", 5015, 55550, -13640);
        } catch (UsedCarException error) 
        {
            error.getMessage();
        }
//        UsedCar.display(car[0], count);
//        UsedCar.display(car[1], count);
//        UsedCar.display(car[1], count);
//        UsedCar.display(car[1], count);
//        UsedCar.display(car[1], count);
    }
}