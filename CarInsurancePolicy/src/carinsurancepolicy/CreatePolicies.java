package carinsurancepolicy;
/*
 * Filename Create Policies.java
 * Written by Thando Ngwenya
 * Written on 16/04/2020
 * Description : O 
 */
public class CreatePolicies 
{
    public static void main(String[] args) 
    {
        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
        CarInsurancePolicy third = new CarInsurancePolicy (789, 12, "Newcastle");
        first.display();
        second.display();
        third.display();
    }
}