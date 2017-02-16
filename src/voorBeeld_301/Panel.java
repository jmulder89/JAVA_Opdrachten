package voorBeeld_301;
import javax.swing.*;
import java.awt.*;

import java.awt.Graphics;

public class Panel extends JPanel
{
	private int a;
	private int b;
	private int antwoord;
	
	public Panel()
	{
		a = 174;
		b = 26;
		antwoord = a + b;
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		g.drawString("Overzicht van de berekening: ", 40, 25);
		g.drawString("a = " + a, 40, 45);
		g.drawString("b = " + b, 40, 65);
		g.drawString("de som is: " + antwoord, 40, 80);
	}
}
