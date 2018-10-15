package incidencias;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class UsoIncidencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Creación del marco de la aplicacion*/
		MarcoIncidencias mimarco = new MarcoIncidencias();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoIncidencias extends JFrame{
	
	public MarcoIncidencias () {
		
		setTitle("Gestion incidencias");
		
		setBounds(200,200,1200,800);
		
		LaminaIncidencias LaminaIncidencias = new LaminaIncidencias();
		
		add(LaminaIncidencias);
			
	}
	
}

class LaminaIncidencias extends JPanel implements ActionListener{
	
	Incidencia [] misIncidencias=new Incidencia [100]; //No tengo claro porque he tenido que crear aquí la array, pero funciona
	
	JButton BotonNuevaIncidencia = new JButton("Crear incidencia");
	
	JButton BotonImprimirIncidencia = new JButton("Mostrar incidencia");
	
	public LaminaIncidencias () {
		
		add(BotonNuevaIncidencia);
		
		add(BotonImprimirIncidencia);
		
		BotonNuevaIncidencia.addActionListener(this);
		
		BotonImprimirIncidencia.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado = e.getSource();
			
		if (botonPulsado.equals(BotonNuevaIncidencia)) {
			
			String cliente=JOptionPane.showInputDialog("Introduce el cliente");
			
			int iet=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de iet"));
			
			String descripcion=JOptionPane.showInputDialog("Introduce la descripcion de la incidencia");
		
			misIncidencias[Incidencia.getcontadorIncidencias()] = new Incidencia(cliente, iet, descripcion);
			
		}
		
		if (botonPulsado.equals(BotonImprimirIncidencia)) {
			
			for(int i = 0; i < misIncidencias.length; i++){
				
				if(i<Incidencia.getcontadorIncidencias()){
					
					System.out.println(misIncidencias[i].getDatosGenerales());
					
				}
				
			}
		
		}
	
	}
	
}
