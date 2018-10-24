package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoAccion marco = new MarcoAccion();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

class MarcoAccion extends JFrame{
	
	public MarcoAccion() {
		
		setTitle("Prueba acciones");
		
		setBounds(600, 350, 600, 300);
		
		PanelAction lamina = new PanelAction();
		
		add(lamina);
		
	}
	
}

class PanelAction extends JPanel{
	
	public PanelAction () {
		
		AccionColor accionamarillo = new AccionColor("amarillo", 
				new ImageIcon("src/graficos/amarillo.gif"),new Color(245,242,122));
		
		AccionColor accionrojo = new AccionColor("rojo", 
				new ImageIcon("src/graficos/rojo.gif"),new Color(242,83,36));
		
		AccionColor accionazul = new AccionColor("azul", 
				new ImageIcon("src/graficos/azul.gif"),new Color(150,203,218));
		
		/*Los botones son los objetos fuente del evento, el boton en si
		 * al ser pulsado lanza un evento. Usamos un constructor de JButton
		 * al que se le pasa como parametro una accion, y de esa accion pilla
		 * sus datos*/
		
		JButton botonamarillo = new JButton(accionamarillo);
		
		JButton botonrojo = new JButton(accionrojo);
		
		JButton botonazul = new JButton(accionazul);
		
		add(botonazul);
		
		add(botonrojo);
		
		add(botonamarillo);
		
		//Esto es para crear una segunda fuente de evento, combinacion de teclas
		//Primero necesitamos crear un InputMap
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//Ahora creamos la combinacion de teclas
		
		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl Y");
		
		KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
		
		KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
		
		//Asignar la combinacion de teclas a un objeto
		
		mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
		
		mapaEntrada.put(teclaAzul, "fondo_azul");
		
		mapaEntrada.put(teclaRojo, "fondo_rojo");
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("fondo_amarillo", accionamarillo);
		
		mapaAccion.put("fondo_azul", accionazul);
		
		mapaAccion.put("fondo_rojo", accionrojo);
		
	}
	
	// Esta va a ser la clase oyente, y va a ser una inner class

	private class AccionColor extends AbstractAction{
		
		public AccionColor (String nombre, Icon icono, Color color_boton) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color "+ nombre);
			
			putValue("color_de_fondo", color_boton);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Color c = (Color)getValue("color_de_fondo");
			
			setBackground(c);
			
			System.out.println("Nombre de boton pulsado: "+getValue(Action.NAME));
			
			System.out.println("Dscripción: "+getValue(Action.SHORT_DESCRIPTION));
			
		}
		
	}
	
}



