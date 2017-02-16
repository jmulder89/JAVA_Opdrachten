package oefening_311_en_312;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends JFrame 
{
	public static void main( String args[] )
	{
		JFrame frame = new Main();
		frame.setTitle("Oefening 3.11");
		frame.setSize(600, 220);
		frame.setLocation(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel() );
		frame.setContentPane(new tekenPanel() );
		frame.setVisible(true);
	}
}


