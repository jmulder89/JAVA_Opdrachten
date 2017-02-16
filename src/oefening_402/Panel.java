package oefening_402;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel 
{
	private JTextField input_1, input_2, output;
	private JLabel label_out, label_in1, label_in2;
	private JButton knop_1;
	
	public Panel()
	{
		setLayout(null);
		
		label_in1 = new JLabel("Getal 1");
		label_in1.setBounds(70, 20, 40, 15);
		
		label_in2 = new JLabel("Getal 2");
		label_in2.setBounds(250, 20, 44, 15);
		
		input_1 = new JTextField(10);
		input_1.setBounds(50, 40, 80, 20);
		input_1.setHorizontalAlignment(JTextField.CENTER);
		
		input_2 = new JTextField(10);
		input_2.setBounds(230, 40, 80, 20);
		input_2.setHorizontalAlignment(JTextField.CENTER);
		
		label_out = new JLabel("Het gemiddelde");
		
		output = new JTextField(10);
		output.setBounds(130, 80, 100, 30);
		output.setEditable(false);
		output.setHorizontalAlignment(JTextField.CENTER);
		
		knop_1 = new JButton("GO!!");
		knop_1.setBounds(140, 130, 80, 20);
		knop_1.addActionListener(new Handler() );
		
		add(label_in1);
		add(label_in2);
		add(input_1);
		add(input_2);
		add(output);
		add(knop_1);
	}
	
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) 
		{
			String input1 = input_1.getText();
			double temp1 = Double.parseDouble(input1);
			
			String input2 = input_2.getText();
			double temp2 = Double.parseDouble(input2);
			
			double resultaat= (temp1 + temp2) / 2;
			
			output.setText( String.format( "%.2f", resultaat) );
			
		}
		
	}
}
