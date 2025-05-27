/* Filename PetSold.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This is a subclass named PetSold that descends from ItemSold and includes three Boolean fields 
                 that indicate whether the pet has been vaccinated, neutered, and housebroken. It also includes
                 get and set methods for the fields.  */
package itemsold;
public class PetSold extends ItemSold
{
    private boolean isVaccinated, isNeutered, isHousebroken;
    public void setIsVaccinated(boolean vaccinated)
    {
        isVaccinated = vaccinated;
    }
    public void setIsNeutere(boolean neutered)
    {
        isNeutered = neutered;
    }
    public void setIsHousebroken(boolean houseBroken)
    {
        isHousebroken = houseBroken;
    }
    public boolean getIsVaccinated()
    {
        return isVaccinated;
    }
    public boolean getIsNeutered()
    {
        return isNeutered;
    }
    public boolean getIsHouseBroken()
    {
        return isHousebroken;
    }
    public void display(PetSold pet)
    {
        pet.display(pet);
        System.out.println("Is the pet housebroken?   >> " + pet.getIsHouseBroken()
                      + "\n Is the pet castrated pet? >> " + pet.getIsNeutered() 
                      + "\n Is the pet vaccinated?    >> " + pet.getIsVaccinated());
    }
}