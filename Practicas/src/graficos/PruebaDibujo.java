package graficos;
import java.awt.*;
import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		MarcoConDibujos mimarco = new MarcoConDibujos();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}

class MarcoConDibujos extends JFrame{
	public MarcoConDibujos() {
		setTitle("Prueba de dibujo");
		setSize(400,400);
		LaminaConFiguras milamina2 = new LaminaConFiguras();
		add(milamina2);		
	}
}

class LaminaConFiguras extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(50, 50, 200, 50);
	}
}
