package JAVAboek301;
import java.awt.Graphics;
import javax.swing.*;

class Panel extends JPanel 
{
	private int sec, min, 
					sINu,		//sINu = seconden IN een uur 
					sINd,		//sINd = seconden IN een dag 
					sINj;		//sINj = seconden IN een jaar
	
	public Panel()
	{
		sec = 1;
		min = sec * 60;
		sINu = min * 60;
		sINd = sINu * 24;
		sINj = sINd * 365;
	}
	
	public void paintComponent( Graphics g)
	{
		super.paintComponent( g );
		g.drawString(sINu + " seconden in een uur.", 30, 30);
		g.drawString(sINd + " seconden in een dag.", 30, 50);
		g.drawString(sINj + " seconden in een jaar.", 30, 70);
	}
}
