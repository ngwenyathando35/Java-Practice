package doistillhaveskills;
import java.util.Scanner;
public class DoIStillHaveSkills 
{
    public static void main(String[] args) 
    {
        String name, surname;
        Integer age;
        
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = Input.nextLine();
        
        System.out.println("Please enter your surname");
        surname = Input.nextLine();
        
        System.out.println("Please enter your age");
        age = Input.nextInt();
        
        System.out.println("Your name is "+name+" and your surname is "+surname+". You are "+age+" years old");
    }
}
