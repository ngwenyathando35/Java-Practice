package carinsurancepolicy;
/*
 * Filename CarInsurancePolicy.java
 * Written by Thando Ngwenya
 * Written on 16/04/2020
 * Description : 
 */
public class CarInsurancePolicy
{
    //Uninitialised data fields
    private int policyNumber;
    private int numPayments;
    private String residentCity;
    //Constructor that accepts parameters to initialise the data fields
    public CarInsurancePolicy(int num, int payments, String city)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }
    //Overloaded constructor by using different parameter list
    public CarInsurancePolicy(int num, int payments)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = "Mayfield";
    }
    //Another overloaded constructor
    public CarInsurancePolicy(int num)
    {
        policyNumber = num;
        numPayments = 2;
        residentCity = "Mayfield";
    }
    public void display()
    {
        System.out.println("Policy #" + policyNumber + ". " +
        numPayments + " payments annually. Driver resides in " +
        residentCity + ".");
    }
}