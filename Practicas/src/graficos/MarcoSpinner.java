/*Video 98 y 99 tambien creo
 * 24/01/2018
 * 26/01/2019
 * Este dia lo que vamos a hacer es intentar que el los botones del jspinner
 * funcionen del reves, esto quiere decir, que si tenemos numeros, por ejemplo,
 * para incrementera el valor, haya que darle al boton de hacia abajo, en vez de 
 * hacia arriba, que es como funciona ahora mismo.
 * 
 * Esto lo vamos a hacer con clases internas anonimas. Vamos a construir un nuevo modelo
 * de jspinner, para pasarselo como argumento al constructor del jspinner
 * 
 * Ojo que el control 4 no lo he hecho con clases internas anonimas. control5 si que
 * lo voy a hacer con clases internas anonimas*/

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
		setBounds(500,350,300,350);
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
		Dimension d = new Dimension(150,30);
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
		//ESte es el Jspinner que voy a crear modificando el modelo
		JSpinner control4 = new JSpinner (new MiModeloJspinner(5, 0, 10, 1));
		control4.setPreferredSize(d);
		add(control4);
		
		//ESte es el Jspinner que voy a hacer usando clases internas anonimas
		JSpinner control5 = new JSpinner (new SpinnerNumberModel(50, 0, 100, 2){
			
			/*Aqui ya puedo pegar a lo loco los metodos sobreescritos
			 * que he usado para crear el modelo de control 4*/			
			public Object getNextValue() {			
				return super.getPreviousValue();			
			}
			public Object getPreviousValue() {
				return super.getNextValue();
			}			
		});
		
		control5.setPreferredSize(d);
		add(control5);
			
	}
	
	/*Esta es la clase interna que vamos a usar para crear nuestro
	 * propio spinnermodel, uno en el que los botones funcionen
	 * del reves, como escribo arriba de este documento.
	 * 
	 * Esta clase va a tener que heredad de SpinnerNumberModel, porque
	 * asi podemos usar todos los metodos de esa class.*/
	
	private class MiModeloJspinner extends SpinnerNumberModel{
		
		public MiModeloJspinner (int a, int b, int c, int d) {
			super(a,b,c,d);			
		}
		
		/*Ahora lo que voy a hacer es sobreescribir dos metodos de la
		 * class SpinnerNumberModel, el getPreviousValue() y el 
		 * 	getNextValue(), porque esos son los que nos devuelven el siguiente
		 * valor del modelo, por encima, o por debajo, osea, lo que pasa cuando
		 * apretamos los botoncicos del Jspinner, vaya.*/
		
		public Object getNextValue() {			
			return super.getPreviousValue();			
		}
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}
	
}