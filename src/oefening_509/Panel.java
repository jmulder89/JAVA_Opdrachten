package oefening_509;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel {

    private JTextField input;
    private int user_In;

    public Panel(){
        input = new JTextField(5);
        input.addActionListener(new hand());
        add(input);
    }

    class hand implements ActionListener{
        public void actionPerformed(ActionEvent arg0){
            user_In = Integer.parseInt(input.getText());
            repaint();
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(user_In % 4 == 0 && user_In %100 != 0 || user_In % 400 == 0){
            g.drawString("Het ingevoerde jaar is een schrikkeljaar.", 20, 50);
        }else{
            g.drawString("Het ingevoerde jaar is geen schrikkeljaar.", 20, 50);
        }
    }
}
