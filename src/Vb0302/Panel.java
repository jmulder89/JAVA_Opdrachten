package Vb0302;
import java.awt.Graphics;

import javax.swing.*;

class Panel extends JPanel
{
	private int a, b, som, verschil,
						product, quotient, rest;
	
	public Panel()
	{
		a = 10;
		b = 8;
		som = a + b;
		verschil = a - b;
		product = a * b;
		quotient = a / b;
		rest = a % b;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent( g );
		g.drawString("a = " + a + " b = " + b, 10, 20);
		g.drawString("de som is " + som, 10, 50);
		g.drawString("Het verschil is " + verschil,  10, 70);
		g.drawString("het product is " + product, 10, 90);
		g.drawString("Het quotient is " + quotient, 10, 110);
		g.drawString("De rest is " + rest, 10, 130);
	}
}
