package JAVAboek303;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
	public static void main( String args[])
	{
		JFrame frame = new  Main();
		frame.setSize(320, 180);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Oefening 3.03");
		frame.setLocation(500, 150);
		frame.setContentPane(new Panel() );
		frame.setVisible(true);
	}
}
