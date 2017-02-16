package JAVAboek308;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{
	public static void main( String args[] )
	{
		JFrame frame = new Main();
		frame.setTitle("Oefening 3.08");
		frame.setSize(430, 430);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel() );
		frame.setVisible(true);
	}
}
