/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg2;

/**
 *
 * @author The Reall Man B
 */
import java.util.Scanner;

public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double Volume;
        double l = length();
        double w = width();
        double h = height();
        
        Volume = l * w * h;
        System.out.println("The Volume of your box is: "+Volume+"m.");
    }
    
    public static double width()
    {
            double width;
            
            
             Scanner keyboard = new Scanner (System.in);
             
             System.out.println("Please Enter the Width.");
             width = keyboard.nextDouble();
             
             return width;
            }
    
     public static double length()
    {
            double length;
            
            
             Scanner keyboard = new Scanner (System.in);
             
             System.out.println("Please Enter the Length.");
             length = keyboard.nextDouble();
             
             return length;
            }
            
      public static double height()
    {
            double height;
            
            
             Scanner keyboard = new Scanner (System.in);
             
             System.out.println("Please Enter the Height.");
             height = keyboard.nextDouble();
             
             return height;
            }
    
}
