package JAVAboek307;
import javax.swing.*;
import java.awt.*;

class TekenPanel extends JPanel 
{
	public TekenPanel()
	{
		setBackground(Color.CYAN);
	}
	
	public void paintComponent( Graphics f)
	{
		super.paintComponent(f);
		f.setColor(Color.DARK_GRAY);
		f.fillRect(20, 30, 10, 400);
		f.setColor(Color.RED);
		f.fillRect(30, 33, 150, 30);
		f.setColor(Color.WHITE);
		f.fillRect(30, 63, 150, 30);
		f.setColor(Color.BLUE);
		f.fillRect(30, 93, 150, 30);
	}
}
