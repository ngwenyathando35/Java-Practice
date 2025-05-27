/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg5;

/**
 *
 * @author The Reall Man B
 */
import java.util.Scanner;
        
public class Question5 {
    
    public static void main(String[] args) 
    {
        
        Asterisks();
    }
       
    public static void Asterisks()
    {
        Scanner keyboard = new Scanner(System.in);
     
     System.out.println("Enter The Number of Rows");
     
     int placer = keyboard.nextInt();
        
        for (int a = 1; a <= placer ; a++)
        {
            for (int b = 1; b <= a; b++)
     {
        System.out.print("*"); 
     }
     
        System.out.println("");
        }
        
   for (int c = placer  ; c >= 1 ; c--)
        {
            for (int d = c   ; d > 1 ; d--)
     {
        System.out.print("*"); 
     }
     
        System.out.println("");
    }
    }
}
