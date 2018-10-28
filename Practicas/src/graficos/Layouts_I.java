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
		
		Panel_Layout_2 lamina_2 = new Panel_Layout_2();
		
		add(lamina,BorderLayout.NORTH);
		
		add(lamina_2,BorderLayout.SOUTH);
		
	}
	
}

class Panel_Layout extends JPanel{
	
	public Panel_Layout() {
		
		//setLayout(new FlowLayout(FlowLayout.CENTER,100,100));
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));
		
		add(new JButton("Rojo"));		
		
	}
	
}

class Panel_Layout_2 extends JPanel{
	
	public Panel_Layout_2 () {
		
		setLayout(new BorderLayout());
		
		add(new JButton("Azul"),BorderLayout.EAST);
		
		add(new JButton("Verde"),BorderLayout.WEST);
		
		add(new JButton("Negro"),BorderLayout.CENTER);
		
	}
	
}
