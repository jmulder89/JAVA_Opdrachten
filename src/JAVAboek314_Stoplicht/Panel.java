package JAVAboek314_Stoplicht;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel 
{
	public Panel()
	{
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(220, 50, 60, 170);
		g.fillRect(242, 220, 15, 200);
		g.setColor(Color.RED);
		g.fillOval(230, 60, 40, 40);
		g.setColor(Color.YELLOW);
		g.fillOval(230, 110, 40, 40);
		g.setColor(Color.GREEN);
		g.fillOval(230, 160, 40, 40);
	}
}
