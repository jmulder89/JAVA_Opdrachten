package Oefening_404_whoInTheWorld;
import javax.swing.*;

public class Start extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[])
	{
		JFrame frame = new JFrame();
		frame.setTitle("Who on the World!");
		frame.setSize(350, 170);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane( new Panel() );
		frame.setVisible(true);
		
	}
}
