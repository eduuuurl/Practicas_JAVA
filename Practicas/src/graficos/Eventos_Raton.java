package graficos;

import javax.swing.*;
import java.awt.event.*;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton mimarco = new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

/*En este ejemplo, el objeto fuente es el marco de la aplicacion.
 * El oyente es el objeto perteneciente a la class EventosDeRaton,
 * y el MarcoRaton mimarco tendrá un EventosDeRaton oyendo, el
 * "eventosderaton".*/

class MarcoRaton extends JFrame {
	
	public MarcoRaton () {
		
		setVisible(true);
		
		setBounds(200,200,800,500);
		
		EventosDeRaton eventoraton = new EventosDeRaton();
		
		addMouseListener(eventoraton);
		
	}
	
}

class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Has hecho clic");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Acabas de entrar");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Acabas de salir");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Acabas de presionar");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Acabas de levantar");
		
	}
	
	
	
}
