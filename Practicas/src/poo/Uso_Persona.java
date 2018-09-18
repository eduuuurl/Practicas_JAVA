package poo;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[]LasPersonas=new Persona[2];
		
		LasPersonas[0]= new Empleado2("Federico Gimenez", 25000, 2001,01,01);
		
		LasPersonas[1]=new Alumno ("Pedro Perez", "ADE");
		
		for (Persona p: LasPersonas) {
			
			System.out.println(p.dameNombre() + ". "+ p.dameDescripcion());
			
		}
		
	}

}

abstract class Persona {
	
	public Persona (String nom) {
		
		nombre=nom;
		
	}
	
	public String dameNombre () {
		
		return nombre;
		
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
	
}

class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int year, int month, int day){
		
		//nombre=nom;
		
		super(nom);
		
		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
					//month-1 es porque enero es el mes 0 en la class GrgorianCalendar
		
		altaContrato = calendario.getTime();		
				
	}
	
	/*public Empleado(String nom){ //Este es otro constructor
		
		this(nom, 30000, 2000,01,01); 	//Esto lo hacemos para cuando solo sabemos el nombre, asignamos ese
										//sueldo y esa fecha. Al poner el this, llamamos al otro constructor.
		
	}*/
	
	/*public String get_nombre (){  //getter
		
		return nombre;
		
	}*/ //Este metodo estará en la class Persona
	
	public String dameDescripcion() {
		
		return "Este empleado tiene un sueldo igual a "+sueldo;
		
	}
	
	public double get_sueldo(){	 //getter
		
		return sueldo;
		
	}
	
	public Date get_altaContrato(){		//getter
		
		return altaContrato;
		
	}
	
	public void subeSueldo(double porcentaje){  //setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	//private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;	
	
}

class Alumno extends Persona {
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera = car;
		
	}
	
	public String dameDescripcion() {
		
		return "Este alumno está estudiando la carrera de "+carrera;
		
	}
	
	private String carrera;
	
}