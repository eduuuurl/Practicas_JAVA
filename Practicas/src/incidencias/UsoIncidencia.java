package incidencias;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class UsoIncidencia {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		/*Creaci�n del marco de la aplicacion*/
		MarcoIncidencias mimarco = new MarcoIncidencias();		
		mimarco.setVisible(true);		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoIncidencias extends JFrame{	
	public MarcoIncidencias () {		
		setTitle("Gestion incidencias");		
		setBounds(70,70,1700,800);
		LaminaIncidencias milamina = new LaminaIncidencias();
		add(milamina);
	}	
}

/*Esta es la lamina general, la que ocupa todo el marco por decirlo as�*/
class LaminaIncidencias extends JPanel{
	public LaminaIncidencias () {
		LaminaSuperior milaminasuperior = new LaminaSuperior();
		add(milaminasuperior);
	}
}

/*Esta es la lamina superior, en la que tendre los cuadros para introducir valores,
 * y tambien los botones de la aplicacion, que estaran a la derecha*/
class LaminaSuperior extends JPanel{
	Font fuentebotones = new Font ("Serif",Font.BOLD,20);
	Font fuenteentrada = new Font ("Serif",Font.PLAIN,18);
	public LaminaSuperior() {
		
		/*Creacion de una lamina a la izquierda, donde el usuario podr�
		 * introducir datos*/
		JPanel laminaentrada = new JPanel();
		add(laminaentrada);
		
		LaminaEntradaDatos entrada1 = new LaminaEntradaDatos("IET ",7);
		LaminaEntradaDatos entrada2 = new LaminaEntradaDatos("Fecha ",7);
		LaminaEntradaDatos entrada3 = new LaminaEntradaDatos("Cliente ",10);
		LaminaEntradaDatos entrada4 = new LaminaEntradaDatos("Descripci�n ",40);
		
		laminaentrada.add(entrada1);
		laminaentrada.add(entrada2);
		laminaentrada.add(entrada3);
		laminaentrada.add(entrada4);
		
		/*Creaci�n de los 3 botones de la app*/
		JButton botoncrear = new JButton("Crear");
		JButton botonbuscar = new JButton("Buscar");
		JButton botonopciones = new JButton("Opciones");
		botoncrear.setFont(fuentebotones);
		botonbuscar.setFont(fuentebotones);
		botonopciones.setFont(fuentebotones);
		
		/*Creacion de una lamina a la derecha, para poner los botones en ella*/
		JPanel laminabotones = new JPanel();
		laminabotones.setLayout(new GridLayout(1, 3));
		add(laminabotones);
		laminabotones.add(botoncrear);
		laminabotones.add(botonbuscar);
		laminabotones.add(botonopciones);	
	}
	
	/*Esta lamina es para poder crear los campos m�s rapido en la lamina de la izquierda,
	 * pongo titulo y cuadro para introducir los datos*/
	private class LaminaEntradaDatos extends JPanel{
		public LaminaEntradaDatos (String nombre_campo, int ancho_campo) {
			setVisible(true);
			setLayout(new BorderLayout());
			JLabel nombre = new JLabel(nombre_campo);
			JTextField campo = new JTextField(ancho_campo);
			nombre.setFont(fuentebotones);
			campo.setFont(fuenteentrada);
			add(nombre,BorderLayout.WEST);
			add(campo, BorderLayout.EAST);			
		}
	}
	
}

class LaminaInferior extends JPanel{
	
}

/*class LaminaIncidencias extends JPanel implements ActionListener{
	
	Incidencia [] misIncidencias=new Incidencia [100]; //No tengo claro porque he tenido que crear aqu� la array, pero funciona
	
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
	
}*/
