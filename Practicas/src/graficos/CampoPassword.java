package graficos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPassword mimarco = new MarcoPassword();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoPassword extends JFrame{
	
	public MarcoPassword() {
		setBounds(400,300,550,400);
		LaminaPassword milamina = new LaminaPassword();
		add(milamina);
		setVisible(true);		
	}
	
}

class LaminaPassword extends JPanel{
	
	public LaminaPassword() {
		setLayout(new BorderLayout());
		JPanel laminasuperior = new JPanel();
		/*Con lo siguiente creamos una lamina dentro de la LamninaPassword, que tenga
		 * distribucion 2 x 2. Luego además le diremos que la queremos en la zona north
		 * de la LaminaPassword, que tiene border layout, como veo arriba*/
		laminasuperior.setLayout(new GridLayout(2, 2));
		add(laminasuperior,BorderLayout.NORTH);
		JLabel etiqueta1 = new JLabel ("Usuario");
		JLabel etiqueta2 = new JLabel ("Contraseña");
		JTextField c_usuario = new JTextField(15);
		Comprueba_pass mievento = new Comprueba_pass();
		c_contrasena = new JPasswordField(15);
		c_contrasena.getDocument().addDocumentListener(mievento);
		/*El orden en el que voy agregando los elementos marca como se va rellenando
		 * el layout*/
		laminasuperior.add(etiqueta1);
		laminasuperior.add(c_usuario);
		laminasuperior.add(etiqueta2);
		laminasuperior.add(c_contrasena);
		JButton enviar = new JButton("Enviar");
		add(enviar,BorderLayout.SOUTH);
	}
	
	//Clase que va a manejar los eventos que se den en esa lamina LaminaPassword
	private class Comprueba_pass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			char [] contrasena;
			contrasena = c_contrasena.getPassword();
			
			if(contrasena.length<8 || contrasena.length>12) {
				c_contrasena.setBackground(Color.RED);
			} else {
				c_contrasena.setBackground(Color.WHITE);				
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char [] contrasena;
			contrasena = c_contrasena.getPassword();
			
			if(contrasena.length<8 || contrasena.length>12) {
				c_contrasena.setBackground(Color.RED);
			} else {
				c_contrasena.setBackground(Color.WHITE);				
			}
		}
		
		
	}
	
	/*Tengo que definir esto aqui, porque antes estaba solo en el constructor
	 * de la lamina, y entonces no era visible para la private class Comprueba_pass*/
	JPasswordField c_contrasena; 
	
}