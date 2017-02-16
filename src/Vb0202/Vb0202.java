package Vb0202;
import javax.swing.*;
import java.awt.event.*;

public class Vb0202 extends JFrame 
{
	public static void main( String args[] ) 
	{
		JFrame frame = new Vb0202();
		frame.setSize( 400, 200 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "Voorbeeld 0202");
		JPanel paneel = new Paneel();
		frame.setContentPane(paneel);	
		frame.setVisible(true);
	}
}

class Paneel extends JPanel
{
	private JButton knop;
	private JButton herstelknop;
	private JTextField tekstvak;
	//private JTextField tekstvak2;
	
	public Paneel()
	{
		//knop 1
		knop = new JButton("Confirm");
		KnopHandler kh = new KnopHandler();
		knop.addActionListener( kh );
		
		//knop 2 - de "veeg uit" knop
		herstelknop = new JButton("Veeg uit");
		HerstelKnopHandler hkh = new HerstelKnopHandler();
		herstelknop.addActionListener( hkh );
		
		tekstvak = new JTextField(10);
		//tekstvak2 = new JTextField(20);
		add (knop);
		add (tekstvak);
		add (herstelknop);
		//add (tekstvak2);
	}
	
	class KnopHandler implements ActionListener
	{
		public void actionPerformed( ActionEvent a)
		{
			tekstvak.setText("Je hebt geklikt!!!");
		}
	}
	class HerstelKnopHandler implements ActionListener
	{
		public void actionPerformed( ActionEvent a)
		{
			tekstvak.setText("");
		}
	}
}