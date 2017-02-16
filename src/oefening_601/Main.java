package oefening_601;
import javax.swing.*;

public class Main extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main( String args[] ){
		JFrame main = new JFrame();
		main.setTitle("Oefening 6.1");
		main.setSize(255, 200);
		main.setLocation(500, 300);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setContentPane(new Panel() );
		main.setVisible(true);
	}
}
