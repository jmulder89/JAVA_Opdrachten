package Oefening_505;
import javax.swing.*;
import java.awt.*;
import java.text.*;

public class Panel extends JPanel
{
    NumberFormat formatter = new DecimalFormat("#0.00");
    private int lay, sort;

    public Panel()
    {
        sort = 1;
        lay = 10;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(double num = 10.25; num <= 12.00; num+=0.25){
           g.drawString(sort + " ", 10, 10 + lay);
           g.drawString(formatter.format(num) + " ", 40, 10 + lay);
           sort++;
           lay+=20;
        }
    }

}
