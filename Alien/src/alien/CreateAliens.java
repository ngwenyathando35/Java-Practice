/* Filename CreateAliens.java
 * Written by Thando Ngwenya
 * Written on 05Sep2020
 * Description : This is an application that instantiates one Martian and one Jupiterian. It calls the toString() 
        method with each object and displays the results. Works as intended */
package alien;
public class CreateAliens 
{
    public static void main(String[] args) 
    {
        Martian mar = new Martian(6 , 2 , "Red");
        Jupiterian jup = new Jupiterian(4 , 3 , "Blue");
        System.out.println(mar.toString());
        System.out.println(jup.toString());
    }
}