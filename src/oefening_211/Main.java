package oefening_211;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame 
{
	public static void main( String args[] )
	{
		JFrame frame = new Main(); 
		frame.setSize( 400, 200 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Oefening 2.11");
		JPanel paneel = new Paneel();
		frame.setContentPane(paneel);
		frame.setVisible(true);
	}
}
