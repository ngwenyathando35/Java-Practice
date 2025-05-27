/*
 * Filename Thando'sRandomGuess.java
 * Written by The Enigma
 * Written on 26/11/2018
 */
package thando.s.randomguess;

import javax.swing.JOptionPane;

public class ThandoSRandomGuess 
{
    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null,"Think of a number between 1 and 10");
        JOptionPane.showMessageDialog(null,"The number is "+(1 + (int)(Math.random() * 10)));
    }
    
}
