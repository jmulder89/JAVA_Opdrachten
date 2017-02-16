package voorBeeld_201;
import javax.swing.*;

public class Vb0201 extends JFrame {
	public static void main( String[] args )
	
	{
		JFrame frame = new Vb0201 ();
		/* frame.setSize( 400, 200); */
		//Oefening 2.5
		frame.setSize( 600, 300);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.setTitle( "Eerste applicatie" );
		frame.setVisible( true );
		//oefening 2.6
		frame.setLocation( 400, 50);
	}
}
