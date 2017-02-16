package Oefening_505;
import javax.swing.*;

public class Start extends JFrame
{
    public static void main ( String args[])
    {
        JFrame start = new JFrame();
        start.setTitle("Oefening 5.05");
        start.setSize(150, 300);
        start.setLocation(540, 150);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setContentPane(new Panel());
        start.setVisible(true);
    }
}
