package boxvolumecalculator;
import java.util.Scanner;
public class BoxVolumeCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Double Length = null;
        System.out.println("Please enter the Length");
        
        if (input.hasNextDouble())
            {
                Length = input.nextDouble();
            }
                System.out.println("The volume of the box is "+ Length);
    
    /*-
                6
                
        System.out.println("Please enter the width of the box");
        Width = Input.nextDouble();
        
        System.out.println("Please enter the height of the box");
        Height = Input.nextDouble();
      
        
        Volume = Length*Width*Height;
        
        System.out.println("The volume of the box is " + Volume);
        */
    }
    

