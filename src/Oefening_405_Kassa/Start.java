package Oefening_405_Kassa;
import javax.swing.*;

public class Start extends JFrame {

    public static void main(String args[]){
        JFrame start = new JFrame();
        start.setTitle("4.05");
        start.setLocation(300, 400);
        start.setSize(200, 300);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setContentPane(new Panel());
        start.setVisible(true);
    }
}
