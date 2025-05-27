/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonganiquiz;

/**
 *
 * @author The Reall Man B
 */
import java.util.Scanner;
public class BonganiQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner Choose = new Scanner (System.in);
        
        
        
        
        System.out.println("QUIZ GAME!!!!!");
        
        System.out.println("Press 1 for Music, 2 for Movies, 3 for Swimming, 4 for Cycling & 5 for games");
        
        System.out.println("Topic 1: MUSIC");
        
        System.out.println("Topic 2: MOVIES");
        
        System.out.println("Topic 3: Swimming");
        
        System.out.println("Topic 4: Cycling");
        
        System.out.println("Topic 5: Games");
        int store = Choose.nextInt();
        
         
        if (store == 1)
        {
           System.out.println("Answer t / T for true or f / F for false!");  
            Music();
            Movies();
            Swimming();
            Cycling();
            Games();
        }
        else
        if (store == 2 && store < 3)
        {
            System.out.println("Answer t / T for true or f / F for false!");  

            Movies();
            Swimming();
            Cycling();
            Games();
            
        }
        else
        if (store >= 3 && store < 4)
        {
            System.out.println("Answer t / T for true or f / F for false!");  

            Swimming();
            Cycling();
            Games();
        }
        else
        if (store == 4 && store < 5)
        {
           System.out.println("Answer t / T for true or f / F for false!");           
            Cycling();
            Games();
        }
        else
        if (store ==5 && store == 5 )
        {
           System.out.println("Answer t / T for true or f / F for false!");  
            
            Games();
        }
        
        
        
        
        
    
    }
   public static void Music()
    {
        Scanner keyboard = new Scanner(System.in);
        
        String q1;
        String q2;
        String q3;
        int Q1;
        int Q2;
        int Q3;
        int MusicScore;
       
       
        System.out.println("Music Quiz");
        
        System.out.println("Question 1");
        
        System.out.println("Eminem has a collabo with Ed-Sheeran");
        q1 = keyboard.next();
        if (q1.equals("t"))
        { Q1 = 1;
        System.out.println("Correct");
                
        }
        else 
        {Q1 = 0;
        System.out.println("Incorrect. Answer is True");
        }
        
        System.out.println("Beyonce is married to Nick Cannon");
        q2 = keyboard.next();
        if (q2.equals("f"))
        { Q2 = 1;
          System.out.println("Correct");      
        }
        else 
        {Q2 = 0;
        System.out.println("Incorrect. Answer is False");
        }
        
        System.out.println("Whitney Houston is alive");
        q3 = keyboard.next();
        if (q3.equals("f"))
        { Q3 = 1;
          System.out.println("Incorrect. Answer is False");      
        }
        else 
        {Q3 = 0;
        }
        MusicScore = Q1 + Q2 +Q3;
    
    System.out.println("Your Score for the music section is: " +MusicScore+ "/3");
        

   
    }
   
    

    

public static void Movies()
    {
        Scanner keyboard = new Scanner(System.in);
        
        String q1;
        String q2;
        String q3;
        int Q1;
        int Q2;
        int Q3;
        int MovieScore;
       
        System.out.println("Movie Quiz");
        
        System.out.println("Question 1");
        
        System.out.println("Black Panther was shot in Africa");
        q1 = keyboard.next();
        if (q1.equals("t"))
        { Q1 = 1;
          System.out.println("Correct");      
        }
        else 
        {Q1 = 0;
        System.out.println("Incorrect. Answer is True");
        }
        
        System.out.println("Fifty Shades Freed is the first of all Fifty Shades");
        q2 = keyboard.next();
        if (q2.equals("f"))
        { Q2 = 1;
          System.out.println("Correct");       
        }
        else 
        {Q2 = 0;
        System.out.println("Incorrect. Answer is False");
        }
        
        System.out.println("Tyler Perry plays both Madea and Joe");
        q3 = keyboard.next();
        if (q3.equals("t"))
        { Q3 = 1;
          System.out.println("Correct");       
        }
        else 
        {Q3 = 0;
        System.out.println("Incorrect. Answer is True");
        }
    MovieScore = Q1 + Q2 +Q3;
    
    System.out.println("Your Score for the movies section is: " +MovieScore+ "/3");
    
        
    }

