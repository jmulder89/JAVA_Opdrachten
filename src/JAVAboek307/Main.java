package JAVAboek307;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame 
{
	public static void main( String args[] )
	{
		JFrame frame = new Main();
		frame.setSize(250, 400);
		frame.setLocation(500, 200);
		frame.setTitle("Oefening 3.07");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new TekenPanel() );
		frame.setVisible(true);
	}
	
}
