package quiz;
import java.util.Scanner;
public class Quiz1 
{
    public static void main(String[] args) 
    {
        String q1 = "What is Cassper Nyovest's first name?\n" + "(a)Mufasa\n(b)Tsholofelo\n(c)Refiloe\n";
        String q2 = "Which venue did he first fill up?\n" + "(a)Orlando Stadium\n(b)The Dome\n(c)FNB Stadium\n";
        String q3 = "What venue is he filling up next?\n" + "(a)Damelin Cafeteria\n(b)Moses Mabhida\n(c)Cape Town Stadium\n";
        String q4 =  "Where is Cassper originally from?\n" + "(a)Braamfontein\n(b)Mafekeng\n(c)Soweto\n";
        String q5 = "Is it true that Cassper was once homeless?\n" + "(a)True\n(b)False\n(c)I don't know the answer \n";
        String q6 = "What was Cassper's first album named?\n" + "(a)Tsholofelo\n(b)Thuto\n(c)Tito Mboweni\n";
         
        Question [] questions = { 
                                    new Question(q1,"c"),
                                    new Question(q2,"b"),
                                    new Question(q3,"b"),
                                    new Question(q4,"b"),
                                    new Question(q5,"a"),
                                    new Question(q6,"a"),
                                };
        takeTest(questions);
    }
   public static void takeTest(Question [] questions)
   {
       int score = 0;
       Scanner Input = new Scanner(System.in);
       for(int i = 0; i < questions.length; i++)
       {
          System.out.print(questions[i].prompt);
          String answer =  Input.nextLine();          
          if(answer.equals(questions[i].answer))
          {
              score++;
          }
       } 
       System.out.print("You got " + score + "/" + questions.length);
   }
}