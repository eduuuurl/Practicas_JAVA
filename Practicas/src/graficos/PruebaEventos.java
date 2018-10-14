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

class LaminaConBotones extends JPanel implements ActionListener{
	
	JButton botonazul = new JButton("Boton azul");
	
	JButton botonrojo = new JButton("Boton rojo");
	
	JButton botonamarillo = new JButton("Boton amarillo");
	
	public LaminaConBotones () {
		
		add(botonazul);
		
		botonazul.addActionListener(this);
		
		add(botonrojo);
		
		botonrojo.addActionListener(this);
		
		add(botonamarillo);
		
		botonamarillo.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado = e.getSource();
			
		if (botonPulsado.equals(botonazul)) {
		
			setBackground(Color.BLUE);
			
		}
		
		if (botonPulsado.equals(botonrojo)) {
			
			setBackground(Color.RED);
			
		}
		
		if (botonPulsado.equals(botonamarillo)) {
			
			setBackground(Color.YELLOW);
			
		}
		
	}
	
}
