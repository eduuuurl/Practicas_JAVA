package incidencias;

import javax.swing.JFrame;
import java.awt.*;

public class UsoIncidencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Creación del marco de la aplicacion*/
		MarcoIncidencias mimarco = new MarcoIncidencias();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Incidencia primera = new Incidencia("FEDEFARMA", 3233234, "Esto es una prueba");
		//Incidencia segunda = new Incidencia("BOBOLI", 3233677, "Esto es otra prueba");
		//System.out.println(primera.getDatosGenerales());
		//System.out.println(segunda.getDatosGenerales());

	}

}

class MarcoIncidencias extends JFrame{
	
	public MarcoIncidencias () {
		
		setTitle("Gestion incidencias");
		
		setBounds(200,200,1200,800);
			
	}
	
}
