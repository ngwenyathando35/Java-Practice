package randomguess3;
import javax.swing.JOptionPane;
/* Filename RandomGuess.java
 * Written by Thando Ngwenya
 * Written on 08/05/2020
 * Description : It is a game that displays two dialog boxes in sequence. The first asks the user to think of a 
    number between 1 and 10. The second displays if the user's number was correct, too high, or too low..
 */
public class RandomGuess3
{
    public static void main(String[] args) 
    {
        int no, num, count;
        num = (1 + (int)(Math.random() * 10));
        do
        {
            no = Integer.parseInt( JOptionPane.showInputDialog(null,"Enter a number between 1 and 10"));
            if(no > num)
                JOptionPane.showMessageDialog(null,"Your number is higher ");
            else 
            if(no < num)
                JOptionPane.showMessageDialog(null,"Your number is lower ");
        }
        while(no != num);
        JOptionPane.showMessageDialog(null,"You guessed correctly ");
    }
}