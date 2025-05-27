/*
 * Filename IncomingPhoneCall.java
 * Written by Thando Ngwenya
 * Written on 10Sep2020
 * Description : This is a child class of PhoneCall named IncomingPhoneCall. It has a constructor that passes 
        its phone number parameter to its parent’s constructor and sets the price of the call to 0.02. The 
        method that displays the phone call information displays the phone number, the rate, and the price of 
        the call (which is the same as the rate).
 */
package phonecall;
public class IncomingPhoneCall extends PhoneCall
{
    public IncomingPhoneCall(String number) 
    {
        super(number);
        setPrice(0.02);
    }
    @Override
    public String getPhoneNum()
    {
        return cellNum;
    }
    @Override
    public double getPrice() 
    {
        return price;
    }
    @Override
    public void display() 
    {
        System.out.println("*******************Thando is the best**************************\n"
                + "Incoming Phone Call\n"
                + "Cell number     >> " + getPhoneNum() + 
                  "\nRate per minute >> " + getPrice()
                + "\nPrice           >> " + getPrice());
    }
}