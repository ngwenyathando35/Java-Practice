package thandoquiz;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ThandoQuiz 
{
    public static void main(String[] args) 
    {
       
        Scanner quiz = new Scanner(System.in);
        JOptionPane frame = new JOptionPane(System.out);
        int right = 0, wrong = 0, invalid = 0;
        String topic;
        System.out.println("Please select a quiz topic and type your selection below.\n Wrestling \n Music \n Cars \n Food ");
        topic = quiz.next();
        if (topic.equalsIgnoreCase("hobby")) 
        {
        
            System.out.println("Please answer the following questions with either a T for True or F for False \n Is John Cena still in the WWE?");
            String A = quiz.next();
            if (A.equalsIgnoreCase("T")) 
            {
                JOptionPane.showMessageDialog(null, "That is correct", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } 
            else if (A.equalsIgnoreCase("F")) 
            {
                JOptionPane.showMessageDialog(null, "That is incorrect. The correct answer is true", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid reponse please respond with either T or F", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }

            System.out.println("Dwayne Johnson was not a wrestler before he was a movie star");
            String B = quiz.next();
            if (B.equalsIgnoreCase("F")) 
            {
                JOptionPane.showMessageDialog(null, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } 
            else if (B.equalsIgnoreCase("T")) 
            {
                JOptionPane.showMessageDialog(null, "That is incorrect, Dwayne Johnson was a wrestler before he was a wrestler.", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }

            System.out.println("Female wrestlers fight male wrestler regularly");
            String C = quiz.next();
            if (C.equalsIgnoreCase("F")) 
            {
                JOptionPane.showMessageDialog(null, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (C.equalsIgnoreCase("T")) 
            {
                JOptionPane.showMessageDialog(null, "That is incorrect, Female wrestlers dont fight male wrestler at all.", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            if (right >= 2) 
            {
                JOptionPane.showMessageDialog(null, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : pass");
            } else {
                JOptionPane.showMessageDialog(null, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : fail");
            }
        } else if (topic.equalsIgnoreCase("Music")) 
        {

            System.out.println("Please answer the following questions with either a true or false \n Hip Hop originated in America");
            String A2 = quiz.next();
            if (A2.equalsIgnoreCase("T")) 
            {
                JOptionPane.showMessageDialog(null, "That is correct", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } 
            else if (A2.equalsIgnoreCase("F")) 
            {
                JOptionPane.showMessageDialog(null, "That is incorrect. The correct answer is true", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            System.out.println("Nicki Minaj's first name is Nicole");
            String B2 = quiz.next();
            if (B2.equalsIgnoreCase("F")) 
            {
                JOptionPane.showMessageDialog(null, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (B2.equalsIgnoreCase("T")) 
            {
                JOptionPane.showMessageDialog(null, "That is incorrect, Nicki Minaj's first name is Onica", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            System.out.println("Drake is an Indian rapper");
            String C3 = quiz.next();
            if (C3.equalsIgnoreCase("F")) 
            {
                JOptionPane.showMessageDialog(null, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } 
            else if (C3.equalsIgnoreCase("T")) 
            {
                JOptionPane.showMessageDialog(null, "That is incorrect, Drake is a mixed race rapper", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            if (right >= 2) 
            {
                JOptionPane.showMessageDialog(null, "You got " + right + " Correct answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : pass");
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "You got " + right + " Correct answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : fail");
            }
        } else if (topic.equalsIgnoreCase("cars")) 
        {

            System.out.println("Please answer the following questions with either a true or false \n Mercedes is german brand of cars");
            String A4 = quiz.next();
            if (A4.equalsIgnoreCase("T")) 
            {
                JOptionPane.showMessageDialog(null, "That is correct", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (A4.equalsIgnoreCase("F")) 
            {
                JOptionPane.showMessageDialog(null, "That is incorrect. The correct answer is true", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }

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

            System.out.println("Renault made the range rover");
            String C4 = quiz.next();
            if (C4.equalsIgnoreCase("F")) 
            {
                JOptionPane.showMessageDialog(null, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } 
            else if (C4.equalsIgnoreCase("T")) 
            {
                JOptionPane.showMessageDialog(null, "That is incorrect, The Range Rover was made by Land Rover", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            if (right >= 2) 
            {
                JOptionPane.showMessageDialog(null, "You got " + right + " Correct answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : pass");
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "You got " + right + " Correct answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : fail");
            }
        } else if (topic.equalsIgnoreCase("Food")) 
        {
            System.out.println("Please answer the following questions with either a true or false \n A burger contains multiple layers of topping");
            String A5 = quiz.next();
            if (A5.equalsIgnoreCase("T")) {
                JOptionPane.showMessageDialog(null, "That is correct", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (A5.equalsIgnoreCase("F")) 
            {
                JOptionPane.showMessageDialog(null, "That is incorrect. The correct answer is true", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }

            System.out.println("A pizza was originated in ");
            String B5 = quiz.next();
            if (B5.equalsIgnoreCase("F")) 
            {
                JOptionPane.showMessageDialog(null, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } 
            else if (B5.equalsIgnoreCase("T")) 
            {
                JOptionPane.showMessageDialog(null, "That is incorrect, Julius Malema is the current EFF president", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid reponse please respond with either true or false", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }

            System.out.println("Vetkoeks are healthy ");
            String C5 = quiz.next();
            if (C5.equalsIgnoreCase("F")) 
            {
                JOptionPane.showMessageDialog(null, "That is correct ", "Correct", JOptionPane.INFORMATION_MESSAGE);
                right = right + 1;
            } else if (C5.equalsIgnoreCase("T")) {
                JOptionPane.showMessageDialog(null, "That is incorrect, Vetkoeks are not healthy ", "Incorrect", JOptionPane.INFORMATION_MESSAGE);
                wrong = wrong + 1;
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "Invalid reponse please respond with either T or F", "Error", JOptionPane.ERROR_MESSAGE);
                invalid = invalid + 1;
            }
            if (right >= 2) {
                JOptionPane.showMessageDialog(null, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : pass");
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "You got " + right + " corect answers, " + invalid + " invalid answers and " + wrong + " incorrect answer out of 3 questions. \n Result : fail");
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Invalid reponse Please choose a topic \n Please restart", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}
