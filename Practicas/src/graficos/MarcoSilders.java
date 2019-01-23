/*video 96 y 97
 * 23/01/2019*/

package graficos;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;


public class MarcoSilders {

	public static void main(String[] args) {
		
		Frame_Silders mimarco = new Frame_Silders();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Frame_Silders extends JFrame{
	
	public Frame_Silders() {
		
		setBounds(550,400,1050,350);
		Lamina_Sliders milamina = new Lamina_Sliders();
		add(milamina);
		setVisible(true);
				
	}
	
}

class Lamina_Sliders extends JPanel{
	
	public Lamina_Sliders() {
		
		setLayout(new BorderLayout());
		rotulo = new JLabel("En un lugar de la mancha...");
		rotulo.setFont(new Font("Serif",Font.BOLD,12));
		add(rotulo, BorderLayout.CENTER);
		
		control = new JSlider(0,80,12);
		control.setMinorTickSpacing(10);
		control.setMajorTickSpacing(20);
		control.setPaintTicks(true);
		control.setFont(new Font("Serif",Font.ITALIC,12));
		control.setSnapToTicks(true);
		control.setPaintLabels(true);
		control.setOrientation(SwingConstants.VERTICAL);
		add(control,BorderLayout.EAST);
		control.addChangeListener(new Evento_Slider());
		
	}
	
	private JLabel rotulo;
	private JSlider control;
	private class Evento_Slider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
						
			rotulo.setFont(new Font("Serif",Font.BOLD,control.getValue()));			
			
		}
		
	}
	
}
