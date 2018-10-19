package graficos;
import javax.swing.*;
import java.awt.event.*;

public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTeclado mimarco = new MarcoConTeclado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTeclado extends JFrame{
	
	public MarcoConTeclado () {
	
		setVisible(true);
		
		setBounds(200, 200, 800, 800);
		
		EventoDeTeclado teclaPulsada = new EventoDeTeclado();
		
		addKeyListener(teclaPulsada);
				
	}	
		
}

class EventoDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getKeyCode()==KeyEvent.VK_5) {
			
			System.out.println("Por el culo te la inco.");
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int codigo = e.getKeyCode();
		
		System.out.println(codigo);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("El user ha pulsado la tecla "+e.getKeyChar());
		
	}
	
	
	
}
