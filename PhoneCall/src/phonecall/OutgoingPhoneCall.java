/*
 * Filename OutgoingPhoneCall.java
 * Written by Thando Ngwenya
 * Written on 10Sep2020
 * Description : This is a child class of PhoneCall named OutgoingPhoneCall. It includes an additional field 
        that holds the time of the call in minutes. The constructor requires both a phone number and the time. 
        The price is 0.04 per minute, and the display method shows the details of the call, including the phone 
        number, the rate per minute, the number of minutes, and the total price. */
package phonecall;
public class OutgoingPhoneCall extends PhoneCall
{
    private int time;
    public OutgoingPhoneCall(String number, int time) 
    {
        super(number);
        setPrice(0.04);
    }
    @Override
    public String getPhoneNum()
    {
        return cellNum;
    }
    @Override
    public double getPrice() 
    {
        price = time * 0.04;
        return price;
    }
    @Override
    public void display() 
    {
        System.out.println("******************Thando is the best****************************\n" + 
                "Outgoing Phone Call\n" +
                "Cell number     >> " + getPhoneNum() + 
                "\nRate per minute >> " + getPrice() + 
                "\nTime in minutes >> " + time + 
                "\nPrice           >> " + getPrice());
    }
}