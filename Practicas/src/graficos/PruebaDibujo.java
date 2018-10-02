package graficos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

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
		setSize(1200,800);
		LaminaConFiguras milamina2 = new LaminaConFiguras();
		add(milamina2);
	}
}

class LaminaConFiguras extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawOval(50, 50, 200, 50);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		g2.draw(rectangulo);
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse); 
		g2.draw(new Line2D.Double(100, 100, 250, 390));
		double radio=150;
		Ellipse2D elipse2 = new Ellipse2D.Double();
		elipse2.setFrameFromCenter(rectangulo.getCenterX(),rectangulo.getCenterY(),
				rectangulo.getCenterX() + radio,rectangulo.getCenterY()+radio);
		g2.draw(elipse2);
		
	}
}
