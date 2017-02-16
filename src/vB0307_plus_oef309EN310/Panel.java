package vB0307_plus_oef309EN310;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel
{
	private JTextField input1, input2, output;
	private JButton plusBTN, minBTN, prodBTN, quotBTN, restBTN, clearBTN, clear2BTN;
		
	public Panel()
	{
		input1 = new JTextField(8);
		input2 = new JTextField(8);
		output = new JTextField(8);
		
		plusBTN = new JButton( "+" );
		plusBTN.addActionListener(new plusBTNHandler() );
		
		minBTN = new JButton("-");
		minBTN.addActionListener(new minBTNHandler() );
		
		prodBTN = new JButton("*");
		prodBTN.addActionListener(new prodBTNHandler() );
		
		quotBTN = new JButton("/");
		quotBTN.addActionListener(new quotBTNHandler() );
		
		restBTN = new JButton("%(rest waarde)");
		restBTN.addActionListener(new restBTNHandler() );
		
		clearBTN = new JButton("Clear");
		clearBTN.addActionListener(new clearBTNHandler() );
		
		clear2BTN = new JButton("Clear All");
		clear2BTN.addActionListener(new clear2BTNHandler() );
		
		
		add (input1);
		add (input2);
		add (plusBTN);
		add (minBTN);
		add (prodBTN);
		add (quotBTN);
		add (restBTN);
		add (output);
		add (clearBTN);
		add (clear2BTN);
	}
	
	
	class plusBTNHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent a) 
		{
			String data1 = input1.getText();
			int num1 = Integer.parseInt(data1);
			String data2 = input2.getText();
			int num2 = Integer.parseInt(data2);
			
			int result = num1 + num2;
			
			output.setText("" + result);
		}
	}
	
	class minBTNHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent b)
		{
			String data1 = input1.getText();
			int num1 = Integer.parseInt(data1);
			String data2 = input2.getText();
			int num2 = Integer.parseInt(data2);
			
			int result = num1 - num2;
			
			output.setText("" + result);
		}
	}
	
	class prodBTNHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent c)
		{
			String data1 = input1.getText();
			int num1 = Integer.parseInt(data1);
			String data2 = input2.getText();
			int num2 = Integer.parseInt(data2);
			
			int result = num1 * num2;
			
			output.setText("" + result);
		}
	}
	
	class quotBTNHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent d)
		{
			String data1 = input1.getText();
			int num1 = Integer.parseInt(data1);
			String data2 = input2.getText();
			int num2 = Integer.parseInt(data2);
			
			int result = num1 / num2;
			
			output.setText("" + result);
		}
	}
	
	class restBTNHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String data1 = input1.getText();
			int num1 = Integer.parseInt(data1);
			String data2 = input2.getText();
			int num2 = Integer.parseInt(data2);
			
			int result = num1 % num2;
			
			output.setText("" + result);
		}
	}
	
	class clearBTNHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent f) 
		{
			output.setText("");
		}
		
	}
	
	class clear2BTNHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) 
		{
			input1.setText("");
			input2.setText("");
			output.setText("");
		}
		
	}
}
