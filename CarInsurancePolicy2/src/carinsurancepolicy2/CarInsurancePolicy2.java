package carinsurancepolicy2;
/*
 * Filename CarInsurancePolicy2.java
 * Written by Thando Ngwenya
 * Written on 16/04/2020
 * Description : Using the this Reference to Make Constructors More Efficient
 */
public class CarInsurancePolicy2
{
    //Uninitialised data fields
    private int policyNumber;
    private int numPayments;
    private String residentCity;
    //Constructor that accepts parameters to initialise the data fields
    public CarInsurancePolicy2(int num, int payments, String city)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }
    //Overloaded constructor by using different parameter list
    public CarInsurancePolicy2(int num, int payments)
    {
        this(num, payments, "Mayfield");
    }   
    //Another overloaded constructor
    public CarInsurancePolicy2(int num)
    {
        this(num, 2, "Mayfield");
    }
    public void display()
    {
        System.out.println("Policy #" + policyNumber + ". " +
        numPayments + " payments annually. Driver resides in " +
        residentCity + ".");
    }
}