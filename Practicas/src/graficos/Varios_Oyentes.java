package graficos;

import javax.swing.*;
import java.awt.event.*;

public class Varios_Oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Principal mimarco = new Marco_Principal();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class Marco_Principal extends JFrame{
	
	public Marco_Principal() {
		
		setTitle("Prueba varios");
		
		setBounds(1300, 100, 300, 200);
		
		Lamina_Principal lamina = new Lamina_Principal();
		
		add(lamina);
		
	}
	
}

class Lamina_Principal extends JPanel{
	
	public Lamina_Principal () {
		
		JButton boton_nuevo = new JButton("Nuevo");
		
		add(boton_nuevo);
		
		boton_cerrar = new JButton ("Cerrar todo");
		
		add(boton_cerrar);
		
		Oyente_Nuevo mi_oyente = new Oyente_Nuevo();
		
		boton_nuevo.addActionListener(mi_oyente);
		
	}
	
	private class Oyente_Nuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
			
			marco.setVisible(true);
			
		}
		
	}
	
	/*Este boton lo declaramos aqui, porque luego querremos que 
	 * otros metodos de la class Lamina_Principal puedan
	 * acceder también. Este boton será el objeto fuente que 
	 * lanzará un evento que cerrará todas las ventanas.*/
	
	JButton boton_cerrar;
	
}

class Marco_Emergente extends JFrame{
	
	public Marco_Emergente (JButton boton_de_principal) {
		
		contador++;
		
		setTitle("Ventana "+contador);
		
		setBounds(40*contador,40*contador,300,150);
		
		boton_de_principal.addActionListener(new Cierra_todos());
		
	}
	
	private class Cierra_todos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			dispose();
			
			contador = 0;
			
		}
		
	}
	
	private static int contador=0;
	
}
