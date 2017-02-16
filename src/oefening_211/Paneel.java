package oefening_211;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Paneel extends JPanel
{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JTextField inputField;
	
	
	public Paneel()
	{
		button1 = new JButton("Text01");
		button1.addActionListener( new ButtonHandler01() );
		
		button2 = new JButton("Text02");
		button2.addActionListener( new ButtonHandler02() );
		
		button3 = new JButton("Text03");
		button3.addActionListener( new ButtonHandler03() );
		
		inputField = new JTextField(20);
		
		add (inputField);
		add (button1);
		add (button2);
		add (button3);
		
	}
	
	class ButtonHandler01 implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) {
			inputField.setText("The first set of text.");			
		}
	}
	
	class ButtonHandler02 implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			inputField.setText("A different set of words to form text.");
		}
	}
	
	class ButtonHandler03 implements ActionListener
	{
		public void actionPerformed(ActionEvent i) {
			inputField.setText("And once again something different!");	
		}
	}
}
