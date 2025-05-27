/* Filename UseDivision.java
 * Written by Thando Ngwenya
 * Written on 15Sep2020
 * Description : This application creates an InternationalDivision and DomesticDivision objects for two different
        companies and displays information about them. Works as intended */
package divisions;
public class UseDivision 
{
    public static void main(String[] args) 
    {
        InternationalDivision div1 = new InternationalDivision("Thando Cycleworks", 264548454);
        DomesticDivision div2 = new DomesticDivision("Phillip Cycleworks", 123456789, "Gauteng");
        div1.country = "South Africa";
        div1.language = "Zulu";
        div1.display();
        System.out.print("\n");
        div2.display();
    }
}