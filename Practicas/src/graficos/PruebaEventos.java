package graficos;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;


public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConBotones mimarco = new MarcoConBotones();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConBotones extends JFrame{
	
	public MarcoConBotones() {
		
		setTitle ("Botones y eventos");
		
		setBounds  (100,100,1200,800);
		
		LaminaConBotones milamina = new LaminaConBotones();
		
		add(milamina);
		
	}
	
}

class LaminaConBotones extends JPanel{
	
	JButton botonazul = new JButton("Boton azul");
	
	JButton botonrojo = new JButton("Boton rojo");
	
	JButton botonamarillo = new JButton("Boton amarillo");
	
	public LaminaConBotones () {
		
		add(botonazul);
		
		add(botonrojo);
		
		add(botonamarillo);
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		/*Los botones son el objeto fuente, son los que desencadenaran un evento,
		 * y los objetos OYENTES o listeners seran los que "verán" ese evento. 
		 * El objeto EVENTO es hacer clic */
		
		botonazul.addActionListener(Azul);
		
		botonrojo.addActionListener(Rojo);
		
		botonamarillo.addActionListener(Amarillo);
		
	}
	
	/*Esta clase, ColorFondo, es la clase a la que perteneceran los objetos oyentes,
	 * ya que es la clase que implementa la interfaz ActionListener. Vemos que tenemos
	 * que implementar el metodo ActionPerformed*/
	
	private class ColorFondo implements ActionListener{
		
		public ColorFondo(Color c) {
			
			colorDeFondo = c;
			
		}
		
		public void actionPerformed (ActionEvent e) {
			
			setBackground(colorDeFondo);
			
		}
		
		private Color colorDeFondo;
		
	}
	
}

