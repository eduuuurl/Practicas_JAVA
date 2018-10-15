package incidencias;
import java.util.*;
import java.time.LocalDateTime;   
import java.time.format.DateTimeFormatter;  

public class Incidencia {
	
	public Incidencia (String cliente, int iet, String descripcion) {
		
		this.fecha = LocalDateTime.now();
		
		this.cliente = cliente;
		
		this.iet = iet;
		
		this.descripcion = descripcion;
		
		NumeroIncidencia = contadorIncidencias;  //Chapucilla para crear un ID único y también para recorrer la array.
		
		contadorIncidencias++;
		
	}
	
	public String getDatosGenerales() {
		
		return "\nFecha: "+this.getFecha()+ "\nCliente: "+this.cliente+"\niET: "+this.iet+
				"\nDescripcion: "+this.descripcion;
		
	}
	
	public int getNumeroIncidencia() {
		
		return NumeroIncidencia;
		
	}

	public String getFecha() {
		
		return dtf.format(fecha);
		
	}
	
	public static int getcontadorIncidencias() {
		
		return contadorIncidencias;
		
	}

	private int iet;
	
	private String descripcion;
	
	private LocalDateTime fecha;
	
	private String cliente;
	
	private int NumeroIncidencia;
	
	private static int contadorIncidencias = 0;  //Esta variable la creo porque me sirve para recorrer la array de incidencias después. MEJORABLE.
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
}
