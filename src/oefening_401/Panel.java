package oefening_401;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel
{
	private JButton knop1;
	private JTextField maandSalaris, jaarSalaris;
	private JLabel label_ma, label_ja;
	
	public Panel()
	{
		setLayout(null);
		
		label_ma = new JLabel("Je maand salaris");
		label_ma.setBounds(70, 40, 120, 20);
		
		maandSalaris = new JTextField(10);
		maandSalaris.setHorizontalAlignment(JTextField.RIGHT);
		maandSalaris.addActionListener(new TextHandler() );
		maandSalaris.setBounds(180, 40, 90, 20);
		
		label_ja = new JLabel("Je jaar salaris");
		label_ja.setBounds(70, 70, 120, 20);
		
		jaarSalaris = new JTextField(10);
		jaarSalaris.setHorizontalAlignment(JTextField.RIGHT);
		jaarSalaris.setBounds(180, 70, 90, 20);
		jaarSalaris.setEditable(false);
		
		knop1 = new JButton("Bereken");
		knop1.addActionListener(new KnopHandler()  );
		knop1.setBounds(130, 110, 100, 30);
		
		add(label_ma);
		add(maandSalaris);
		add(label_ja);
		add(jaarSalaris);
		add(knop1);
	}
	
	class TextHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent b) 
		{
			String input = maandSalaris.getText();
			double temp = Double.parseDouble(input);
			
			double resultaat = temp * 12;
			
			jaarSalaris.setText( String.format("%.2f", resultaat));
		}
		
	}
	
	class KnopHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent a) 
		{
			String input = maandSalaris.getText();
			double temp = Double.parseDouble(input);
			
			double resultaat = temp * 12;
			
			jaarSalaris.setText( String.format("%.2f", resultaat));
		}
		
	}
}
