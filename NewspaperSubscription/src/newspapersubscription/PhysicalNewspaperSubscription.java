/* Filename PhysicalNewspaperSubscription.java
 * Written by Thando Ngwenya
 * Written on 15Sep2020
 * Description : This is a subclass that receives a parameter for the setAddress() method. It must contain at 
        least one digit; otherwise, an error message is displayed and the subscription rate is set to 0. If the 
        address is valid, the subscription rate is assigned R269. Works as intended.*/
package newspapersubscription;
import static java.lang.Character.isDigit;
public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
    @Override
    public void setAddress(String residence) 
    {        
        if(hasADigit(residence))
        {
            address = residence;
            rate = 269;
        }
        else
        {
            System.out.println("There is no number inputed therefore the rate will be "
                    + "set to R0");
            rate = 0;
        }
    }
    private boolean hasADigit(String residence) 
    {
        boolean hasADigit = false;
        char a;
        for(int i = 0; i < residence.length(); i++)
        {
            a = residence.charAt(i);
            if(isDigit(a))
                hasADigit = true;
        }
        return hasADigit;
    }
}