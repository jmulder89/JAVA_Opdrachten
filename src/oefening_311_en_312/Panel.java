package oefening_311_en_312;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class tekenPanel extends JPanel 
{
	private JButton knopLinks, knopRechts, knopGroei;
	private int x_Loc, diameter;
	
	public tekenPanel()
	{
		setBackground(Color.YELLOW);
		x_Loc = 30;
		diameter = 50;
		
		knopRechts = new JButton("RIGHT-->");
		knopRechts.addActionListener(new Handler() );
		
		knopLinks = new JButton("<--LEFT");
		knopLinks.addActionListener(new Handler_2() );
		
		knopGroei = new JButton("!!GROEI!!");
		knopGroei.addActionListener(new Handler_3() );
		
		add(knopLinks);
		add(knopGroei);
		add(knopRechts);
	}
	
	public void paintComponent(  Graphics g )
	{
		super.paintComponent( g );
		g.setColor(Color.RED);
		g.fillOval(x_Loc, 50, diameter, diameter);
	}

	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent a) 
		{
			x_Loc += 10; 
			repaint();
		}
		
	}
	
	class Handler_2 implements ActionListener
	{
		public void actionPerformed(ActionEvent b) 
		{
			x_Loc -= 10;
			repaint();
		}
		
	}
	
	class Handler_3 implements ActionListener
	{
		public void actionPerformed(ActionEvent c) 
		{
			diameter += 10;
			repaint();
		}
		
	}
}
