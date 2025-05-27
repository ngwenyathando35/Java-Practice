/* StackOverFlow Error
 * Filename UsePackage.java
 * Written by Thando Ngwenya
 * Written on 27/08/2020
 * Description : The program instantiates three objects of each type (Package and InsuredPackage) using a variety 
        of weights and shipping method codes. It then display's the results for each Package and InsuredPackage.
 */
package pkgpackage;
public class UsePackage 
{
    public static void main(String[] args) 
    {
        //A laptop that weighs 2 ounces that will be transported by mail;
        Package laptop = new Package(2,'M');
        //A tv that weighs 6 ounces that will be transported by air;
        Package tv = new Package(6,'A');
        //A bicycle that weighs 10 ounces that will be transported by train;
        Package bicycle = new Package(10,'T');
        InsuredPackage phone = new InsuredPackage(1, 'A');
        phone.addInsurance(phone.getCost());
        laptop.display();
        phone.display();
        tv.display();
        bicycle.display();
    }
}