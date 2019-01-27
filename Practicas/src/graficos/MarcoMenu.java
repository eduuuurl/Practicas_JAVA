/*Video 100
 * 27/01/2019
 * En este ejemplo vamos a ver como construir menus, usando las clases
 * JMenuBar, JMenu y JMenuItem*/

package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MarcoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFrame mimarco = new MenuFrame();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MenuFrame extends JFrame{
	
	public MenuFrame() {
		setBounds(500,300,550,400);
		MenuLamina milamina = new MenuLamina();
		setTitle("Ejercicio con menus");
		add(milamina);
		setVisible(true);
	}
	
}

class MenuLamina extends JPanel{
	
	public MenuLamina() {
		JMenuBar mibarra = new JMenuBar();
		
		/*Yo lo he hecho así a lo loco, pero el profe lo
		 * hace mas por partes, creando por separados los objetos JMenu.
		 * Lo hare como el*/
		/*mibarra.add(new JMenu("Archivo"));
		mibarra.add(new JMenu("Menu"));
		mibarra.add(new JMenu("Herramientas"));*/
		
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edición");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu opciones = new JMenu("Opciones");//esto ira dentro de edicion
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarcomo = new JMenuItem("Guardar como");
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");
		JMenuItem generales = new JMenuItem("Herramientas generales");
		JMenuItem opcion1 = new JMenuItem("Opción 1");
		JMenuItem opcion2 = new JMenuItem("Opción 2");
		archivo.add(guardar);
		archivo.add(guardarcomo);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.add(cortar);
		edicion.addSeparator();
		edicion.add(opciones);
		opciones.add(opcion1);
		opciones.add(opcion2);
		herramientas.add(generales);
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		
		add(mibarra);
	}
	
}
