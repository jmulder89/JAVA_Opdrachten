package Vb0302;
import javax.swing.*;
import java.awt.*;

import javax.swing.JFrame;

public class Main extends JFrame
{
	public static void main ( String args[] )
	{
		JFrame frame = new Main();
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Vb0302");
		frame.setContentPane( new Panel() );
		frame.setVisible(true);
	}
	
	
}
