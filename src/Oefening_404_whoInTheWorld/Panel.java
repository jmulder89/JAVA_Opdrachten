package Oefening_404_whoInTheWorld;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField 	numPeeps, jaar;
	private JButton 	advance;
	private JLabel		jaartal, bevolk_dicht;
	
	public Panel()
	{
		setLayout(new GridLayout(3, 2, 5, 5));
		Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder( border );
		
		jaartal = new JLabel("Jaartal");
		jaartal.setHorizontalAlignment(JLabel.CENTER);
		
		bevolk_dicht = new JLabel("Aantal mensen");
		bevolk_dicht.setHorizontalAlignment(JLabel.CENTER);
		
		numPeeps = new JTextField(10);
		numPeeps.setHorizontalAlignment(JTextField.CENTER);
		
		advance = new JButton("One year later");
		advance.addActionListener(new Handler() );
		
		jaar = new JTextField(10);
		jaar.setHorizontalAlignment(JTextField.CENTER);
		
		add(jaartal);
		add(bevolk_dicht);
		add(jaar);
		add(numPeeps);
		add(advance);
	}
	
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			String numPeeps_temp = numPeeps.getText();
			double num_temp = Double.parseDouble(numPeeps_temp);
			
			double num_cent = num_temp / 100 * 2;
			double result = num_temp + num_cent;
			
			numPeeps.setText( String.format( "%.2f", result) );
			
			String jaar_temp = jaar.getText();
			int jaar_int = Integer.parseInt(jaar_temp);
			
			int jaar_out = jaar_int + 1;
			
			jaar.setText("" + jaar_out);
		}
		
	}
}
