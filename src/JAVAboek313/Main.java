package JAVAboek313;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends JFrame
{
	public static void main( String args[] )
	{
		JFrame frame = new Main();
		frame.setTitle("Oefening 3.13");
		frame.setSize(500, 500);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel() );
		frame.setVisible(true);
	}
}
