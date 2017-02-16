package oefening_508;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel{

    private JTextField input;
    private double fieldIn, cost;

    public Panel(){
        fieldIn = 0;

        input = new JTextField(5);
        input.addActionListener(new handler());
        add(input);
    }

    class handler implements ActionListener{
        public void actionPerformed(ActionEvent arg0){
            fieldIn = Double.parseDouble(input.getText());
            repaint();
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(fieldIn < 10){
            cost = fieldIn * 2.00;
            g.drawString("your price comes to $"+cost, 20,50);
            repaint();
        }else if(fieldIn >= 10 && fieldIn < 50){
            cost = fieldIn * 1.50;
            g.drawString("your price comes to $"+cost, 20,50);
            repaint();
        }else if(fieldIn >= 50 && fieldIn < 100){
            cost = fieldIn * 1.25;
            g.drawString("your price comes to $"+cost, 20,50);
            repaint();
        }else if(fieldIn >= 100){
            cost = fieldIn * 1.00;
            g.drawString("your price comes to $"+cost, 20,50);
            repaint();
        }
    }
}
