package graficos;
import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		MarcoConTexto mimarco = new MarcoConTexto(500,500);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoConTexto extends JFrame{
	public MarcoConTexto(int ancho, int alto){
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tamanio = mipantalla.getScreenSize();
		int x = (int) ((tamanio.getWidth() - getWidth()) / 2 - ancho / 2); //esto lo centra bien
	    int y = (int) ((tamanio.getHeight() -getHeight()) / 2 - alto / 2);
	    setLocation(x, y);
		setVisible(true);
		setSize(ancho, alto);
		setTitle("Primer texto");
		Lamina milamina = new Lamina(); //Aqui instanciamos la lamina, dentro del const del marco
		add(milamina); //Así de monguer es añadir una lamina nueva
	} 
}

class Lamina extends JPanel{
	public void paintComponent (Graphics g){
		super.paintComponent(g); //Llama a metodo no sobreescrito, para que haga lo suyo
		g.drawString("Hola k ase", 110,110);
	}
}