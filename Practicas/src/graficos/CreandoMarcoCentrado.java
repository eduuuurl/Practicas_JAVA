package graficos;
import java.awt.*;
import javax.swing.*;


public class CreandoMarcoCentrado {
	public static void main(String[] args) {
		MarcoCentrado marco2 = new MarcoCentrado(700,700);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCentrado extends JFrame{
	public MarcoCentrado (int ancho, int alto) {
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tamanio = mipantalla.getScreenSize();
		int x = (int) ((tamanio.getWidth() - getWidth()) / 2 - ancho / 2); //esto lo centra bien
	    int y = (int) ((tamanio.getHeight() -getHeight()) / 2 - alto / 2);
	    setLocation(x, y);
		setVisible(true);
		setSize(ancho, alto);
		setTitle("Este marco esta super centrado");
		Image miIcono = mipantalla.getImage("src/graficos/heart.png");
		setIconImage(miIcono);
	}
}