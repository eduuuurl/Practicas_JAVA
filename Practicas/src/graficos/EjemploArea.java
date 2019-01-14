/*Esto corresponde al video 90 del curso de JAVA, que trata el tema de las areas de texto
 * Hecho el 14/01/2019*/

package graficos;

import javax.swing.*;
import java.awt.event.*;

public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoArea mimarco = new MarcoArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoArea extends JFrame{
	
	public MarcoArea() {
		setBounds(500,300,500,350);
		LaminaArea milamina = new LaminaArea();
		add(milamina);
		setVisible(true);
	}
	
}

class LaminaArea extends JPanel{
	
	public LaminaArea() {	
		//Aqui instancio miarea, en el ambito del constructor, pero esta declarado en la class LaminaArea
		miarea = new JTextArea(8,20);
		JScrollPane laminabarras = new JScrollPane(miarea);//metemos miarea en esta otra lamina para tener barras de desplazamiento vertical
		miarea.setLineWrap(true);//Hara saltos de linea automaticamente, no cambia el ancho del cuadro
		add(laminabarras);
		JButton miboton = new JButton("Mandar a consola");
		miboton.addActionListener(new GestionaArea());
		add(miboton);
		
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(miarea.getText());
			
		}
		
		
	}
	//Declaro esto aquí para que la class GestionArea pueda ver
	private JTextArea miarea;
	
}
