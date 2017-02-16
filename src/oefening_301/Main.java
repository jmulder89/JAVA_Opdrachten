package oefening_301;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame 
{
	public static void main(String args[])
	{
		JFrame frame = new Main();
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Oefening 3.01");
		frame.setContentPane(new Panel() );
		frame.setVisible(true);	
	}
}
