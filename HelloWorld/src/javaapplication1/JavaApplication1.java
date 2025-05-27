/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Thando
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.print("Please enter your name >>");
        Scanner name = new Scanner(System.in);
        System.out.print("\nMy is " + name + " and I would like to say Hello World ");
    }
    
}
