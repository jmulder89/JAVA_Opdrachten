package JAVAboek316;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends JFrame 
{
	public static void main(String args[] )
	{
		JFrame frame = new Main();
		frame.setTitle("Oefening 3.16");
		frame.setSize(200, 200);
		frame.setLocation(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel() );
		frame.setVisible(true);
	}
}
