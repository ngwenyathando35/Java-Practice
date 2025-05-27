package combob;
import java.awt.FlowLayout;
import javax.swing.*;
public class ComboB extends JFrame
{
    JComboBox<String> majorChoice = new JComboBox<String>();
    public ComboB()
    {
        super("Demonstrating ComboBoxes");
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        majorChoice.addItem("English");
        majorChoice.addItem("Math");
        majorChoice.addItem("Sociology");
        add(majorChoice);
    }
    public static void main(String[] args) 
    {
        ComboB frame = new ComboB();
        frame.setVisible(true);
    }
    
}
