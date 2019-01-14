/*Esto corresponde al video 91
 * Hecho el 14/01/2019*/
/*En esta practica le vamos a dar un layout al marco directamente, en lugar de a la lamina como
 * hacemos casi siempre
 * Otra cosa que se va a intentar en este ejercicio es hacerlo todo en una unica class, la del JFrame. Es
 * mas lioso, pero es para que se vea que se puede hacer*/

package graficos;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class PruebaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea (){
		
		setTitle("Probando Área de texto");
		setBounds (500,300,500,350);
		setLayout(new BorderLayout());
		lamina_botones = new JPanel();
		boton_insertar = new JButton("Insertar");
		boton_insertar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme... ");
				
			}
		});
		
		lamina_botones.add(boton_insertar);
		boton_saltolinea = new JButton("Salto linea");
		boton_saltolinea.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean saltar = !areaTexto.getLineWrap();
				areaTexto.setLineWrap(saltar);
				
				if (saltar) {
					boton_saltolinea.setText("Quitar salto");
				} else {
					boton_saltolinea.setText("Salto linea");
				}
			}
		});
		
		lamina_botones.add(boton_saltolinea);
		add(lamina_botones,BorderLayout.SOUTH);
		areaTexto = new JTextArea(8, 20);
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras,BorderLayout.CENTER);
		
	}
	
	private JPanel lamina_botones;
	private JButton boton_insertar;
	private JButton boton_saltolinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
	
	
	
}
