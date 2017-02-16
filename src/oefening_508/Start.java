package oefening_508;
import javax.swing.*;

public class Start extends JFrame {

    public static void main(String args[]){
        JFrame start = new JFrame();
        start.setTitle("5.08");
        start.setLocation(300, 200);
        start.setSize(200, 200);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setContentPane(new Panel());
        start.setVisible(true);
    }
}
