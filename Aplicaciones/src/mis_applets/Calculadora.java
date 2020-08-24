/*Esta practica es para poner en uso otro de los Layout que faltaban por ver
 * que es el GridLayout. Vamos a verlo construyendo una calculadora.
 * Esta practica corresponde al video 83 del curso de JAVA*/

package mis_applets;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JApplet{

	public void init() {
		// TODO Auto-generated method stub

//		setTitle("Calculadora");
		
//		setBounds(500,300,450,300);
		
		Lamina_Calculadora milamina = new Lamina_Calculadora();
		
		add(milamina);
		
		//pack();
	}

}

//class Marco_Calculadora extends JFrame{
//	
//	public Marco_Calculadora() {
//		
//		setTitle("Calculadora");
//		
//		setBounds(500,300,450,300);
//		
//		Lamina_Calculadora milamina = new Lamina_Calculadora();
//		
//		add(milamina);
//		
//		//pack();
//		
//	}
//	
//}

class Lamina_Calculadora extends JPanel{
	
	public Lamina_Calculadora () {
		
		principio = true;
		/*Esto es solo para que funcione lo de que borre el primer 0
		 * que sale en la calculadora cuando empiezo a introducir valores*/
		
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		
		pantalla.setEnabled(false);
		
		pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		
		pantalla.setBackground(new Color(150,203,218));
		
		add(pantalla,BorderLayout.NORTH);
		
		milamina2 = new JPanel();
		
		milamina2.setLayout(new GridLayout(4, 4));
		
		ActionListener insertar = new InsertaNumero();
		
		ActionListener orden = new AccionOrden();
		
		poner_Boton("7",insertar);
		
		poner_Boton("8",insertar);
		
		poner_Boton("9",insertar);
		
		poner_Boton("/",orden);
		
		poner_Boton("4",insertar);
		
		poner_Boton("5",insertar);
		
		poner_Boton("6",insertar);
		
		poner_Boton("*",orden);
		
		poner_Boton("1",insertar);
		
		poner_Boton("2",insertar);
		
		poner_Boton("3",insertar);
		
		poner_Boton("-",orden);
		
		poner_Boton("0",insertar);
		
		poner_Boton(".",insertar);
		
		poner_Boton("=",orden);
		
		poner_Boton("+",orden);
		
		add(milamina2,BorderLayout.CENTER);
		
		ultimaOperacion = "=";
		
	}
	
	/*Creamos este metodo para que haya menos lineas de codigo,
	 * para no tener que añadir uno por uno cada boton. El orden
	 * en que agregamos los botones determina como se va completando
	 * la cuadricula. Tambien se puede indicar en que punto de la
	 * cuadricula queremos cada cosa, pero asi vamos más rápido. Lo 
	 * aprovechamos tambien para poner todos los botones a la esucha*/
	
	private void poner_Boton (String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);
		
		boton.addActionListener(oyente);
		
		milamina2.add(boton);
		
	}
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String entrada = e.getActionCommand();
			
			if(principio){
				
				pantalla.setText("");
				
				principio = false;
				
			}
				
			pantalla.setText(pantalla.getText()+entrada);						
			
		}		
		
	}
	
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String operacion = e.getActionCommand();			
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion = operacion;
			
			principio = true;
			/*Al volver a poner a true esta variable, lo que conseguimos
			 * es que despues de pulsar una tecla de operacion, el siguiente
			 * numero que apretemos aparecerá sobre una pantalla recien
			 * limpiada, no se concatenara con lo que ya hubiese en pantalla*/
			
		}
		
		/*Este metodo va a ser el que haga todas las operaciones en la 
		 * calculadora*/
		
		public void calcular (Double x) {
			
			if (ultimaOperacion.equals("+")) {
				
				resultado+=x;				
								
			}
			
			if (ultimaOperacion.equals("-")) {
				
				resultado-=x;				
								
			}
			
			if (ultimaOperacion.equals("*")) {
				
				resultado*=x;				
								
			}
			
			if (ultimaOperacion.equals("/")) {
				
				resultado/=x;				
								
			}
			
			else if (ultimaOperacion.equals("=")) {
				
				resultado=x;
				
			}
			
			pantalla.setText(""+resultado); //Esto de poner la string vacia es para poder usar el double resultado como una string
			
		}
		
	}
	
	/*Declaramos milamina2 fuera del constructor para
	 * poder usar el metodo poner_Boton, si no el ambito
	 * de milamina2 seria solo del constructor de Lamina_Calculadora*/
	
	private JPanel milamina2; 
	
	private JButton pantalla;
	
	private boolean principio;
	
	private double resultado;
	
	private String ultimaOperacion;
	
}
