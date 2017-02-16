package JAVAboek308;
import javax.swing.*;
import java.awt.*;

class Panel extends JPanel 
{
	public Panel()
	{
		setBackground(Color.LIGHT_GRAY);
	}
	
	public void paintComponent( Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(50, 50, 300, 300);
		g.setColor(Color.WHITE);
		g.fillRect(150, 50, 100, 100);
		g.fillRect(50, 150, 100, 100);
		g.fillRect(250, 150, 100, 100);
		g.fillRect(150, 250, 100, 100);
	}
}
