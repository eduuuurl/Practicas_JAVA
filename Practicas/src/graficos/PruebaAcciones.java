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
				new ImageIcon("src/graficos/iconobolaamarilla.png"),new Color(245,242,122));
		
		AccionColor accionrojo = new AccionColor("rojo", 
				new ImageIcon("src/graficos/iconobolaroja.png"),new Color(242,83,36));
		
		AccionColor accionazul = new AccionColor("azul", 
				new ImageIcon("src/graficos/iconobolaazul.png"),new Color(150,203,218));
		
		/*JButton botonazul = new JButton("Azul");
		
		JButton botonrojo = new JButton("Rojo");
		
		JButton botonamarillo = new JButton("Amarillo");
		
		add(botonazul);
		
		add(botonrojo);
		
		add(botonamarillo);*/
		
	}
	
}

// Esta va a ser la clase oyente

class AccionColor extends AbstractAction{
	
	public AccionColor (String nombre, Icon icono, Color color_boton) {
		
		putValue(Action.NAME, nombre);
		
		putValue(Action.SMALL_ICON, icono);
		
		putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color "+ nombre);
		
		putValue("color_de_fondo", color_boton);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

