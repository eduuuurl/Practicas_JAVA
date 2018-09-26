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
		
	}
	
	public String getDatosGenerales() {
		
		return "\nFecha: "+this.getFecha()+ "\nCliente: "+this.cliente+"\niET: "+this.iet+
				"\nDescripcion: "+this.descripcion;
		
	}

	public String getFecha() {
		
		return dtf.format(fecha);
		
	}

	private int iet;
	
	private String descripcion;
	
	private LocalDateTime fecha;
	
	private String cliente;
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

}
