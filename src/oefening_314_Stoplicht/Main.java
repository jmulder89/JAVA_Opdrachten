package oefening_314_Stoplicht;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame
{
	public static void main( String args[] )
	{
		JFrame frame = new Main();
		frame.setTitle("Stoplicht");
		frame.setSize(500, 500);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel() );
		frame.setVisible(true);
	}
}
