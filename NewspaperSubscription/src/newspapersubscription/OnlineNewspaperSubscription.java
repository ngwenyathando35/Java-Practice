/* Filename OnlineNewspaperSubscription.java
 * Written by Thando Ngwenya
 * Written on 15Sep2020
 * Description : This is a subclass that acceps a parameter for the setAddress() method. It must contain an the 
        at sign (@) or an error message is displayed. If the address is valid, the subscription rate is assigned
        R161 Works as intended.*/
package newspapersubscription;
public class OnlineNewspaperSubscription extends NewspaperSubscription
{
    @Override
    public void setAddress(String residence) 
    {        
        if(hasAnnotation(residence))
        {
            address = residence;
            rate = 161;
        }
        else
            System.out.println("There is no @ sign inputed");
    }
    private boolean hasAnnotation(String residence) 
    {
        boolean hasADigit = false;
            int a = residence.indexOf('@');
            if(a != -1)
                hasADigit = true;
        return hasADigit;
    }
}