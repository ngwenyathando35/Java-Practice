/*
 * Filename Billing.java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description : To demonstrate method overloading  
 */
package billing;
public class Billing 
{
    static double price , coupon, total, quantity;;
    public static void computeBill(double pr)
    {
        price = pr;
        total = addTax(price);
        System.out.println("You will pay R" + total);
    }
    public static void computeBill(double pr, double qtt)
    {
        price = pr;
        quantity = qtt;
        total = addTax(price) * quantity;
        System.out.println("You will pay R" + total + " for " + quantity +" books");
    }
    public static void computeBill(double pr, double qtt, double cpn)
    {
        price = pr;
        quantity = qtt;
        coupon = cpn;
        total = (addTax(price) * quantity) - coupon;
        System.out.println("You will pay R" + total + " for " + quantity +" books" +
                " because you have a R" + coupon + " coupon ");
    }
    private static double addTax(double price) 
    {
        final double TAX_RATE = 0.8, priceWithTax;
        priceWithTax = price + (price * TAX_RATE);
        return priceWithTax;
    }
    public static void main(String[] args) 
    {
        computeBill(20);
        computeBill(20, 2);
        computeBill(20, 2, 10);
    }
}