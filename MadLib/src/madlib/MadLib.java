package madlib;
import java.util.Scanner;
/*
 * Filename MadLib.java
 * Written by Thando Ngwenya
 * Written on 09/04/2020
 * Description :  Game that generates sentences using words provided by the user
 */
public class MadLib 
{
    public static void main(String[] args) 
    {
        String word1, word2, word3, word4;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first word");
        word1 = input.nextLine();
        System.out.println("Please enter your second word");
        word2 = input.nextLine();
        System.out.println("Please enter your third word");
        word3 = input.nextLine();
        System.out.println("Please enter your fourt and last word");
        word4 = input.nextLine();
        System.out.println("Mary had a little " + word1 +
                ".\n Its " + word2 + " was as " + word3 + " snow\n" +
                "And everywhere where Mary studied, the " + word4 + 
                " was sure to go");
        
    }
}