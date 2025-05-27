/*
 * Filename TwoEventParticipant.java
 * Written by Thando Ngwenya
 * Written on 19Sep2020
 * Description : This application has two arrays of at least eight Participants each—one holds Participants in 
        the mini-marathon, and the other holds Participants in the diving competition. It then prompts the user 
        for participant values. After the data values are entered, it displays values for Participants who are in 
        both events.
 */
package participant;
import java.util.Scanner;
public class TwoEventParticipant 
{
    public static void main(String[] args)
    {
        Participant[] miniMarathon = new Participant[8];
        Participant[] divingMarathon = new Participant[8];
        populateArray(miniMarathon);
        populateArray(divingMarathon);
        for(int x = 0; x < miniMarathon.length; x++)
        {
            if(miniMarathon[x].equals(divingMarathon[x]))
                System.out.println("It was suppose to display the toString() method");//toString();
        }
    }
    private static Participant[] populateArray(Participant[] array) 
    {
        String name, address;
        int age;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Please enter your name");
            name = sc.nextLine();
            System.out.println("Please enter your street address");
            address = sc.nextLine();
            System.out.println("Please enter your age");
            age = sc.nextInt();
            array[i] = new Participant(name, address, age);
        }
        return array;
    }
}