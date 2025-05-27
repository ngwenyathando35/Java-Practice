package randomguess;
import javax.swing.JOptionPane;
/*
 * Filename RandomGuess.java
 * Written by Thando Ngwenya
 * Written on 07/06/2020
 * Description : It is a game that displays two dialog boxes in sequence. The first asks
                 the user to think of a number between 1 and 10. The second displays a randomly
                 generated number; the user can see whether his or her guess was accurate.
 */
public class RandomGuess 
{
    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null,"Think of a number between 1 and 10");
        JOptionPane.showMessageDialog(null,"The number is "+(1 + (int)(Math.random() * 10)));
    }
}