package oefening_316;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Panel extends JPanel 
{
	private JButton knop1, knop2, knop3;
	private JTextField NUMman, NUMvrouw, totaal;
	private int man, woman;
	
	public Panel()
	{
		man = 0;
		woman = 0;
		
		NUMman = new JTextField(5);
		NUMvrouw = new JTextField(5);
		totaal = new JTextField(5);
		
		knop1 = new JButton("    man +");
		knop1.addActionListener(new manHandler() );//LOL XD
		
		knop2 = new JButton(" vrouw +");
		knop2.addActionListener(new womanHandler() );//LOLOLOL X'D
		
		knop3 = new JButton("TOTAAL");
		knop3.addActionListener(new totHandler() );
		
		add(NUMman);
		add(knop1);
		add(NUMvrouw);
		add(knop2);
		add(totaal);
		add(knop3);
	}
	
	class manHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			man++;
			NUMman.setText("" + man);
		}
		
	}
	
	class womanHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			woman++;
			NUMvrouw.setText("" + woman);
		}
		
	}
	
	class totHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			int total = man + woman;
			totaal.setText("" + total);
		}
		
	}
}
