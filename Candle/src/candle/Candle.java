/*
 * Filename Candle.java
 * Written by Thando Ngwenya
 * Written on 18Aug2020
 * Description : Mick’s Wicks makes candles in various sizes. This is a class for the business named Candle that
                 contains data fields for color, height, and price. It also has get methods for all three fields
                 It has set methods for color and height, but not for price. because when height is set, the
                 price is determined as $2 per inch. Works as intended */
package candle;
public class Candle 
{
    private String color;
    protected double height;
    protected double price;
    public void setColor(String colour)
    {
        color = colour;
    }
    public String getColor()
    {
        return color;
    }
    public void setHeight(double height)
    {
        this.height = height;
        price = this.height * 2;
    }
    public double getHeight()
    {
        return height;
    }
    public double getPrice()
    {
        return price;
    }
}