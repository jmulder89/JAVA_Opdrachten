package JAVAboek305;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame 
{
	public static void main ( String args [])
	{
		JFrame frame = new Main();
		frame.setTitle("Oefning 3.05");
		frame.setSize(200, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new TekenPanel() );
		frame.setLocation(500, 150);
		frame.setVisible(true);
	}
}
