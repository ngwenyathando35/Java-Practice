/*
 * Filename DemoPhoneCalls.java
 * Written by Thando Ngwenya
 * Written on 10Sep2020
 * Description : This application demonstrates the instantiation of different child classes the inherit from an 
        abstract class. It displays both IncomingPhoneCall and OutgoingPhoneCall objects.
 */
package phonecall;
public class DemoPhoneCalls 
{
    public static void main(String[] args)
    {
        IncomingPhoneCall phone1 = new IncomingPhoneCall("062 395 8842");
        OutgoingPhoneCall phone2 = new OutgoingPhoneCall("084 373 3044", 3);
        phone1.display();
        phone2.display();
    }
}