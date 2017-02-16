package oefening_315_Dobbelsteen;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Panel extends JPanel 
{
	public Panel()
	{
		
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent(g);
		g.drawRoundRect(69, 49, 102, 102, 30, 30);
		g.setColor(Color.WHITE);
		g.fillRoundRect(70, 50, 100, 100, 30, 30);
		g.setColor(Color.BLACK);
		
		g.fillOval(80, 60, 15, 15);
		g.fillOval(113, 93, 15, 15);
		g.fillOval(145, 125, 15, 15);
	}
}
