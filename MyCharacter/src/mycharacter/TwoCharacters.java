package mycharacter;
import java.util.Scanner;
/*
 * Filename TwoCharacters.java
 * Written by Thando Ngwenya
 * Written on 11/04/2020
 * Description : 
 */
public class TwoCharacters 
{
    public static void main(String[] args) 
    {
        String colorEyes;
        int numLives, numEyes;
        MyCharacter  character1 = new MyCharacter();
        MyCharacter  character2 = new MyCharacter();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the color of your character");
        colorEyes = input.nextLine();
        character1.setColor(colorEyes);
        
        System.out.println("Please enter the number of eyes of your character");
        numEyes = input.nextInt();
        character1.setNumOfEyes(numEyes);
        
        System.out.println("Please enter the number of lives of your character");
        numLives = input.nextInt();
        character1.setLives(input.nextInt());        
        
        displayCharacter(character1);
    }
    private static void displayCharacter(MyCharacter character1) 
    {
        MyCharacter myChar = character1;
        System.out.println("Character Details\n*****************************************"
                + "Character color \n " + myChar.getColor() + 
                "Number of eyes \n" + myChar.getNumOfEyes() + 
                "Number of lives\n" + myChar.getLives());
    }
}