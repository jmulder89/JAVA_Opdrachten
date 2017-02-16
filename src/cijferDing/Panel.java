package cijferDing;
import javax.swing.*;
import javax.swing.JLabel;

class Panel extends JPanel 
{
	private JTextField	vak1, vak2;
	private JLabel		label1;
	
	public Panel()
	{
		label1 = new JLabel("test");
		label1.setBounds(10, 10, 10, 10);
		
		vak1 = new JTextField(10);
		
		vak2 = new JTextField(10);
	}
}
