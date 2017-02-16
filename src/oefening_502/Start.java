package oefening_502;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Start extends JFrame {

	public static void main( String args[]) {
		JFrame start = new JFrame();
		start.setTitle("Oefening 5.2");
		start.setSize(230, 130);
		start.setLocation(500, 300);
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setContentPane(new Panel() );
		start.setVisible(true);
	}
}
