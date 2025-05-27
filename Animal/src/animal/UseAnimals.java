/*
 * Filename UseAnimals.java
 * Written by the textbook pg 540
 * Written on 07Sep2020
 * Description : Demonstrating abstract classes and showing that when the the subclass methods are called, they 
        respond with the appropriate method calls. Works as intended */
package animal;
public class UseAnimals
{
    //public static void main(String[] args)
    {
        Dog myDog = new Dog();
        Cow myCow = new Cow();
        Snake mySnake = new Snake();
        myDog.setName("My dog Murphy");
        myCow.setName("My cow Elsie");
        mySnake.setName("My snake Sammy");
        System.out.print(myDog.getName() + " says ");
        myDog.speak();
        System.out.print(myCow.getName() + " says ");
        myCow.speak();
        System.out.print(mySnake.getName() + " says ");
        mySnake.speak();
    }
}