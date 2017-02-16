package oefening_504;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel
{
    private JTextField  input;
    private JLabel      inputLbl;
    private int         num;

    public Panel(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int t = 1; t <= 10; t++){
            g.drawRect(20 + 10*t,20 + 10*t,20 + 10*t,20 + 10*t);
            repaint();
        }
    }
}
