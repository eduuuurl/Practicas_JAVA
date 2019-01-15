/*En esta practica vamos a trabajar con checkboxes
 * Fecha: 2018/01/15*/

package graficos;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;

public class PruebaCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCheck mimarco = new MarcoCheck();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoCheck extends JFrame{
	
	public MarcoCheck () {
		
		setBounds (550,300,550,350);
		setVisible(true);
		LaminaCheck milamina = new LaminaCheck ();
		add(milamina);
		
	}
	
}

class LaminaCheck extends JPanel{
	
	public LaminaCheck() {
		
		setLayout(new BorderLayout()); //decimos que layout queremos en esta lamina	
		texto = new JLabel("En un lugar de la mancha de cuyo nombre... ");
		texto.setFont(miletra);
		JPanel laminatexto = new JPanel();
		laminatexto.add(texto);
		add(laminatexto,BorderLayout.CENTER);
		check1 = new JCheckBox("Negrita");
		check2 = new JCheckBox("Cursiva");
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		JPanel laminacheck = new JPanel();
		add(laminacheck,BorderLayout.SOUTH);
		laminacheck.add(check1);
		laminacheck.add(check2);
		
	}
	
	private JLabel texto;
	private JCheckBox check1, check2;
	private Font miletra = new Font("Serif",Font.PLAIN, 24); //Aqui hemos creado un tipo de letra;
	private Font miletra_negrita_cursiva = new Font("Serif",Font.BOLD + Font.ITALIC, 24);
	private Font miletra_negrita = new Font("Serif",Font.BOLD, 24);
	private Font miletra_cursiva = new Font("Serif",Font.ITALIC, 24);
	//Esto será una inner class
	private class ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			/*Así es como lo he hecho yo*/
			if(check1.isSelected()){
				
				if (check2.isSelected()) {
					
					texto.setFont(miletra_negrita_cursiva);
					
				}else {
					
					texto.setFont(miletra_negrita);
					
				}
				
			}else if (check2.isSelected()){
				
				texto.setFont(miletra_cursiva);
				
			}else {
				
				texto.setFont(miletra);
				
			}
			/*Así es como lo hace el profe. La manera del profe es mucho mas limpia y rapida
			 * pero dejo la mia porque funciona y estoy orgulloso de esa marraneria que he hecho*/
			
			/*int tipo = 0;
			
			if (check1.isSelected()) tipo+=Font.BOLD;//eso es 1
			if (check2.isSelected()) tipo+=Font.ITALIC;//eso es 2
			
			texto.setFont(new Font("Serif",tipo, 24));*/
			
		}
		
		
		
	}
	
}
