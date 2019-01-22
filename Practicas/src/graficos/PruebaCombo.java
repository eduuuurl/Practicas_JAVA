/*Video 95
 * 20190122*/

package graficos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PruebaCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub{
		
		MarcoCombo mimarco = new MarcoCombo();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCombo extends JFrame{
	
	public MarcoCombo() {
		setVisible(true);
		setTitle("Pruebas con JComboBox");
		setBounds(550,300,550,400);
		LaminaCombo milamina = new LaminaCombo();
		add(milamina);
		
	}
	
}

class LaminaCombo extends JPanel{
	
	public LaminaCombo() {
		
		setLayout(new BorderLayout());
		texto = new JLabel("En un lugar de la mancha...");
		texto.setFont(new Font ("Serif",Font.PLAIN, 18));
		add(texto, BorderLayout.CENTER);
		JPanel laminanorte = new JPanel();
		micombo = new JComboBox();
		micombo.setEditable(true);
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		EventoCombo mievento = new EventoCombo();
		micombo.addActionListener(mievento);
		laminanorte.add(micombo);
		add(laminanorte,BorderLayout.NORTH);
		
	}
	
	private JLabel texto;
	private JComboBox micombo;
	
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font(micombo.getSelectedItem().toString(),Font.PLAIN, 18));
			/*texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN, 18)); Es lo mismo*/
			
		}
		
		
	}
	
}
