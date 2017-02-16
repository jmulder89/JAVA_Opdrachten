package oefening_315_Dobbelsteen;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends JFrame
{
	public static void main( String args[] )
	{
		JFrame frame = new Main();
		frame.setSize(260, 260);
		frame.setTitle("Dobbelsteen");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel() );
		frame.setLocation(500, 200);
		frame.setVisible(true);
	}
}
