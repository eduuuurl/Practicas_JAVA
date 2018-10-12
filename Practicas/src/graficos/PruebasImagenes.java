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
		
		setBounds(200,200,800,800);
		
		LaminaConImagen milamina = new LaminaConImagen();
		
		add(milamina);
			
	}
	
}

class LaminaConImagen extends JPanel{
	
	public LaminaConImagen(){
		
		try {
			imagen = ImageIO.read(new File("src/graficos/heart.png"));
		}
		catch(IOException e){
			System.out.println("La imagen no ha sido encontrada");
		}
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//File mifichero = new File("src/graficos/heart.png"); //Hemos metido esto en el
		//constructor de LaminaConImagen, donde tambien creamos el objeto imagen
		
		int anchoimagen = imagen.getWidth(this); 
		
		int altoimagen = imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for (int i=0;i<200;i++) {
			
			for (int j=0;j<200;j++) {
				
				g.copyArea(0, 0, anchoimagen, altoimagen, anchoimagen*i,altoimagen*j );
								
			}
			
		}
		
	}
	
	private Image imagen;
	
}
