/* Filename InsuredCarDemo.java
 * Written by Thando Ngwenya
 * Written on 09Sep2020
 * Description : This is a demonstration program that instantiates an InsuredCar object and displays its values
        Works as intended*/
package vehicle;
import javax.swing.*;
public class InsuredCarDemo
{
    public static void main(String[] args)
    {
        InsuredCar myCar = new InsuredCar();
        JOptionPane.showMessageDialog(null, myCar.toString());  
    }
}