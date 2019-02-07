package graficos;

import javax.swing.*;

public class PruebaBotonIcono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PruebaBotonIconoFrame mimarco = new PruebaBotonIconoFrame();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class PruebaBotonIconoFrame extends JFrame {
	public PruebaBotonIconoFrame() {
		setBounds(50, 50, 600, 600);
		setVisible(true);
		PruebaBotonIconoPanel milamina = new PruebaBotonIconoPanel();
		add(milamina);
	}
}

class PruebaBotonIconoPanel extends JPanel {
	public PruebaBotonIconoPanel() {
		ImageIcon iconico = new ImageIcon("src/graficos/copy.bmp");
		JButton botoncico = new JButton(iconico);
		add(botoncico);
		//setVisible(true);
	}
}