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
		
		RatonMoviendose mueveraton = new RatonMoviendose();
		
		addMouseMotionListener(mueveraton);
		
	}
	
}

/*Aqui hago uso de la adapter class MouseAdapter, asi no tengo
 * que implementar tdos los metosos de la interfaz MouseListener,
 * como hago abajo en el codigo comentado*/

class EventosDeRaton extends MouseAdapter{
	
	public void mousePressed (MouseEvent e) {
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
		
			System.out.println("Has hecho clic izquierdo");
			
		//System.out.println(e.getModifiersEx());
		
		} else if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			
			System.out.println("Has hecho clic derecho");
			
		}
		
	}
	
}

/*class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Has hecho clic");
		
		System.out.println("Coordenada X: "+e.getX() + " Coordenada Y: "+e.getY());
		
		System.out.println("Has hecho clic "+e.getClickCount()+" veces");
		
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
	
	
	
}*/

class RatonMoviendose implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("El raton se arrastra");
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("El raton se mueve");
		
	}
	
	
	
}
