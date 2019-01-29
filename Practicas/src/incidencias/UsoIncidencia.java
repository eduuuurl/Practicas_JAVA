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
		setBounds(100,100,1200,800);
		LaminaIncidencias milamina = new LaminaIncidencias();
		add(milamina);
	}	
}

/*Esta es la lamina general, la que ocupa todo el marco por decirlo así*/
class LaminaIncidencias extends JPanel{
	public LaminaIncidencias () {
		setVisible(true);
		setLayout(new BorderLayout());
		LaminaSuperior milaminasuperior = new LaminaSuperior();
		add(milaminasuperior, BorderLayout.NORTH);
	}
}

/*Esta es la lamina superior, en la que tendre los cuadros para introducir valores,
 * y tambien los botones de la aplicacion, que estaran a la derecha*/
class LaminaSuperior extends JPanel{
	Font fuentebotones = new Font ("Serif",Font.BOLD,24);
	public LaminaSuperior() {
		setBackground(Color.BLUE); //Esto es solo para ver la lamina, quitarlo al final.
		setVisible(true);
		setLayout(new BorderLayout());
		
		/*Creación de los 3 botones de la app*/
		JButton botoncrear = new JButton("Crear");
		JButton botonbuscar = new JButton("Buscar");
		JButton botonopciones = new JButton("Opciones");
		botoncrear.setFont(fuentebotones);
		botonbuscar.setFont(fuentebotones);
		botonopciones.setFont(fuentebotones);
		
		/*Creacion de una lamina a la derecha, para poner los botones en ella*/
		JPanel laminabotones = new JPanel();
		laminabotones.setLayout(new GridLayout(3, 1));
		add(laminabotones,BorderLayout.EAST);
		laminabotones.add(botoncrear);
		laminabotones.add(botonbuscar);
		laminabotones.add(botonopciones);
		
		/*Creacion de una lamina a la izquierda, donde el usuario podrá
		 * introducir datos*/
		JPanel laminaentrada = new JPanel();
		//laminaentrada.setLayout(new GridLayout(3,2));
		add(laminaentrada,BorderLayout.WEST);
		laminaentrada.add(new LaminaEntradaDatos("IET ",10));
		laminaentrada.add(new LaminaEntradaDatos("Fecha ",10));
		laminaentrada.add(new LaminaEntradaDatos("Cliente ",20));
		laminaentrada.add(new LaminaEntradaDatos("Descripción ",40));
		
	}
	
	/*Esta lamina es para poder crear los campos más rapido en la lamina de la izquierda,
	 * pongo titulo y cuadro para introducir los datos*/
	private class LaminaEntradaDatos extends JPanel{
		public LaminaEntradaDatos (String nombre_campo, int ancho_campo) {
			setVisible(true);
			setLayout(new BorderLayout());
			JLabel nombre = new JLabel(nombre_campo);
			JTextField campo = new JTextField(ancho_campo);
			nombre.setFont(fuentebotones);
			add(nombre,BorderLayout.WEST);
			add(campo, BorderLayout.EAST);
			
		}
	}
	
}

class LaminaInferior extends JPanel{
	
}

/*class LaminaIncidencias extends JPanel implements ActionListener{
	
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
	
}*/
