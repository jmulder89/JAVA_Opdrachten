package oefening_601;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel label, label2, label3;
	private JTextField invoerVak, invoervak2, invoervak3;
	private Datum datum, datum2;
	private Tijd tijd;
	
	public Panel(){
		setBackground(Color.GRAY);
		setLayout(null);
		
		datum = new Datum();
		datum2 = new Datum();
		tijd = new Tijd();
		
		label = new JLabel("Voer de dag in");
		label.setBounds(5, 5, 110, 20);
		label.setForeground(Color.WHITE);
		label2 = new JLabel("Voer de dag in");
		label2.setBounds(5, 30, 110, 20);
		label2.setForeground(Color.WHITE);
		label3 = new JLabel("voor het uur in");
		label3.setBounds(5, 55, 110, 20);
		label3.setForeground(Color.WHITE);
		
		invoerVak = new JTextField();
		invoerVak.addActionListener(new Handler() );
		invoerVak.setBounds(120, 5, 110, 20);
		invoervak2 = new JTextField();
		invoervak2.addActionListener(new Handler2() );
		invoervak2.setBounds(120, 30, 110, 20);
		invoervak3 = new JTextField();
		invoervak3.addActionListener(new Handler3() );
		invoervak3.setBounds(120, 55, 110, 20);
		
		add(label);
		add(invoerVak);
		add(label2);
		add(invoervak2);
		add(label3);
		add(invoervak3);
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.drawString(
				String.format("De 1ste ingevoerde datum is %02d-", datum.getDag() ) + 
				String.format("%02d-", datum.getMaand() ) +
				String.format("%04d", datum.getJaar() ),
				4, 100);
		
		g.drawString(
				String.format("De 2de ingevoerde datum is %02d-", datum2.getDag() ) + 
				String.format("%02d-", datum2.getMaand() ) +
				String.format("%04d", datum2.getJaar() ),
				5, 120);
		g.drawString(
				String.format("De ingevoerde tijd is %02d:", tijd.getUur() ) + 
				String.format("%02d:", tijd.getMin() ) +
				String.format("%02d", tijd.getSec() ),
				5, 140);
	}
	
	class Handler implements ActionListener{
		private boolean dagIngevoerd, maandIngevoerd;
		
		public void actionPerformed(ActionEvent arg0) {
			String invoer = invoerVak.getText();
			int getal = Integer.parseInt(invoer);
			
			invoerVak.setText("");
			if(!dagIngevoerd){
				datum.setDag(getal);
				dagIngevoerd = true;
				label.setText("Voor de maand in");
			}
			else if( !maandIngevoerd){
				datum.setMaand(getal);
				maandIngevoerd = true;
				label.setText("Voer het jaar in");
			}
			else{
				datum.setJaar(getal);
				label.setText("Voer dag in");
				dagIngevoerd = false;
				maandIngevoerd = false;
				repaint();
			}
		}
		
	}
	
	class Handler2 implements ActionListener{
		private boolean dagIngevoerd, maandIngevoerd;
	
		public void actionPerformed(ActionEvent arg1) {
			String invoer = invoervak2.getText();
			int getal = Integer.parseInt(invoer);
			
			invoervak2.setText("");
			if(!dagIngevoerd){
				datum2.setDag(getal);
				dagIngevoerd = true;
				label2.setText("Voor de maand in");
			}
			else if( !maandIngevoerd){
				datum2.setMaand(getal);
				maandIngevoerd = true;
				label2.setText("Voer het jaar in");
			}
			else{
				datum2.setJaar(getal);
				label2.setText("Voer dag in");
				dagIngevoerd = false;
				maandIngevoerd = false;
				repaint();
			
				}
			}
		}
	
	class Handler3 implements ActionListener{
		private boolean uurIngevoerd, minIngevoerd;
	
		public void actionPerformed(ActionEvent arg1) {
			String invoer = invoervak3.getText();
			int getal = Integer.parseInt(invoer);
			
			invoervak3.setText("");
			if(!uurIngevoerd){
				tijd.setUur(getal);
				uurIngevoerd = true;
				label3.setText("Voor aantal min in");
			}
			else if( !minIngevoerd){
				tijd.setMin(getal);
				minIngevoerd = true;
				label3.setText("Voer aantal sec in");
			}
			else{
				tijd.setSec(getal);
				label3.setText("Voer aantal uur in");
				uurIngevoerd = false;
				minIngevoerd = false;
				repaint();
			
				}
			}
		}
	}
