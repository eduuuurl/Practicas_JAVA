/*Video 98
 * 24/01/2018*/

package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MarcoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameSpinner mimarco = new FrameSpinner();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}

class FrameSpinner extends JFrame{
	
	public FrameSpinner () {
		setBounds(500,350,800,350);
		setVisible(true);
		add (new LaminaSpinner());
	}
	
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner () {
		String [] Spinner_Array = new String[3];
		Spinner_Array [0] = "Mierda";
		Spinner_Array [1] = "Caca";
		Spinner_Array [2] = "Zurullo";
		JSpinner control = new JSpinner(new SpinnerListModel(Spinner_Array));
		//JSpinner control = new JSpinner(new SpinnerDateModel());
		Dimension d = new Dimension(200,30);
		control.setPreferredSize(d);
		add(control);
		// Aqui voy a crear otro JSpinner con las fuentes de windows
		//Primero creo una array con las fuentes
		String [] Spinner_Array2 = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		JSpinner control2 = new JSpinner (new SpinnerListModel(Spinner_Array2));
		control2.setPreferredSize(d);
		add(control2);
		// Aqui voy a crear otro JSpinner jugando con los valores que muestra
		JSpinner control3 = new JSpinner (new SpinnerNumberModel(10, 0, 100, 5));
		control3.setPreferredSize(d);
		add(control3);
			
	}
	
}