package oefening_402;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame 
{
	public static void main( String args[])
	{
		JFrame frame = new JFrame();
		frame.setTitle("Oefening 4.02");
		frame.setSize(385, 230);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel() );
		frame.setVisible(true);
	}
}
