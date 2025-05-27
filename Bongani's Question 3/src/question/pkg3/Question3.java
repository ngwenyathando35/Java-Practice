/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

/**
 *
 * @author The Reall Man B
 */
import javax.swing.JOptionPane;
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Double num1 = null;
        Double num2 = null;
        double sum;
    
        do{
        try{
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first number"));         
        
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second number"));
        
    }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter a value in digit format", "Input Error",JOptionPane.ERROR_MESSAGE);
        }
        
    
        } while (num1 == null || num2 == null);
        
           sum =  num1 + num2;
            
            JOptionPane.showMessageDialog(null, "The Answer is "  +sum,"Answer",JOptionPane.INFORMATION_MESSAGE);
    }
}