package oefening_302;
import javax.swing.*;
import java.awt.*;

class Panel extends JPanel 
{
	private int a, b, c;
	
	public Panel()
	{
		a = -2_147_483_600;
		b = -2_147_483_600;
		c = a + b;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString(a + " + " + b + " = " + c, 20, 35);
	}
}

