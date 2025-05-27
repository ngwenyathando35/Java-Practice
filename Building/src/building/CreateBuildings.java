/*
 * Filename CreateBuilding.java
 * Written by Thando Ngwenya
 * Written on 29/09/2020
 * Description : Instantiates objects for the Building, Home and School classes.
 */
package building;
public class CreateBuildings 
{
    public static void main(String[] args) 
    {
        Home kwaGogo = new Home();
        School greyville = new School();
        kwaGogo.setNumBathrooms(0);
        kwaGogo.setSquareFeet(18);
        kwaGogo.setStoreys(1);
        kwaGogo.setNumBedrooms(2);
        greyville.setSquareFeet(200);
        greyville.setStoreys(1);
        greyville.setNumRooms(151);
        greyville.setGradeLevel("from pre-shool to grade 7");
        displayHome(kwaGogo);
        displaySchool(greyville);
       }
    public static void displayHome(Home a)
    {
        System.out.println("This is a home. It is a " + a.getStoreys() + " storey(s) and spans over "
                + a.getSquareFeet() + " square feet.\n"
                + "It has " + a.getNumBedrooms() + " bedrooms and " + a.getBathrooms() + " bathrooms");
    }
    public static void displaySchool(School a)
    {
        System.out.println("This is a school. It is a " + a.getStoreys() + " storey(s) and spans over "
                + a.getSquareFeet() + " square feet.\n"
                + "It has " + a.getNumClassrooms() + " classrooms and its grade level is " + a.getGradeLevel());
    }
}