package lease;
import java.util.Scanner;
/*
 * Filename .java
 * Written by Thando Ngwenya
 * Written on 0/04/2020
 * Description : 
 */
public class TestLease 
{
    public static void main(String[] args) 
    {
        Lease lease1;
        Lease lease2;
        Lease lease3;
        Lease lease4;
        lease1 = getDataMethod();
        lease2 = getDataMethod();
        lease3 = getDataMethod();
        lease4 = new Lease();
        showValues(lease1);
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);
    }
    private static Lease getDataMethod() 
    {
        Lease tempLease = new Lease();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        tempLease.setName(input.nextLine());
        System.out.println("Enter apartment number");
        tempLease.setApartmentNumber(input.nextInt());
        System.out.println("Enter rent amount");
        tempLease.setRent(input.nextInt());
        System.out.println("Enter lease term");
        tempLease.setLeaseTerm(input.nextInt());
        
        return tempLease;
    }
    private static void showValues(Lease lease1) 
    {
        System.out.println("Your name is " + lease1.getName() + 
                "\nYour apartment number is " + lease1.getApartmentNumber() + 
                "\nYour rent is " + lease1.getRent() + 
                "\nThe term for your lease is " + lease1.getLeaseTerm() + 
                "\n***********************************************************");
        lease1.addPetFee();
        System.out.println("Your rent is " + lease1.getRent()); 
    }
}