/* Filename TestBloodData.java
 * Written by Thando Ngwenya
 * Written on 19/04/2020
 * Description : This program asks the user to enter their blood type and Rh factor for their blood. It then
                 echos it back to the user but in this case the values are already set and not from the user
*/

package blooddata;
public class TestBloodData 
{
    // I comment out this header because the is another main method within this progject public static void main(String[] args) 
    {
        BloodData data1 = new BloodData();
        data1.setBloodType("A");
        data1.setRhFactor('-');
        char rhFactor = data1.getRhFactor();
        String bloodType = data1.getBloodType();
        System.out.println("Your blood type is " + bloodType +
                "\nYour Rh factor is " + rhFactor);
    }
}