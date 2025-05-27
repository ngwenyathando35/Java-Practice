/* StackOverFlow Error
 * Filename InsuredPackage.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This is a subclass named InsuredPackage that adds an insurance cost to the shipping cost that is
        inherited from the Package class
 */
package pkgpackage;
public class InsuredPackage extends Package
{
    private double insurance;
    public InsuredPackage(int weight, char shippingMethod)
    {
        super(weight, shippingMethod);
    }
    public double addInsurance(double cost)
    {
        double[] costRangeLimits = {0   , 1.01, 3.01};
        double[] prices =          {2.45, 3.95, 5.55};
        final int NUM_RANGES = costRangeLimits.length;
        int sub = NUM_RANGES - 1;
        while(sub >= 0 && cost < costRangeLimits[sub])
            --sub;
        insurance = prices[sub];
        return insurance;
    }
    @Override
    public void display()
    {
        display();
        System.out.println("The insurance for the package will be R" + insurance);
    }
}