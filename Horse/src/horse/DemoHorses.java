/* Filename DemoHorses.java
 * Written by Thando Ngwenya
 * Written on 18/08/2020
 * Description : This application demonstrates using objects of each class to demonstrate inheritance
                 Works as intended  */
package horse;
public class DemoHorses 
{
    public static void main(String []args)
    {
        RaceHorse horse = new RaceHorse();
        horse.setName("Jamludi");
        horse.setColor("Brown");
        horse.setBirthYear(2020);
        horse.setNumOfRaces(2);
        display(horse);
    }
    private static void display(RaceHorse horse) 
    {
        String name = horse.getName();
        String color = horse.getColor();
        int numRaces = horse.getNumOfRaces();
        int year = horse.getBirthYear();
        System.out.println("The horse's name is " + name + "\n"
                + "It is " + color + " in color\n"
                + "It was born in the year " + year
                + "\nIt has participated in " + numRaces + " race(s)");
    }
    
}