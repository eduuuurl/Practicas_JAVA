package graficos;

import java.awt.*;

import javax.swing.*;

public class Layouts_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Layout mimarco = new Marco_Layout();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class Marco_Layout extends JFrame{
	
	public Marco_Layout () {
		
		setTitle("Prueba acciones");
		
		setBounds(500,200,600,600);
		
		Panel_Layout lamina = new Panel_Layout();
		
		/*Aquí creamos un nuevo layout para que nos ponga los elementos del frame a la izquierda.
		 * Por defecto es centrado. Lo que hacemos es crear una nueva instancia de FlowLayout*/
		
		//FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
		
		//Y con esto ahora aplicamos ese Layout
		
		//setLayout(disposicion);
		
		/*Como siempre, podemos hacer este codigo más corto poniendolo todo en una misma linea
		 * de codigo*/
		
		/*Pasa algo raro, no está teniendo en cuenta el ultimo parametro del constructor, el
		 * que marca la separacion horizontal entre los elementos*/
		
		setLayout(new FlowLayout(FlowLayout.CENTER,200,200));		
		
		add(lamina);	
		
	}
	
}

class Panel_Layout extends JPanel{
	
	public Panel_Layout() {
		
		add(new JButton("Amarillo"));
		
		add(new JButton("Rojo"));
		
		add(new JButton("Azul"));		
		
	}
	
}
