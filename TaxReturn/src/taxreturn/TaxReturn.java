/* Filename TaxReturn.java
 * Written by Thando Ngwenya
 * Written on 31/05/2020
 * Description : This class has fields that hold a taxpayer’s Social Security number, surname, name, street 
    address, city, province, zip code, annual income, marital status, and tax liability. It also includes a 
    constructor that requires arguments that provide values for all the fields other than the tax liability. The 
    constructor calculates the tax liability based on annual income and the percentages
 */
package taxreturn;

import javax.swing.JOptionPane;

public class TaxReturn 
{
    private String socialSecurityNumber;
    private String name, surname, address, city, zipCode, province, maritalStatus;
    private double annualIncome, taxLiability;
    
    public TaxReturn(String sassaNumber ,String surname, String name, String streetAddress, String city, 
            String province, String zipCode, Double annualIncome,String maritalStatus)
    {
        socialSecurityNumber = sassaNumber;
        this.name = name;
        this.surname = surname;
        this.address = streetAddress;
        this.annualIncome = annualIncome;
        this.city = city;
        this.maritalStatus = maritalStatus;
        this.province = province;
        this.zipCode = zipCode;
        if((annualIncome > 0 && annualIncome > 20000) && maritalStatus == "single")
            taxLiability = annualIncome * 0.15;
        else
            taxLiability = annualIncome * 0.14;
        if((annualIncome > 20001 && annualIncome > 50000) && maritalStatus == "single")
            taxLiability = annualIncome * 0.22;
        else
            taxLiability = annualIncome * 0.20;
        if(annualIncome > 50001 && maritalStatus == "single")
            taxLiability = annualIncome * 0.30;
        else
            taxLiability = annualIncome * 0.28;
    }
    public void displayData()
    {
        JOptionPane.showMessageDialog(null,"Social Security Number >> " + socialSecurityNumber +
                "\nSurname                >> " + surname +
                "\nName                   >> " + name +
                "\nStreet address         >> " + address +
                "\nCity                   >> " + city +
                "\nProvince               >> " + province +
                "\nZip Code               >> " + zipCode +
                "\nAnnual Income          >> " + annualIncome +
                "\nMarital Status         >> " + maritalStatus +
                "\nTax Liability          >> " + taxLiability);
    }
}