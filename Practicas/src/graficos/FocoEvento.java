package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoFoco mimarco = new MarcoFoco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco ()	{
		
		setVisible(true);
		
		setBounds(300, 300, 600, 450);
		
		add(new LaminaFoco());
		
	}
	
}

class LaminaFoco extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);
		
		cuadro1 = new JTextField();
		
		cuadro2 = new JTextField();
		
		cuadro1.setBounds(120, 10, 150, 20);
		
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		
		add(cuadro2);
		
		LanzaFocos elFoco = new LanzaFocos();
		
		cuadro1.addFocusListener(elFoco);
		
	}
	
	/*La class oyente la ponemos como clase interna, por eso
	 * la encapsulamos poniendola como private*/
	
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println("Has ganado el foco");
			
		}

		@Override
		public void focusLost(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
			System.out.println("Has perdido el foco");
			
		}
			
	}
	
	/*Estas variables las declaramos fuera del paintComponent
	 * para poderlas utilizar en el futuro.*/
	
	JTextField cuadro1;
	
	JTextField cuadro2;
	
}

