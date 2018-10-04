/*Este mini-programa es para aprender como se consigue ver que fuentes tiene
 * instaladas un ordenador, para asi poder tenerlo en cuenta a la hora de 
 * elegir la fuente para nuestros programas*/

package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class Pruebas {

	public static void main(String[] args) {
		
		String fuente=JOptionPane.showInputDialog("Introduce la fuente");
		
		boolean estalafuente=false;
		
		String [] nombresDeFuentes = 
				GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (String nombredelafuente:nombresDeFuentes){
			
			System.out.println(nombredelafuente);
			
			if(nombredelafuente.equals(fuente)){
				
				estalafuente=true;
			}			
			
		}
		
		if(estalafuente){
			
			System.out.println("La fuente "+fuente+ " está en el sistema.");
			
		} else{
			
			System.out.println("Esa fuente que has dicho, "+fuente+" , no está en el sistema");
			
		}
		
	}

}
