package salesbonus;
import java.util.Scanner;
public class SalesBonus 
{
    public static void main(String[] args) 
    {
        final int MIN_ITEMS = 3;
        final int MIN_VALUE = 1000;
        final int SALES_BONUS = 50;
        int bonus = 0;
        int itemsSold;
        int totalValue;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of items you sold>> ");
        itemsSold = input.nextInt();
        
        System.out.println("Please enter the total amount of items>> ");
        totalValue = input.nextInt();
        if((itemsSold >= MIN_ITEMS)&&(totalValue >= MIN_VALUE))
            bonus = SALES_BONUS;
        System.out.println("You sold "+itemsSold+" items, which made a totol of "+totalValue+", therefore you'll get a bonus of "+bonus);
            //else
            //System.out.println("You sold "+itemsSold+" items, which made a totol of "+totalValue+", therefore you'll get a bonus of "+bonus);
                
        
    }
    
}
