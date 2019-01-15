/*Fecha 2019/01/15
 * Practica con botones de radio, video 93*/

package graficos;

import javax.swing.*;

public class Sintaxis_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Radio_Sintaxis mimarco = new Marco_Radio_Sintaxis();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Marco_Radio_Sintaxis extends JFrame{
	
	public Marco_Radio_Sintaxis() {
		
		setVisible(true);
		setBounds(550,300,500,300);
		Lamina_Radio_Sintaxis milamina = new Lamina_Radio_Sintaxis();
		add(milamina);
		setTitle("Botones de radio");
		
	}
	
	
	
}

class Lamina_Radio_Sintaxis extends JPanel{
	
	public Lamina_Radio_Sintaxis() {
		
		ButtonGroup grupo1 = new ButtonGroup();
		ButtonGroup grupo2 = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("Rojo",true);
		JRadioButton radio2 = new JRadioButton("Amarillo",false);
		JRadioButton radio3 = new JRadioButton("Verde",false);
		JRadioButton radio4 = new JRadioButton("Azul",false);
		JRadioButton radio5 = new JRadioButton("Masculino",false);
		JRadioButton radio6 = new JRadioButton("Femenino",false);
		grupo1.add(radio1);
		grupo1.add(radio2);
		grupo1.add(radio3);
		grupo1.add(radio4);
		grupo2.add(radio5);
		grupo2.add(radio6);
		//Ojo, tengo que agregar los botones, no el grupo
		add(radio1);
		add(radio2);
		add(radio3);
		add(radio4);
		add(radio5);
		add(radio6);
		
	}
	
}
