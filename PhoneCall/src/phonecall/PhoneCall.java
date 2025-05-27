/* The Talk-A-Lot Cell Phone Company provides phone services for its customers.
 * Filename PhoneCall.java
 * Written by Thando Ngwenya
 * Written on 10Sep2020
 * Description : This is an abstract class named PhoneCall that has a String field for a phone number and a 
        double field for the price of the call. It also has a constructor that requires a phone number parameter
        and sets the price to 0.0. It has a set method for the price. It also has three abstract get methods—one
        that returns the phone number, another that returns the price of the call, and a third that displays 
        information about the call
 */
package phonecall;
public abstract class PhoneCall 
{
    protected String cellNum;
    protected double price;
    public void setPrice(double costOfCall)
    {
        price = costOfCall;
    }
    public PhoneCall(String number)
    {
        cellNum = number;
        price = 0.0;
    }
    public abstract String getPhoneNum();
    public abstract double getPrice();
    public abstract void display();
}