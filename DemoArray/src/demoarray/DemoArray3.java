/*
Programmer	: Thando Ngwenya
Date		: 25/05/2018
Program		: DemoArray3
Description	: It basically shows how arrays work
*/
package demoarray;
public class DemoArray3 
{
    public static void main(String[] args) 
    {
        //Declaring and creating an array using and initialiser list
        double[] salaries = {6.25, 7.25, 8, 6.85, 8.89};
         
         //Displaying the salaries one by one using a for loop
         for(int sub = 0; sub < salaries.length; ++sub)
System.out.println(salaries[sub]);
    }
}
