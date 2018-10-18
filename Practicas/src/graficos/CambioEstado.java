package graficos;

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado mimarco = new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado(){
	
		setVisible(true);
		
		setBounds(100,100,800,500);
		
		/*Tengo que entender que esto lo que hace es que el objeto mimarco,
		 * de la class MarcoEstado, TIENE UN WindowStateListener, porque la class
		 * MarcoCambiado implementa la interfaz WindowStateListener, por lo que
		 * MarcoCambiado ES UN WindowStateListener, y entonces, los objetos que 
		 * cree de la class MarcoEstado TIENEN UN WindowStateListener*/
		
		CambiaEstado nuevo_estado = new CambiaEstado();
		
		addWindowStateListener(nuevo_estado);
		
	}
	
}

class CambiaEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("El marco ha cambiado");
		
		//System.out.println(e.getNewState());
		
		if (e.getNewState()==Frame.MAXIMIZED_BOTH) {
			
			System.out.println("La ventana esta a pantalla completa");
			
		} else if (e.getNewState()==Frame.ICONIFIED){
			
			System.out.println("La ventana está minimizada");
			
		} else if(e.getNewState()==Frame.NORMAL) {
			
			System.out.println("La ventana está normal");
			
		}
		
	}
	
}