public static void Swimming()
    {
        Scanner keyboard = new Scanner(System.in);
        
        String q1;
        String q2;
        String q3;
        int Q1;
        int Q2;
        int Q3;
        int SwimmingScore;
        
        System.out.println("Swimming Quiz");
        
        System.out.println("Question 1");
        
        System.out.println("A swimmer must always wear a helmet");
        q1 = keyboard.next();
        if (q1.equals("f"))
        { Q1 = 1;
          System.out.println("Correct");      
        }
        else 
        {Q1 = 0;
        System.out.println("Incorrect. Answer is False");
        }
        
        System.out.println("A person can swim naked");
        q2 = keyboard.next();
        if (q2.equals("t"))
        { Q2 = 1;
          System.out.println("Correct");      
        }
        else 
        {Q2 = 0;
        System.out.println("Incorrect. Answer is True");
        }
        
        System.out.println("A person can breath underwater");
        q3 = keyboard.next();
        if (q3.equals("f"))
        { Q3 = 1;
          System.out.println("Correct");       
        }
        else 
        {Q3 = 0;
         System.out.println("Incorrect. Answer is False");
        }
    SwimmingScore = Q1 + Q2 +Q3;
    
    System.out.println("Your Score for the swimming section is: " +SwimmingScore+ "/3");
    
    
        
    }

public static void Cycling()
    {
        Scanner keyboard = new Scanner(System.in);
        
        String q1;
        String q2;
        String q3;
        int Q1;
        int Q2;
        int Q3;
        int CyclingScore;
               
        System.out.println("Cycling Quiz");
        
        System.out.println("Question 1");
        
        System.out.println("Wearing a helmet in South Africa is compulsory");
        q1 = keyboard.next();
        if (q1.equals("t"))
        { Q1 = 1;
          System.out.println("Correct");      
        }
        else 
        {Q1 = 0;
         System.out.println("Incorrect. Answer is True");
        }
        
        System.out.println("A cyclist can cycle anywhere on the road");
        q2 = keyboard.next();
        if (q2.equals("f"))
        { Q2 = 1;
          System.out.println("Correct");      
        }
        else 
        {Q2 = 0;
         System.out.println("Incorrect. Answer is False");
        }
        
        System.out.println("Cyclists must not carry passengers");
        q3 = keyboard.next();
        if (q3.equals("t"))
        { Q3 = 1;
                
        }
        else 
        {Q3 = 0;
        System.out.println("Incorrect. Answer is True");
        }
    CyclingScore = Q1 + Q2 +Q3;
    
    System.out.println("Your Score for the cycling section is: " +CyclingScore+ "/3");
    
    
        
    }
public static void Games()
    {
        Scanner keyboard = new Scanner(System.in);
        
        String q1;
        String q2;
        String q3;
        int Q1;
        int Q2;
        int Q3;
        int GamesScore;
        
        System.out.println("Games Quiz");
        
        System.out.println("Question 1");
        
        System.out.println("Need for Speed has only one version of Most Wanted");
        q1 = keyboard.next();
        if (q1.equals("f"))
        { Q1 = 1;
          System.out.println("Correct");      
        }
        else 
        {Q1 = 0;
         System.out.println("Incorrect. Answer is False");
        }
        
        System.out.println("Fifa has better graphics than PES");
        q2 = keyboard.next();
        if (q2.equals("f"))
        { Q2 = 1;
          System.out.println("Correct");      
        }
        else 
        {Q2 = 0;
         System.out.println("Incorrect. Answer is False");
        }
        
        System.out.println("Call of Duty is a game about Soldiers");
        q3 = keyboard.next();
        if (q3.equals("t"))
        { Q3 = 1;
          System.out.println("Correct");      
        }
        else 
        {Q3 = 0;
         System.out.println("Incorrect. Answer is True");
        }
    GamesScore = Q1 + Q2 +Q3;
    
    System.out.println("Your Score for the music section is: " +GamesScore+ "/3");
    
   
        
    }



}