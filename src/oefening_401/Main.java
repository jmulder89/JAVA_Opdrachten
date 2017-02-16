package oefening_401;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame 
{
	public static void main( String args[] )
	{
		JFrame f = new JFrame();
		f.setTitle("Salaris calculator");
		f.setSize(370, 200);
		f.setLocation(500, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new Panel() );
		f.setVisible(true);
	}
}
