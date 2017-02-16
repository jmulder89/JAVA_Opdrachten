package voorBeeld_307_plus_oef309_en_310;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{
	public static void main( String args[] )
	{
		JFrame frame = new Main();
		frame.setTitle("Voorbeeld 0307");
		frame.setSize(550, 120);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel() );
		frame.setVisible(true);		
	}
}
