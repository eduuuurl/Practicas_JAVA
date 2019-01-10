/*2019-01-10
 * en este ejemplo vamos a ver como se pueden gestionar los eventos que se lanzan
 * desde un JTextField, lo que viene siendo un cuadro donde podemos escribir. La class que escuche esos eventos
 * tiene que implementar una interfaz, que es la interfaz DocumentListener, que tiene 3 metodos*/

package graficos;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.Document;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPrueba mimarco = new MarcoPrueba();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPrueba extends JFrame{
	
	public MarcoPrueba() {
		
		setBounds(500,300,500,350);
		
		LaminaPrueba milamina = new LaminaPrueba();
		
		add(milamina);
		
		setVisible(true);
		
	}
	
}

class LaminaPrueba extends JPanel{
	
	public LaminaPrueba () {
		
		JTextField micampo = new JTextField(20);
		
		/*Este es el objeto de la classe capaz de oir los eventos y hacer ciertas acciones al escucharlos*/
		EscuchaTexto el_evento = new EscuchaTexto();
		
		//Vamos a poner midoc a la esucha, usando la interfaz document, con el objeto
		//document que nos devuelve el metodo getdocument de la class JTextField
		/*Mutations to the Document must be communicated to interested observers. The notification of change follows the event 
		 * model guidelines that are specified for JavaBeans. In the JavaBeans event model, once an event notification is dispatched, all listeners 
		 * must be notified before any further mutations occur to the source of the event. Further, order of delivery is not guaranteed.*/
		Document midoc = micampo.getDocument();
		
		/*Ahora hacemos que un objeto capaz de escuchar el evento que se genera cuando midoc cambia, esté
		 * atento a los eventos que lance midoc*/
	
		
		midoc.addDocumentListener(el_evento);
		
		add(micampo);
		
	}
	
	/*Esta es la clase interna que se va a encargar de gestionar los eventos que sucedan en el documento 
	 * del JTextField, la class que va a implementar la interfaz DocumentListener. El documento es lo que lanza el evento, al ser modificado el interior
	 * del JTextField */
	private class EscuchaTexto implements DocumentListener{
		
		//Este no lo vamos a ver por ahora
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println("Has introducido texto");
			
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println("Has borrado texto");
			
		}
		
		
		
	}
	
}
