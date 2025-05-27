/* The UsePackage class keeps on selecting the default option in the switch statements whick causes to make throw
   a StackOverFlow Error
 * Filename Package.java
 * Written by Thando Ngwenya
 * Written on 19Aug2020
 * Description : This is a parent class that has data fields for weight in ounces, shipping method, and shipping 
        cost. The shipping is a of type character: A for air, T for truck, or M for mail. The class contains a 
        constructor that requires arguments for weight and shipping method. The constructor calls a  
        calculateCost() method that determines the shipping cost. The class also has a display() method that 
        displays the values in all four fields.
*/
package pkgpackage;
public class Package 
{
    private int weight;
    private double cost;
    private char method;
    public Package(int weight, char shippingMethod)
    {
        this.weight = weight;
        method = shippingMethod;
        cost = calculateCost(this.weight, method);
    }
    public void setWeigth(int mass)
    {
        weight = mass;
    }
    public void setMethod(char shippingMethod)
    {
        method = shippingMethod;
    }
    public int getWeight()
    {
        return weight;
    }
    public double getCost()
    {
        return cost;
    }
    public char getMethod()
    {
        return method;
    }
    private double calculateCost(int weight, char method) 
    {
        final int numRanges = 3;
        int methodOfTransport = 0;
        int sub = numRanges - 1;
        double prices[][] = {{  2 ,   3 ,   4},//Air
                             {1.5 ,2.35 ,3.25},//Truck
                             {0.5 ,1.50 ,2.15}};//Mail
        int pricesRangeLimits[] = {1,9,17};
        while(sub >= 0 && weight < pricesRangeLimits[sub])
            --sub;
        switch(method)
        {
            case 'A':
                methodOfTransport = 0;
                break;
            case 'B':
                methodOfTransport = 1;
                break;
            case 'C':
                methodOfTransport = 2;
                break;
            default:
                methodOfTransport = 0;
        }
        cost = prices[methodOfTransport][sub];
        return cost;
    }
    public void display()
    {
        System.out.println("The package weighs " + weight + 
                ".\nSince it's gonna be transported by " + method + 
                "it's gonna cost you " + cost);
    }
}