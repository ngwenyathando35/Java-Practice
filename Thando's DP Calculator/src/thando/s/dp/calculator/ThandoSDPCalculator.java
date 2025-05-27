/*
 * Filename Thando's DP Calculator.java
 * Written by Thando The Enigma
 * Written on 27/11/2018
 */
package thando.s.dp.calculator;
import java.util.Scanner;
public class ThandoSDPCalculator 
{
    public static void main(String[] args) 
    {
        int yearOfStudy, testMark, assignment1Mark, assignment2Mark, examPercentage = 50, dpMark, requiredMark;
        System.out.println("Year of Study Enter either 1, 2 or 3");
        Scanner input = new Scanner(System.in);
        yearOfStudy = input.nextInt();
        
        if(yearOfStudy >=2 & yearOfStudy < 4)
        {
            System.out.println("Please enter your Individual assignment mark");
            assignment1Mark = input.nextInt();
            
            System.out.println("Please enter your test mark");
            testMark = input.nextInt();
            
            System.out.println("Please enter your Group Assignment mark");
            assignment2Mark = input.nextInt();  
            
           dpMark =(int)((assignment1Mark*0.2)+(assignment2Mark*0.2)+((testMark*0.1)));
           System.out.println("Your DP mark before the exam is :" + dpMark);
           requiredMark = examPercentage - dpMark;
           System.out.println("To pass this semester you need "+ requiredMark +"% from the exam");
        }
        else if(yearOfStudy == 1)
        {
            System.out.println("Please enter your Individual assignment mark");
            assignment1Mark = input.nextInt();
            
            System.out.println("Please enter your test mark");
            testMark = input.nextInt();
            
            System.out.println("Please enter your Group Assignment mark");
            assignment2Mark = input.nextInt();  
            
           dpMark =(int)((assignment1Mark*0.1)+(assignment2Mark*0.1)+((testMark*0.2)));
           System.out.println("Your DP mark before the exam is :" + dpMark);
           requiredMark = 60 - dpMark;
           System.out.println("To pass this semester you need "+ requiredMark+"% from the exam");
        }
    }
}