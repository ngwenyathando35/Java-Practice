/* Filename Salesperson.java
 * Written by Thando Ngwenya
 * Written on 07/04/2020
 * Description : This class creates data fields for object Salesperson which includes an integer ID number and 
    a double annual sales amount.Methods include a constructor that requires values for both data fields, as 
    well as get and set methods for each of the data fields. The program works as intended  */
package salesperson;
public class Salesperson
{
    private int idNumber;
    private double annualSalesAmount;
    public Salesperson(int idNum, double amount)
    {
        idNumber = idNum;
        annualSalesAmount = amount;
    }
    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }
    public void setAnnualSalesAmount(double amount)
    {
        annualSalesAmount = amount;
    }
    public int getIdNUmber()
    {
        return idNumber;
    }
    public double getAnnualSalesAmount()
    {
        return annualSalesAmount;
    }
}