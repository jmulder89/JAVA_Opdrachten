package oefening_501;
import javax.swing.*;

public class Start extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main( String args[] )
	{
		JFrame start = new JFrame();
		start.setTitle("Oefening 5.1");
		start.setSize(420, 130);
		start.setLocation(500, 200);
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setContentPane(new Panel() );
		start.setVisible(true);
	}
}
