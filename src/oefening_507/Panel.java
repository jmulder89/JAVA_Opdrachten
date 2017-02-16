package oefening_507;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel {
    private JTextField input;
    private JLabel lbl;
    private int userIn;

    public Panel(){
        lbl = new JLabel("Input a number");
        add(lbl);

        input = new JTextField(6);
        input.addActionListener(new handler());
        add(input);
    }

    class handler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String temp = input.getText();
            int tempI = Integer.parseInt(temp);
            userIn = tempI;
            repaint();
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 1; i <= userIn; i++){
            g.drawRect(300-10*i, 150-10*i, 5+20*i, 5+20*i);
            repaint();
        }
    }
}
