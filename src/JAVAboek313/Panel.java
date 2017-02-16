package JAVAboek313;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Panel extends JPanel 
{
	private int charlotteLengte,
				welmerLengte,
				noaLengte;
	
	public Panel()
	{
		setBackground(Color.WHITE);
		charlotteLengte = 128;
		welmerLengte = 135;
		noaLengte = 105;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(50, 30, 1, 350);
		g.fillRect(50, 30, 350, 1);
		g.setColor(Color.RED);
		g.fillRect(51, 50, charlotteLengte * 2, 40);
		g.setColor(Color.YELLOW);
		g.fillRect(51, 110, welmerLengte * 2, 40);
		g.setColor(Color.BLUE);
		g.fillRect(51, 170, noaLengte * 2, 40);
	}
}
