package oefening_303;
import javax.swing.*;
import java.awt.*;

class Panel extends JPanel 
{
	private int ageINsec, ageINmin, ageINh, ageINday, ageINweek, sec, min, h, day, week, yr;
	
	public Panel()
	{
		sec = 1;
		min = sec *60;
		h = min * 60;
		day = h * 24;
		week = day * 7;
		yr = day * 365;
		ageINsec = 5_454_532;
		ageINmin = ageINsec / min;
		ageINh = ageINsec / h;
		ageINday = ageINsec / day;
		ageINweek = ageINsec / week;
	}

	public void paintComponent( Graphics g)
	{
		super.paintComponent( g );
		g.drawString("Als leeftijd in seconden:      " + ageINsec + " seconden is.", 20, 20);
		g.drawString("Dan is leeftijd in minuten:         " + ageINmin + "  minuten.", 20, 60);
		g.drawString("Dan is leeftijd in uren:               " + ageINh + "  uren.", 20, 80);
		//Oefening 3.04
		g.drawString("Dan is leeftijd in dagen:            " + ageINday + "  dagen.", 20, 100);
		g.drawString("Dan is leeftijd in weken:            " + ageINweek + "  weken.", 20, 120);
		
	}
}

