package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoTexto mimarco = new MarcoTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//mimarco.setVisible(true);

	}

}

class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setBounds(600, 300, 600, 350);
		
		LaminaTexto milamina = new LaminaTexto();
		
		add(milamina);
		
		setVisible(true);
		
	}
	
}

class LaminaTexto extends JPanel{
	
	public LaminaTexto() {
		
		JLabel texto1 = new JLabel("Introduce tu email: ");
		
		add(texto1);
		
		campo1 = new JTextField(25);
		
		add(campo1);
		
		JButton miboton = new JButton("Comprobar");
		
		DameTexto mievento = new DameTexto();
		
		miboton.addActionListener(mievento);
		
		add(miboton);
		
	}
	
	private JTextField campo1;
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println(campo1.getText().trim());
			
		}		
		
	}
	
}
