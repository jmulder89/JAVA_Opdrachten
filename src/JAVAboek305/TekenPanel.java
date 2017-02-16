package JAVAboek305;
import javax.swing.*;
import java.awt.*;

class TekenPanel extends JPanel 
{
	public TekenPanel ()
	{
		setBackground(Color.BLACK);
	}
	
	public void paintComponent(Graphics line)
	{
		super.paintComponent(line);
		line.setColor( Color.WHITE);
		//driehoek / dak
		line.drawLine(150, 20, 20, 150);
		line.drawLine(150, 20, 300, 150);
		line.drawLine(20, 150, 300, 150);
		//oefening 3.06
		line.drawLine(20, 150, 20, 350);
		line.drawLine(300, 150, 300, 350);
		line.drawLine(20, 350, 300, 350);
		//deur
		line.drawLine(40, 200, 40, 350);
		line.drawLine(130, 200, 130, 350);
		line.drawLine(40, 200, 130, 200);
	}
}
