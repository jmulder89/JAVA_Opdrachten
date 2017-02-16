package oefening_501;
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

	private JTextField invoer_1, invoer_2;
	private JButton check;
	private JLabel result;
	
	public Panel()
	{
		setLayout(new GridLayout(2, 2, 5, 5 ));
		Border border = BorderFactory.createEmptyBorder(8, 8, 8, 8);
		setBorder( border );
		
		invoer_1 = new JTextField();
		invoer_1.setHorizontalAlignment(JTextField.CENTER);
		
		invoer_2 = new JTextField();
		invoer_2.setHorizontalAlignment(JTextField.CENTER);
		
		check = new JButton("Check");
		check.addActionListener(new Handler() );
		
		result = new JLabel("");
		
		add(invoer_1);		add(invoer_2);
		add(result);		add(check);
		
	}
	
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) 
		{
			String inStr1 = invoer_1.getText();
			double inNum1 = Double.parseDouble(inStr1);
			
			String inStr2 = invoer_2.getText();
			double inNum2 = Double.parseDouble(inStr2);
			
			if(inNum1 > inNum2)
			{
				double numTemp = inNum1;
				inNum1 = inNum2;
				inNum2 = numTemp;
				
				invoer_1.setText( String.format("%.0f", inNum1) );
				invoer_2.setText( String.format("%.0f", inNum2) );
				
				result.setText("The numbers where switched.");
			}
			else
			{
				result.setText("The numbers where not switched");
			}
		}
		
	}
}
