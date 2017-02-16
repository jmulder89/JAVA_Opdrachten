package oefening_509;
import javax.swing.*;

public class Start extends JFrame {

    public static void main (String args[]){
        JFrame start = new JFrame();
        start.setTitle("Oefening 5.09");
        start.setSize(300, 300);
        start.setLocation(300, 250);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setContentPane(new Panel());
        start.setVisible(true);
    }
}
