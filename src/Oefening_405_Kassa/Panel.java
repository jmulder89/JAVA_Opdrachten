package Oefening_405_Kassa;
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

	private JLabel 			invoer_Lbl,			empty1,
							subTot_Lbl,			empty2,
							btw_Lbl,			empty3,
							totExBtw_Lbl,
							totaal_Lbl;
	
	private JTextField		invoer_Txt,
							subTot_Txt,
							btw_Txt,
							totExBtw_Txt,
							totaal_Txt;
	
	private JButton			totaal_Btn,
							reset_Btn;
	
	public Panel()
	{
		setLayout(new GridLayout(5, 3, 5, 5 ));
		Border border = BorderFactory.createEmptyBorder(8, 8, 8, 8);
		setBorder( border );
		
		//___________________JLabels_____________________________________________//
		
		invoer_Lbl = new JLabel("Voer bedrag in");
		invoer_Lbl.setHorizontalAlignment(JLabel.LEFT);
		
		subTot_Lbl = new JLabel("Subtotaal");
		subTot_Lbl.setHorizontalAlignment(JLabel.LEFT);
		
		btw_Lbl = new JLabel("BTW");
		btw_Lbl.setHorizontalAlignment(JLabel.LEFT);
		
		totExBtw_Lbl = new JLabel("Totaal EX BTW");
		totExBtw_Lbl.setHorizontalAlignment(JLabel.LEFT);
		
		totaal_Lbl = new JLabel("Totaal");
		totaal_Lbl.setHorizontalAlignment(JLabel.LEFT);
		
		empty1 = new JLabel();		empty2 = new JLabel();		empty3  = new JLabel();
		
		//___________________JTextFields_________________________________________//
		
		invoer_Txt = new JTextField("");
		invoer_Txt.setHorizontalAlignment(JTextField.RIGHT);
		
		subTot_Txt = new JTextField("0");
		subTot_Txt.setHorizontalAlignment(JTextField.RIGHT);
		subTot_Txt.setEditable(false);
		
		
		btw_Txt = new JTextField("0");
		btw_Txt.setHorizontalAlignment(JTextField.RIGHT);
		btw_Txt.setEditable(false);
		
		totExBtw_Txt = new JTextField("0");
		totExBtw_Txt.setHorizontalAlignment(JTextField.RIGHT);
		totExBtw_Txt.setEditable(false);
		
		totaal_Txt = new JTextField("0");
		totaal_Txt.setHorizontalAlignment(JTextField.RIGHT);
		totaal_Txt.setEditable(false);
		
		//___________________JButtons____________________________________________//
		
		totaal_Btn = new JButton("Totaal");
		totaal_Btn.addActionListener(new totaalHandler() );
		
		reset_Btn = new JButton("Reset");
		reset_Btn.addActionListener(new resetHandler() );
	
		
		add(invoer_Lbl);			add(invoer_Txt);		add(empty1);
		add(subTot_Lbl);			add(subTot_Txt);		add(totaal_Btn);
		add(btw_Lbl);				add(btw_Txt);			add(empty2);
		add(totExBtw_Lbl);			add(totExBtw_Txt);		add(empty3);
		add(totaal_Lbl);			add(totaal_Txt);		add(reset_Btn);
		
		
	}
	
	class totaalHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent arg0) 
		{
			String invoer_hold = invoer_Txt.getText();
			double invoer_num = Double.parseDouble(invoer_hold);
			
			String subTot_hold = subTot_Txt.getText();
			double subTot_num = Double.parseDouble(subTot_hold);
			
			double subtotaal = invoer_num + subTot_num;
			
			subTot_Txt.setText( String.format("%.2f", subtotaal) );
			invoer_Txt.setText("");
			
			double btw = subtotaal / 100 * 21;
			btw_Txt.setText( String.format("%.2f", btw) );
			
			double exBtw = subtotaal - btw;
			totExBtw_Txt.setText( String.format("%.2f", exBtw) );
			
			double totaal = subtotaal;
			totaal_Txt.setText( String.format("%.2f", totaal) );
		}
	}
		
	class resetHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			totaal_Txt.setText("0");
			totExBtw_Txt.setText("0");
			btw_Txt.setText("0");
			invoer_Txt.setText("");
			subTot_Txt.setText("0");
		}
		
	}
}
