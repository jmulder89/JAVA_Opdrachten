package cijferDing;
import javax.swing.*;

public class Main extends JPanel 
{
	public static void main( String args[] )
	{
		JFrame frame = new JFrame();
		frame.setTitle("Ding");
		frame.setSize(400, 300);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel() );
		frame.setVisible(true);
	}
}
