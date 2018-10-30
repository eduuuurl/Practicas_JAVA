/*Esta practica es para poner en uso otro de los Layout que faltaban por ver
 * que es el GridLayout. Vamos a verlo construyendo una calculadora.
 * Esta practica corresponde al video 83 del curso de JAVA*/

package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Calculadora mimarco = new Marco_Calculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Calculadora extends JFrame{
	
	public Marco_Calculadora() {
		
		setTitle("Calculadora");
		
		setBounds(500,300,450,300);
		
		Lamina_Calculadora milamina = new Lamina_Calculadora();
		
		add(milamina);
		
		//pack();
		
	}
	
}

class Lamina_Calculadora extends JPanel{
	
	public Lamina_Calculadora () {
		
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		
		pantalla.setEnabled(false);
		
		pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		
		pantalla.setBackground(new Color(150,203,218));
		
		add(pantalla,BorderLayout.NORTH);
		
		milamina2 = new JPanel();
		
		milamina2.setLayout(new GridLayout(4, 4));
		
		ActionListener insertar = new InsertaNumero();
		
		poner_Boton("7",insertar);
		
		poner_Boton("8",insertar);
		
		poner_Boton("9",insertar);
		
		//poner_Boton("/");
		
		poner_Boton("4",insertar);
		
		poner_Boton("5",insertar);
		
		poner_Boton("6",insertar);
		
		//poner_Boton("*");
		
		poner_Boton("1",insertar);
		
		poner_Boton("2",insertar);
		
		poner_Boton("3",insertar);
		
		//poner_Boton("-");
		
		poner_Boton("0",insertar);
		
		poner_Boton(".",insertar);
		
		//poner_Boton("=");
		
		//poner_Boton("+");
		
		add(milamina2,BorderLayout.CENTER);
		
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
			
			/*Esta mandanguilla la hago para que borre el primer 0
			 * de la pantalla de la calculadora*/
			
			if(pantalla.getText()=="0") {
				
				pantalla.setText(entrada);
				
			}else {
				
				pantalla.setText(pantalla.getText()+entrada);
				
			}			
			
		}		
		
	}
	
	/*Declaramos milamina2 fuera del constructor para
	 * poder usar el metodo poner_Boton, si no el ambito
	 * de milamina2 seria solo del constructor de Lamina_Calculadora*/
	
	private JPanel milamina2; 
	
	private JButton pantalla;
	
}
