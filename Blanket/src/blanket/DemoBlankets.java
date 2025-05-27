/* NoClassDefinition error
 * Filename DemoBlankets.java
 * Written by Thando Ngwenya
 * Written on 17Sep2020
 * Description : This application demonstrates how all the methods that are described in the other classes within
        this package work.
 */
package blanket;
import java.util.Scanner;
public class DemoBlankets 
{
    public static void main(String[] args) 
    {
        Blanket blanket = new Blanket();
        ElectricBlanket elctBlnkt = new ElectricBlanket();
        String material, colour, size;
        boolean offFeature = false;
        int numHeat;
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, Welcome to Thando's Blanket *********************\n"
                + "What color blanket do you want");
        colour = input.nextLine();
        blanket.setColor(colour);
        System.out.println("What material would you like the blanket to be made out of\n"
                + "Enter cashmere, wool or cotton");
        material = input.nextLine();
        blanket.setMaterial(material);
        System.out.println("How big do you want the blanket to be\n"
                + "Enter queen, twin or king");
        size = input.nextLine();
        blanket.setSize(size);
        blanket.toString();
        System.out.println("If you would like to make the same blanket to be electric, \n"
                + "How many heat features would you like it to have \n"
                + "They cannot be more less than one or more than 5 ");
        numHeat = input.nextInt();
        elctBlnkt.setNumHeatSetting(numHeat);
        System.out.println("Do you want the blanket to be have on off feature");
        String shutOffFeature;
        shutOffFeature = input.nextLine();
        if(shutOffFeature.equalsIgnoreCase("yes"))
            offFeature = true;
        elctBlnkt.setFeatures(offFeature);
        elctBlnkt.toString(material, offFeature);
    }
}