package oefening_502;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField veld1, veld2, veld3;
	private JButton knop;
	private int int1, int2, int3;
	
	public Panel(){
		veld1 = new JTextField(5);
		veld1.setHorizontalAlignment(JTextField.CENTER);
		add(veld1);
		
		veld2 = new JTextField(5);
		veld2.setHorizontalAlignment(JTextField.CENTER);
		add(veld2);
		
		veld3 = new JTextField(5);
		veld3.setHorizontalAlignment(JTextField.CENTER);
		veld3.addActionListener(new handler() );
		add(veld3);
		
		knop = new JButton("Sort");
		knop.addActionListener( new handler() );
		add(knop);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString(int1 + " ", 90, 80);
		g.drawString(int2 + " ", 100, 80);
		g.drawString(int3 + "", 110, 80);
		repaint();
	}
	
	class handler implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			int int1 = Integer.parseInt(veld1.getText() );
			int int2 = Integer.parseInt(veld2.getText() );
			int int3 = Integer.parseInt(veld3.getText() );
			
			if(int1 > int2){
				int temp;
				temp = int1;
				int1 = int2;
				int2 = temp;
				veld1.setText("" + int1);
				veld2.setText("" + int2);
			}
			
			if(int2 > int3){
				int temp;
				temp = int2;
				int2 = int3;
				int3 = temp;
				veld2.setText("" + int2);
				veld3.setText("" + int3);
			}
			
			if(int1 > int2){
				int temp;
				temp = int1;
				int1 = int2;
				int2 = temp;
				veld1.setText("" + int1);
				veld2.setText("" + int2);
			}
			
		}
		
	}
	
}
