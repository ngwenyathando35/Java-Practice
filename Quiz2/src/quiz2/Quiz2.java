/* Filename Quiz.java
 * Written by Thando Ngwenya
 * Written on 20/05/2020
 * Description : It's a multiple choice question quiz and the 2nd version of Quiz.*/
package quiz2;
import java.util.Scanner;
public class Quiz2 
{
    public static void main(String[] args) 
    {
        String answer;
        int count = 0;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Question about Cycling " +
            "\nWhich race is the longest stage race in SA\n" + 
            "Is it:\n" +
            "       a) Wines2Whales \n" + 
            "       b) Cape Epic \n" +
            "       c) Joberg2C\n" + 
            "       d) Sani2C");
            answer = input.nextLine();
        }
        while(!"Joberg2C".equals(answer));
        do
        {
            System.out.println("\nQuestion about Music" + 
            "\nWhich South African artist is known as Ma Brrr\n" + 
            "Is it:\n" +
            "       a) Lebo Mathosa\n" + 
            "       b) Thembi Seete\n" +
            "       c) Thandiswa Mazwai\n" + 
            "       d) Brenda Fassie");
            answer = input.nextLine();
        }
        while(!"Brenda Fassie".equals(answer));
        do{
            System.out.println("\nQuestion about Thando" + 
            "\nWhat is Thando's second name?\n" + 
            "Is it:\n" +
            "       a) Phillip\n" + 
            "       b) Cheese Boy\n" +
            "       c) Nqobile\n" + 
            "       d) Mxolisi");
            answer = input.nextLine();
        }
        while(!"Phillip".equals(answer));
        do
        {
            System.out.println("\nQuestion about Mxolisi" + 
            "\nWhat is Mxolisi's favourite snack\n" + 
            "Is it:\n" +
            "       a) Peanuts\n" + 
            "       b) Doritos\n" +
            "       c) Marshmallows\n" + 
            "       d) Regals");
            answer = input.nextLine();}
        while(!"Doritos".equals(answer));
        do
        {
            System.out.println("\nQuestion about Soccer" + 
            "\nWhat is the biggest football club in South Africa\n" + 
            "Is it:\n" +
            "       a) Mamelodi Sundowns\n" + 
            "       b) Orlando Pirates\n" +
            "       c) Kaizer Chiefs\n" + 
            "       d) Moroka Swallows");
            answer = input.nextLine();}
        while("Kaizer Chiefs".equals(answer));
        System.out.println("All your answers are correct because this program forces them " +
                " to be correct. " );
    }
}