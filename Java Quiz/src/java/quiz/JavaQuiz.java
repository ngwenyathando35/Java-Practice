package JavaQuiz;
//importing the classes needed for input and in this case output

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaQuiz 
{
    public static void main(String[] args) 
    {
        // initialization of the imported classes
        Scanner quiz = new Scanner(System.in);
        JOptionPane frame = new JOptionPane(System.out);
        int right = 0, wrong = 0, invalid = 0;
        String topic;
        
        System.out.println("Please select a quiz topic and type your selection below.\n Hobby \n Music \n Cars \n Politics ");
        topic = quiz.next();
        
        if (topic.equalsIgnoreCase("hobby")) 
        {
            //Question 1
            System.out.println("Please answer the following questions with either a true or false \n In Africa the other name "
                    + "for soccer is foootball");
            
            String A = quiz.next();
            if (A.equalsIgnoreCase("True")) 
            {
                JOptionPane.showMessageDialog(frame, "That is correct", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } 
            else if (A.equalsIgnoreCase("false")) 
            {
                JOptionPane.showMessageDialog(frame,"That is incorrect. The correct answer is true","Incorrect",JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(frame,"Invalid reponse please respond with either true or false","Error               ",JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            //Question2
            System.out.println("Playstation 2 is the most recent PlayStation console available");
            String B = quiz.next();
            if (B.equalsIgnoreCase("False")) 
            {
                JOptionPane.showMessageDialog
                (frame,"That is correct","Correct",JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } 
            else if (B.equalsIgnoreCase("true")) 
            {
                JOptionPane.showMessageDialog
                (frame,"That is incorrect, PlayStation 4 is the latest Playstation console.","Incorrect ",JOptionPane.INFORMATION_MESSAGE);
            wrong = wrong + 1;
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            //Question3
            System.out.println("Fifa is a konami game");
            String C = quiz.next();
            if (C.equalsIgnoreCase("False")) 
            {
                JOptionPane.showMessageDialog
                (frame, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } 
            else if (C.equalsIgnoreCase("true")) 
            {
                JOptionPane.showMessageDialog
                (frame, "That is incorrect, FIFA is an Electronics Arts game.", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } else 
            {
                JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            if (right >= 2) {
                JOptionPane.showMessageDialog(frame, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : pass");
            } else {
                JOptionPane.showMessageDialog(frame, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : fail");
            }
        }   
        else if (topic.equalsIgnoreCase("Music")) 
             {
        //Question 1
            System.out.println("Please answer the following questions with either a true or false \n Gospel music is a music genre for spreading God's good news");
            String A2 = quiz.next();
            if (A2.equalsIgnoreCase("True")) {
                JOptionPane.showMessageDialog(frame, "That is correct", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (A2.equalsIgnoreCase("false")) {
                JOptionPane.showMessageDialog(frame, "That is incorrect. The correct answer is true", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
//Question2
            System.out.println("Drake is a South African pop singer");
            String B2 = quiz.next();
            if (B2.equalsIgnoreCase("False")) {
                JOptionPane.showMessageDialog(frame, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (B2.equalsIgnoreCase("true")) {
                JOptionPane.showMessageDialog(frame, "That is incorrect, Drake is an american rapper", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
//Question3
            System.out.println("The hit record lollipop released in 2008 was released by Migos featuring Static Major");
            String C3 = quiz.next();
            if (C3.equalsIgnoreCase("False")) {
                JOptionPane.showMessageDialog(frame, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (C3.equalsIgnoreCase("true")) {
                JOptionPane.showMessageDialog(frame, "That is incorrect, Lollipop was released by Lil Wayne and Static Major", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            if (right >= 2) {
                JOptionPane.showMessageDialog(frame, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : pass");
            } else {
                JOptionPane.showMessageDialog(frame, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : fail");
            }
        } else if (topic.equalsIgnoreCase("cars")) {
//Question 1
            System.out.println("Please answer the following questions with either a true or false \n BMW stands for Bavarian Motor Works");
            String A4 = quiz.next();
            if (A4.equalsIgnoreCase("True")) {
                JOptionPane.showMessageDialog(frame, "That is correct", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (A4.equalsIgnoreCase("false")) {
                JOptionPane.showMessageDialog(frame, "That is incorrect. The correct answer is true", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
//Question2
            System.out.println("Mercedes Benz is a french vehicle");
            String B4 = quiz.next();
            if (B4.equalsIgnoreCase("False")) {
                JOptionPane.showMessageDialog(frame, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (B4.equalsIgnoreCase("true")) {
                JOptionPane.showMessageDialog(frame, "That is incorrect, Mercedes Benz is a german vehicle", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
//Question3
            System.out.println("Peugeot is a german vehicle maker");
            String C4 = quiz.next();
            if (C4.equalsIgnoreCase("False")) {
                JOptionPane.showMessageDialog(frame, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (C4.equalsIgnoreCase("true")) {
                JOptionPane.showMessageDialog(frame, "That is incorrect, Peugeot is a french vehicle maker", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            if (right >= 2) {
                JOptionPane.showMessageDialog(frame, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : pass");
            } else {
                JOptionPane.showMessageDialog(frame, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : fail");
            }
        } else if (topic.equalsIgnoreCase("Politics")) {
//Question 1
            System.out.println("Please answer the following questions with either a true or false \n Nelson Mandela was the first Black South African President");
            String A5 = quiz.next();
            if (A5.equalsIgnoreCase("True")) {
                JOptionPane.showMessageDialog(frame, "That is correct", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (A5.equalsIgnoreCase("false")) {
                JOptionPane.showMessageDialog(frame, "That is incorrect. The correct answer is true", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
//Question2
            System.out.println("Thabo Mbeki is the current EFF president");
            String B5 = quiz.next();
            if (B5.equalsIgnoreCase("False")) {
                JOptionPane.showMessageDialog(frame, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (B5.equalsIgnoreCase("true")) {
                JOptionPane.showMessageDialog(frame, "That is incorrect, Julius Malema is the cureent EFF president", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
//Question3
            System.out.println("Jacob Zuma is South Africa's new deputy president ");
            String C5 = quiz.next();
            if (C5.equalsIgnoreCase("False")) {
                JOptionPane.showMessageDialog(frame, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (C5.equalsIgnoreCase("true")) {
                JOptionPane.showMessageDialog(frame, "That is incorrect, David Mabuza is South Africa's new deputy president ", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            if (right >= 2) {
                JOptionPane.showMessageDialog(frame, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : pass");
            } else {
                JOptionPane.showMessageDialog(frame, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : fail");
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid reponse please respond with with a topic of your choice \n Please restart", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}
