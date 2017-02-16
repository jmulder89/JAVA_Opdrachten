package oefening_504;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Start extends JFrame
{

    public static void main( String args[])
    {
        JFrame start = new JFrame();
        start.setTitle("Oefening 5.04");
        start.setSize(300, 350);
        start.setLocation(400, 100);
        start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        start.setContentPane(new Panel());
        start.setVisible(true);
    }

}
