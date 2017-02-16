package JAVAboek210;
import javax.swing.*;
import java.awt.event.*;

public class oef2_10 extends JFrame 
{
	public static void main (String args[])
	{
		JFrame frame = new oef2_10();
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("oefening 2.10");
		JPanel paneel = new Paneel();
		frame.setContentPane(paneel);
		frame.setVisible(true);
	}
}

class Paneel extends JPanel
{
	private JButton knop;
	private JTextField tekstvak;
	private JButton knop2;
	
	public Paneel()
	{
		knop = new JButton("Voornaam");
		knop.addActionListener( new KnopHandler() );
		tekstvak = new JTextField(10);
		knop2 = new JButton("Achternaam");
		knop2.addActionListener( new KnopHandler2() );
		
		add (knop);
		add (tekstvak);
		add (knop2);
	}
	
	class KnopHandler implements ActionListener
	{		
		public void actionPerformed(ActionEvent arg0) 
		{
			tekstvak.setText("Jeroen");	
		}
	}
	
	class KnopHandler2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			tekstvak.setText("Mulder");
		}
		
	}
}