/* Filename DemoCandles.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This application instantiates an object of each type and displays the details. Works as intended*/
package candle;
public class DemoCandles 
{
    public static void main(String[] args) 
    {
        ScentedCandle candle = new ScentedCandle();
        candle.setColor("Purple");
        candle.setHeight(2);
        candle.setScent("Lavender");
        System.out.println("The candle is " + candle.getColor() + " in color."
                + "\nIt is " + candle.getHeight() + " inches tall."
                + "\nIt has a " + candle.getScent() + " scent."
                + "\nIt costs R" + candle.getPrice());
    }
}