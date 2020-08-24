package mis_applets;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HolaAlumnos extends JApplet{
	
	public void init () {
		JLabel rotulo = new JLabel("Hola alumnos!!", SwingConstants.CENTER);
		
		add(rotulo);
	}
}
