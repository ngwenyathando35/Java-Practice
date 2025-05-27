package question.pkg1;

import javax.swing.JOptionPane;

/**
 * Description: It is a calculator that adds together two numbers 
 * Date: 18 March 2018
 * @author Thando
 */
public class Question1 
{
   public static void main(String[] args) 
	{
		//Declaring variables that will be used for the calculation
		String num1;
		String num2;
		double sum;
                
                JOptionPane frame= new JOptionPane (System.out);
                try
                {
                    //Requesting a values from the user and storing the data in a variable
                    num1 = JOptionPane.showInputDialog(null,
				"Please enter a value",
				"Sum Calculator",
				JOptionPane.INFORMATION_MESSAGE);
		
                    num2 = JOptionPane.showInputDialog(null,
				"Please enter another value",
				"Sum Calculator",
				JOptionPane.INFORMATION_MESSAGE);
		
                    //Converting variables to usable data and calculating the sum of those numbers
                    sum = Double.parseDouble(num1)+Double.parseDouble(num2);
		
                    //Displaying the result of the above calculation using a dialog box
                    JOptionPane.showMessageDialog(null,"The sum of " + num1+  " and " + num2 + " is " + sum);
                }
                catch (NumberFormatException ex)
                {
                    JOptionPane.showInputDialog(frame,
				"Please enter a number",
				"Error",
				JOptionPane.INFORMATION_MESSAGE);
                }
				
	}

}
