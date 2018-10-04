package graficos;
import java.awt.*;
import javax.swing.*;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConFuentes mimarco3 = new MarcoConFuentes();
		mimarco3.setVisible(true);
		mimarco3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes(){
		
		setTitle("Prueba con fuentes");
		
		setSize(400,400);
		
		LaminaConFuentes milamina3 = new LaminaConFuentes();
		
		add(milamina3);
		
	}
	
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent (Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente = new Font("Consolas",Font.BOLD,26);
		
		g2.setColor(Color.BLUE);
		
		g2.setFont(mifuente);
		
		g2.drawString("Eduardo", 100, 100);
		
		Font mifuente2 = new Font("Courier",Font.BOLD,34);
		
		g2.setFont(mifuente2);
		
		g2.setColor(Color.MAGENTA);
		
		g2.drawString("Laura", 150, 200);
		
	}
	
}
