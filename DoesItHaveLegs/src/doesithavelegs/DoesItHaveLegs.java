/* This programme is far from being finished
 * Filename DoesItHaveLegs.java
 * Written by Thando Ngwenya
 * Written on 10/08/2020
 * Description : This is a guessing game called “Does It Have Legs?”, in which the user thinks of an animal and
    the computer tries to guess what it is. The game continually becomes “smarter” as the user plays because the
    user teaches it how to become more specific with its questions. */
package doesithavelegs;
import java.util.ArrayList;
import java.util.Scanner;

public class DoesItHaveLegs 
{
    public static void main(String[] args) 
    {
        ArrayList<String> animals = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Think of an animal and I'll try to guess it\n"
                + "Does it have legs");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("no"))
            improveKnowledge(animals);
        else
            System.out.println("Yay! I win");
    }
    private static ArrayList<String> improveKnowledge(ArrayList<String> animals) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("I give up. What was your animal?");
        String answer = input.nextLine();
        animals.add(answer);
        return animals;
    }
}