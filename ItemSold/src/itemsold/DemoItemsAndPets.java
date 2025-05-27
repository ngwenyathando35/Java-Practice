/* Stack Overflow error: I need to find out what it means
 * Filename DemoItemsAndPets.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This application creates two objects of each class(ItemSold and PetSold),and demonstrates that 
                 all the methods work correctly.
*/
package itemsold;
import java.util.Scanner;
public class DemoItemsAndPets 
{
    public static void main(String[] args) 
    {
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();
        System.out.println("Object Details");
        promptItemData(item1);
        promptItemData(item2);
        System.out.println("Pet Details");
        promptPetData(pet1);
        promptPetData(pet2);
        item1.display(item1);
        item2.display(item2);
        pet1.display(pet1);
        pet2.display(pet2);
    }
    private static void promptItemData(ItemSold item) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the description of the item");
        String description = input.nextLine();
        item.setDescription(description);
        System.out.println("Please enter the invoice number");
        int invoice = input.nextInt();
        item.setInvoiceNumber(invoice);
        System.out.println("Please enter the price");
        double price = input.nextDouble();
        item.setPrice(price);
    }
    private static void promptPetData(PetSold pet1) 
    {
        String vaccine, training, castrated;
        Scanner input = new Scanner(System.in);
        promptItemData(pet1);
        System.out.println("Is it vaccinated");
        vaccine = input.nextLine();
        if(vaccine.equalsIgnoreCase("yes"))
            pet1.setIsVaccinated(true);
        else
            pet1.setIsVaccinated(false);
        System.out.println("Is it trained");
        training = input.nextLine();
        if(training.equalsIgnoreCase("yes"))
            pet1.setIsHousebroken(true);
        else
            pet1.setIsHousebroken(false);
        System.out.println("Is it castrated");
        castrated = input.nextLine();
        if(castrated.equalsIgnoreCase("yes"))
            pet1.setIsNeutere(true);
        else
            pet1.setIsNeutere(false);
    }
}