package lease;
/*
 * Filename .Leasejava
 * Written by Thando Ngwenya
 * Written on 11/04/2020
 * Description : 
 */
public class Lease 
{
    private String name;
    private int apartmentNumber, rent, leaseTerm;
    public Lease()
    {
        name = "XXX";
        apartmentNumber = 0;
        rent = 1000;
        leaseTerm = 12;
    }   
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
    public void setApartmentNumber(int an)
    {
        apartmentNumber = an;
    }
    public int getApartmentNumber()
    {
        return apartmentNumber;
    }
    public void setRent(int r)
    {
        rent = r;
    }
    public int getRent()
    {
        return rent;
    }
    public void setLeaseTerm(int lt)
    {
        leaseTerm = lt;
    }
    public int getLeaseTerm()
    {
        return leaseTerm;
    }
    public void addPetFee()
    {
        final int PET_FEE = 10;
        rent = rent + PET_FEE;
        explainPetPolicy();
    }
    public static void explainPetPolicy()
    {
        System.out.println("R10 will be added to your rent because you have a pet");
    }
}