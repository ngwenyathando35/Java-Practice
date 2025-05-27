/* Filename PrepareTax.java
 * Written by Thando Ngwenya
 * Written on 31/05/2020
 * Description : This application that prompts a user for the data needed to create a TaxReturn. It continues to 
    prompt the user for data as long as any of the following are true. The Social Security number is not in the 
    correct format, with digits and dashes in the appropriate positions. The zip code is not five digits. The 
    marital status does not begin with one of the following: “S”, “s”, “M”, or “m”. The annual income is 
    negative. After all the input data is correct, a TaxReturn object is created and then its values are 
    displayed   */
package taxreturn;
import javax.swing.JOptionPane;
public class PrepareTax 
{
    public static void main(String[] args) 
    {
        String socialSecurityNumber;
        String name, surname, address, city, zipCode, province, maritalStatus;
        double annualIncome;
        do
            socialSecurityNumber = JOptionPane.showInputDialog(null,
                    "Please enter your Social Security number" + "(in the format 99-99-9999)");
        while(isWrongCorrectFormat(socialSecurityNumber));
        surname= JOptionPane.showInputDialog(null,"Please enter your surname");
        name = JOptionPane.showInputDialog(null,"Please enter your name");
        address = JOptionPane.showInputDialog(null,"Please enter your street address"); 
        city = JOptionPane.showInputDialog(null,"Please enter your city"); 
        province = JOptionPane.showInputDialog(null,"Please enter your province"); 
        do
            zipCode = JOptionPane.showInputDialog(null,"Please enter your zip code");
        while(zipCode.length() > 5);
        do
            annualIncome = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter your annual Income"));
        while(annualIncome < 0);
        do
            maritalStatus = JOptionPane.showInputDialog(null,"Please enter your marital status");
        while(doesItStartWith(maritalStatus));
        TaxReturn data = new TaxReturn(socialSecurityNumber,surname, name, address, city, province, zipCode, 
                annualIncome, maritalStatus);
        data.displayData();
    }
    private static boolean isWrongCorrectFormat(String num) 
    {
            return false;
    }
    private static boolean doesItStartWith(String maritalStatus) 
    {
        int count = 0;
        char a =(maritalStatus.charAt(0));
        switch(a)
        {
            case 'M':
                count++;
                break;
            case 'm':
                count++;
                break;
            case 'S':
                count++;
                break;
            case's':
                count++;
                break;
        }
        if(count < 0)
            return true;
        else
            return false;
    }
}