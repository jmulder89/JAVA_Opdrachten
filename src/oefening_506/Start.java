package oefening_506;
import javax.swing.*;

public class Start extends JFrame
{

    public static void main(String args[]) {
        JFrame start = new JFrame();
        start.setTitle("Oefening 5.06");
        start.setSize(300, 200);
        start.setLocation(450, 130);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setContentPane(new Panel());
        start.setVisible(true);
    }
}