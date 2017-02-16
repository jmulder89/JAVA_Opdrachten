package JAVAboek302;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame 
{
	public static void main(String args[])
	{
		JFrame frame = new Main();
		frame.setSize(250, 110);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Oefening 3.02");
		frame.setContentPane(new Panel() );
		frame.setVisible(true);	
		frame.setLocation(500, 150);
	}
}
