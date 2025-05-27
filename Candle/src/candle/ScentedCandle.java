/*
 * Filename ScentedCandle.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : This is a child class named ScentedCandle that contains an additional data field named scent 
                 and methods to get and set it. It overrides the parent’s setHeight() method to set the price of
                 a ScentedCandle object at $3 per inch. Works as intended*/
package candle;
public class ScentedCandle extends Candle
{
    private String scent;
    public void setScent(String smell)
    {
        scent = smell;
    }
    public String getScent()
    {
        return scent;
    }
    @Override
    public void setHeight(double height)
    {
        this.height = height;
        price = this.height * 3;
    }
}