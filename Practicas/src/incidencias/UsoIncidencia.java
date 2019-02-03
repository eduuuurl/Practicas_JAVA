package incidencias;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UsoIncidencia {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		/*Creación del marco de la aplicacion*/
		MarcoIncidencias mimarco = new MarcoIncidencias();		
		mimarco.setVisible(true);		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setResizable(false);
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

/*Esta es la lamina general, la que ocupa todo el marco por decirlo así*/
class LaminaIncidencias extends JPanel{
	public LaminaIncidencias () {
		BoxLayout layoutgeneral = new BoxLayout(this,BoxLayout.Y_AXIS);
		setLayout(layoutgeneral);
		milaminasuperior = new LaminaSuperior();
		milaminasuperior.setPreferredSize(new Dimension(1700, 0));
		add(milaminasuperior);
		milaminainferior = new LaminaInferior();
		milaminainferior.setPreferredSize(new Dimension(1700, 677));
		add(milaminainferior);
	}
	
	LaminaSuperior milaminasuperior;
	LaminaInferior milaminainferior;
	
	private class Oyente_Agregar implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			milaminainferior.add(new LaminaIncidenciaInferior());
			milaminainferior.revalidate();
			milaminainferior.repaint();			
		}		
	}
	
	/*Esta es la lamina superior, en la que tendre los cuadros para introducir valores,
	 * y tambien los botones de la aplicacion, que estaran a la derecha*/
	class LaminaSuperior extends JPanel{
		Font fuentebotones = new Font ("Serif",Font.BOLD,20);
		Font fuenteentrada = new Font ("Serif",Font.PLAIN,18);
		public LaminaSuperior() {			
			/*Creacion de una lamina a la izquierda, donde el usuario podrá
			 * introducir datos*/
			JPanel laminaentrada = new JPanel();
			add(laminaentrada);
			
			LaminaEntradaDatos entrada1 = new LaminaEntradaDatos("IET ",7);
			LaminaEntradaDatosFecha entrada2 = new LaminaEntradaDatosFecha();		
			LaminaEntradaDatos entrada3 = new LaminaEntradaDatos("Cliente ",10);
			LaminaEntradaDatos entrada4 = new LaminaEntradaDatos("Descripción ",40);
			
			laminaentrada.add(entrada1);
			laminaentrada.add(entrada2);
			laminaentrada.add(entrada3);
			laminaentrada.add(entrada4);
			
			/*Creación de los 4 botones de la app*/
			JButton botoncrear = new JButton("Crear");
			JButton botonbuscar = new JButton("Buscar");
			JButton botonopciones = new JButton("Opciones");
			JButton botonlimpiar = new JButton("Limpiar");
			botoncrear.setFont(fuentebotones);
			botonbuscar.setFont(fuentebotones);
			botonopciones.setFont(fuentebotones);
			botonlimpiar.setFont(fuentebotones);
			
			Oyente_Agregar oyente_agregar_incidencia = new Oyente_Agregar();
			botoncrear.addActionListener(oyente_agregar_incidencia);
			
			/*Creacion de una lamina a la derecha, para poner los botones en ella*/
			JPanel laminabotones = new JPanel();
			laminabotones.setLayout(new GridLayout(1, 4));
			add(laminabotones);
			laminabotones.add(botoncrear);
			laminabotones.add(botonbuscar);
			laminabotones.add(botonopciones);
			laminabotones.add(botonlimpiar);
		}
		
		/*Esta lamina es para poder crear los campos más rapido en la lamina de la izquierda,
		 * pongo titulo y cuadro para introducir los datos*/
		private class LaminaEntradaDatos extends JPanel{
			public LaminaEntradaDatos (String nombre_campo, int ancho_campo) {
				setLayout(new BorderLayout());
				JLabel nombre = new JLabel(nombre_campo);
				JTextField campo = new JTextField(ancho_campo);
				nombre.setFont(fuentebotones);
				campo.setFont(fuenteentrada);
				add(nombre,BorderLayout.WEST);
				add(campo, BorderLayout.EAST);			
			}
		}
		
		/*Esta nueva lamina la he tenido que crear para poder añadir una lamina de entrada de 
		 * datos en la que salga la fecha de hoy. Luego eso deberá poderse cambiar*/
		private class LaminaEntradaDatosFecha extends JPanel{
			public LaminaEntradaDatosFecha () {
				setLayout(new BorderLayout());
				JLabel nombre = new JLabel("Fecha ");
				String date = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
				JTextField campo = new JTextField(date, 7);
				campo.setFont(fuenteentrada);
				nombre.setFont(fuentebotones);
				campo.setHorizontalAlignment(JTextField.CENTER);
				add(nombre,BorderLayout.WEST);
				add(campo, BorderLayout.EAST);			
			}
		}	
	}

	/*Esta va a ser la lamina de abajo, en la que se iran mostrando y ordenando 
	 * todas las incidencias que se vayan creando*/
	class LaminaInferior extends JPanel{
		public LaminaInferior () {
			setBackground(new Color(200,205,182));		
		}
	}

	/*Esta es la lamina clave, la lamina de cada incidencia individual, 
	 * la que tiene que contener los objetos tipo incidencia*/
	class LaminaIncidenciaInferior extends JPanel{
		public LaminaIncidenciaInferior () {
			setPreferredSize(new Dimension(1670, 30));
		}
	}
}

