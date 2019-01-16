package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Marco_radio mimarco = new Marco_radio();
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Marco_radio extends JFrame{
	
	public Marco_radio() {
		
		setTitle("Ejemplo con botones radio");
		setVisible(true);
		setBounds(550,300,500,350);
		Lamina_radio milamina = new Lamina_radio();
		add(milamina);
		
	}
	
}

class Lamina_radio extends JPanel{
	
	public Lamina_radio() {
		
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la mancha de cuyo nombre...");
		/*START VERSION NUEVA*/
		texto.setFont(new Font("Serif",Font.PLAIN,12));
		/*END VERSION NUEVA*/
		add(texto, BorderLayout.CENTER);
		lamina_botones = new JPanel();
		migrupo = new ButtonGroup();
		/*START VERSION NUEVA*/
		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 14);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy grande", false, 24);
		add(lamina_botones,BorderLayout.SOUTH);
		/*END VERSION NUEVA*/
		/*START VERSION CUTRE
		ButtonGroup migrupo = new ButtonGroup();
		boton1 = new JRadioButton("Pequeño",false);
		boton2 = new JRadioButton("Mediano",true);
		boton3 = new JRadioButton("Grande",false);
		boton4 = new JRadioButton("Super grande",false);		
		JPanel lamina_radio = new JPanel();
		Evento_radio mievento = new Evento_radio();
		boton1.addActionListener(mievento);
		boton2.addActionListener(mievento);
		boton3.addActionListener(mievento);
		boton4.addActionListener(mievento);
		migrupo.add(boton1);
		migrupo.add(boton2);
		migrupo.add(boton3);
		migrupo.add(boton4);
		lamina_radio.add(boton1);
		lamina_radio.add(boton2);
		lamina_radio.add(boton3);
		lamina_radio.add(boton4);
		add(lamina_radio,BorderLayout.SOUTH);
		END VERSION CUTRE*/
		
	}
	/*START VERSION NUEVA*/
	public void colocarBotones (String nombre, boolean seleccionado, final int tamano) {
		
		JRadioButton boton = new JRadioButton(nombre,seleccionado);
		
		migrupo.add(boton);
		
		lamina_botones.add(boton);
		
		ActionListener mievento = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				texto.setFont(new Font("Serif",Font.PLAIN,tamano));
				
			}
		};
		
		boton.addActionListener(mievento);
		
	}
	/*END VERSION NUEVA*/
	
	/*START VERSION CUTRE
	private class Evento_radio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//Vamos a usar el metodo getSource para saber que boton
			 // es el que esta lanzando el evento e
			
			if (e.getSource()==boton1) {
				
				texto.setFont(new Font ("Serif",Font.PLAIN,10));
				
			}else if (e.getSource()==boton2) {
				
				texto.setFont(new Font ("Serif",Font.PLAIN,14));
				
			}else if(e.getSource()==boton3) {
				
				texto.setFont(new Font ("Serif",Font.PLAIN,18));
				
			}else if(e.getSource()==boton4) {
				
				texto.setFont(new Font ("Serif",Font.PLAIN,24));
				
			}
			
		}		
		
	}
	END VERSION CUTRE*/
	
	private JLabel texto;
	private JRadioButton boton1, boton2, boton3, boton4;
	/*START VERSION NUEVA*/
	private ButtonGroup migrupo;
	private JPanel lamina_botones;
	/*END VERSION NUEVA*/
	
}
