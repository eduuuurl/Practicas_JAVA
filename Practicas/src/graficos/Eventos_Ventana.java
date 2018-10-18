package graficos;

import javax.swing.*;
import java.awt.event.*;

public class Eventos_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana mimarco = new MarcoVentana();
		
		mimarco.setTitle("Marco 1");
		
		mimarco.setBounds(200, 200, 600, 600);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana mimarco2 = new MarcoVentana();
		
		mimarco2.setTitle("Marco 2");
		
		mimarco2.setBounds(300, 300, 600, 600);
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		//setTitle("Respondiendo");
		
		//setBounds(200, 200, 600, 600);
		
		setVisible(true);
		
		/*M_Ventana oyenteVentana = new M_Ventana();
		
		addWindowListener(oyenteVentana);*/
		
		/*Esto es otra forma de hacer lo de las dos lineas de arriba,
		 * simplificando un poco m�s el c�digo*/
		
		addWindowListener(new M_Ventana());
		
	}
	
}

/*Esta va a ser la class listener de los eventos de ventana
 * que se generen. Tenemos que declarar todos los metodos de la
 * interfaz WindowListener, pero eso lo hace eclipse si se lo
 * decimos. Solo voy a usar alguno de ellos.*/

/*Comento todo esto porque voy a ver otra forma de escribir todo esto,
 * que es simplemente, en vez de implementar la interfaz WindowListener,
 * lo que har� es extender de una class que ya de por si implementa
 * todos estos metodos, asi solo tengo que sobreescribir los que a mi me interese */

/*class M_Ventana implements WindowListener{

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana activada");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Cerrando ventana, no programa");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Cerrando ventana");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana desactivada");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana restaurada");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana minimizada");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}*/ 

class M_Ventana extends WindowAdapter {
	
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana minimizada");
		
	}
	
}