/* The program seems to be stuck in an infinite loop in the first question that is asked. To exit the loop quicker, you can press the enter key, it will
   throw an indexOutOfBounds exception.
 * Filename Quiz.java
 * Written by Thando Ngwenya
 * Written on 11July2020
 * Description : This application contains an array of 10 multiple-choice quiz questions related to your Thando's favourite hobby(cycling). Each 
        question contains four answer choices. It also creates an array that holds the correct answer to each question—A, B, C or D. It then displays 
        each question and verifies that the user enters only A,B,C or D as the answer—if not, it keeps prompting the user until a valid response is
        entered. If the user responds to a question correctly, it displays “Correct!”; otherwise, it displays “The correct answer is” and the letter of 
        the correct answer. After the user answers all the questions, it displays the number of correct and incorrect answers.                      */
package quiz;
import java.util.Scanner;
public class Quiz 
{
    static int count = 0;
    public static void main(String[] args) 
    {
        char userAnswer;
        char[] answer = {'c', 'c', 'd', 'b', 'd', 'b', 'c', 'a', 'c', 'a'};
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Which race is the longest stage race in SA\n" + "Is it:\n" + 
            "       a) Wines2Whales \n" + "       b) Cape Epic \n" + 
            "       c) Joberg2C\n"      + "       d) Sani2C");
            userAnswer = input.nextLine().charAt(0);
        }
        while(verifyAnswer(userAnswer, answer[0]));
        count++;
        do
        {
            System.out.println("What was Thando's first official race?\n" + "Was it:\n" + 
            "       a) Nissan Trail Seeker\n" + "       b) Wines2whales\n" + 
            "       c) Hollard Juma\n"      + "       d) Discovery 94.7 Ride Joberg");
            userAnswer = input.nextLine().charAt(1);
        }
        while(verifyAnswer(userAnswer, answer[1]));
        if(userAnswer != answer[1])
            System.out.println("The correct answer is " + answer[1]);
        else
        {
            System.out.println("Correct answer!!!");
            count++;
        }
        do
        {
            System.out.println("What was the longest distance Thando has completed in a race?\n" + 
                    "Was it:\n" + 
            "       a) 30  km\n" + "       b) 55  km\n" + 
            "       c) 150 km\n"      + "       d) 94.7  km");
            userAnswer = input.nextLine().charAt(1);
        }
        while(verifyAnswer(userAnswer, answer[2]));
        if(userAnswer != answer[2])
            System.out.println("The correct answer is " + answer[2]);
        else
        {
            System.out.println("Correct answer!!!");
            count++;
        }
        do
        {
            System.out.println("Which race did Thando take the first position in?\n" + 
                    "Was it:\n" + 
            "       a) Amashova\n" + "b) The Gauteng Relay Championships\n" + 
            "       c) The Cape Town Cycle Tour\n"      + "       d) The Winter Fast One");
            userAnswer = input.nextLine().charAt(1);
        }
        while(verifyAnswer(userAnswer, answer[3]));
        if(userAnswer != answer[3])
            System.out.println("The correct answer is " + answer[3]);
        else
        {
            System.out.println("Correct answer!!!");
            count++;
        }
        do
        {
            System.out.println("Which category of cycling does Thando do?\n" + "Was it:\n" + 
            "       a) Road \n" + "       b) BMX \n" + "       c) Track\n" + "       d) Mountain Biking");
            userAnswer = input.nextLine().charAt(1);
        }
        while(verifyAnswer(userAnswer, answer[4]));
        if(userAnswer != answer[4])
            System.out.println("The correct answer is " + answer[4]);
        else
        {
            System.out.println("Correct answer!!!");
            count++;
        }
        do
        {
            System.out.println("Which race does Thando wish to participate in\n" + "Is it:\n" + 
            "       a) Wines2Whales \n" + "       b) Cape Epic \n" + 
            "       c) Joberg2C\n"      + "       d) Sani2C");
            userAnswer = input.nextLine().charAt(1);
        }
        while(verifyAnswer(userAnswer, answer[5]));
        if(userAnswer != answer[5])
            System.out.println("The correct answer is " + answer[6]);
        else
        {
            System.out.println("Correct answer!!!");
            count++;
        }
        do
        {
            System.out.println("Which team does Thando ride for?\n" + "Is it:\n" + 
            "       a) SowetoRocks\n" + "       b) ReGatamogo\n" + 
            "       c) Bhoni4Kasi\n"      + "       d) Soweto Wheelers");
            userAnswer = input.nextLine().charAt(1);
        }
        while(verifyAnswer(userAnswer, answer[6]));
        if(userAnswer != answer[6])
            System.out.println("The correct answer is " + answer[6]);
        else
        {
            System.out.println("Correct answer!!!");
            count++;
        }
        do
        {
            System.out.println("What is Thando's favourite skill on the bike?\n" + "Is it:\n" + 
            "       a) The American Bunny Hop\n" + "       b) Wheelie\n" + 
            "       c) Superman\n"      + "       d) Endo/Stoppie");
            userAnswer = input.nextLine().charAt(1);
        }
        while(verifyAnswer(userAnswer, answer[7]));
        if(userAnswer != answer[7])
            System.out.println("The correct answer is " + answer[6]);
        else
        {
            System.out.println("Correct answer!!!");
            count++;
        }
        do
        {
            System.out.println("What is Thando's favourite cycling brand?\n" + "Is it:\n" + 
            "       a) Specialized\n" + "       b) Giant\n" + 
            "       c) Trek\n"      + "       d) Santa Cruz");
            userAnswer = input.nextLine().charAt(1);
        }
        while(verifyAnswer(userAnswer, answer[8]));
        if(userAnswer != answer[8])
            System.out.println("The correct answer is " + answer[8]);
        else
        {
            System.out.println("Correct answer!!!");
            count++;
        }
        do
        {
            System.out.println("Who introduced Thando to cycling?\n" + "Was it:\n" + 
            "       a) Master\n" + "       b) Calvin\n" + 
            "       c) Maphumulo\n"      + "       d) Ta Bhekzin");
            userAnswer = input.nextLine().charAt(1);
        }
        while(verifyAnswer(userAnswer, answer[9]));
        if(userAnswer != answer[9])
            System.out.println("The correct answer is " + answer[9]);
        else
        {
            System.out.println("Correct answer!!!");
            count++;
        }
        int incorrect = 5 - count;
        System.out.println("You got " + count + " questions correct and " + incorrect + " incorrect answers. ");
    }
    private static boolean verifyAnswer(char userAnswer, char answer)
    {
        if((userAnswer != 'a')||(userAnswer != 'b')||('c' != userAnswer)||('d' != userAnswer))
        {
            System.out.println("Please enter either a, b, c or d");
            return false;
        }
        else
        {
            if(userAnswer != answer)
            {   
                System.out.println("The correct answer is " + answer);
                return false;
            }
            else
            {
                System.out.println("Correct answer!!!");
                return true;
            }
        }                               
    }
}