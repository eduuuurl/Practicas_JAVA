package graficos;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class PruebasImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen mimarco = new MarcoImagen();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen () {
		
		setTitle("Marco con Imagen");
		
		setBounds(750,300,300,400);
		
		LaminaConImagen milamina = new LaminaConImagen();
		
		add(milamina);
			
	}
	
}

class LaminaConImagen extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		File mifichero = new File("src/graficos/coche.png");
		
		try {
			imagen = ImageIO.read(mifichero);
		}
		catch(IOException e){
			System.out.println("La imagen no ha sido encontrada");
		}
		
		g.drawImage(imagen, 5, 5, null); 
		
	}
	
	private Image imagen;
	
	
	
}
