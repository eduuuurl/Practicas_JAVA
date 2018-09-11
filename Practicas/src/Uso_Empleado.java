import java.util.*;

public class Uso_Empleado { //Le llamamos asi a la clase por que aqui tendremos el main

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jefe jefe_RRHH = new Jefe ("Luis Piedra", 100000, 1989, 11, 15);
		
		jefe_RRHH.establece_incentivo(5000);
		
		Empleado[] misEmpleados=new Empleado [6];
		
		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990, 12, 17);	
		
		misEmpleados[1]=new Empleado("Eduardo Garcia", 18000, 2017, 10, 3);
		
		misEmpleados[2]=new Empleado("María MArtín", 24000, 2002, 02, 3);
		
		misEmpleados[3]=new Empleado("Antonio Fernandez");
		
		misEmpleados[4]=new Jefe("Luis Palomo", 100000, 1987, 07, 5); //Un jefe es un empleado POLIMORFISMO
		
		misEmpleados[5]=jefe_RRHH; //POLIMORFISMO
		
		for(int i = 0; i < misEmpleados.length; i++){
			
			misEmpleados[i].subeSueldo(10); //Subimos el sueldo a todos
			
		}
		
		for(int i = 0; i< misEmpleados.length; i++){
			
			if (misEmpleados[i].get_sueldo()!=0){
				
				System.out.println("Nombre: " + misEmpleados[i].get_nombre() + " Sueldo: " + misEmpleados[i].get_sueldo()
						+ " Fecha de alta: " + misEmpleados[i].get_altaContrato());
				
			} else {
				
				System.out.println("Nombre: " + misEmpleados[i].get_nombre());
				
				/*Esto ya no tendrá sentido, porque he modificado el otro constructor de empleado,
				 * y ya no puede haber empleados sin sueldo ni fecha de alta, se asigna una por defecto*/
				
			}			
			
		}
		
	}

}

class Empleado {
	
	public Empleado(String nom, double sue, int year, int month, int day){
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
					//month-1 es porque enero es el mes 0 en la class GrgorianCalendar
		
		altaContrato = calendario.getTime();		
				
	}
	
	public Empleado(String nom){ //Este es otro constructor
		
		this(nom, 30000, 2000,01,01); 	//Esto lo hacemos para cuando solo sabemos el nombre, asignamos ese
										//sueldo y esa fecha. Al poner el this, llamamos al otro constructor.
		
	}
	
	public String get_nombre (){  //getter
		
		return nombre;
		
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
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;	
	
}

class Jefe extends Empleado{
	
	public Jefe (String nom, double sue, int year, int month, int day) {
		
		super(nom, sue, year, month, day); //llamamos al constr de la super, pasandole param que tocan
		
	}
	
	public void establece_incentivo(double b) {
		
		incentivo = b;
		
	}
	
	/*Ahora lo que vamos a hacer aqui es sobreescribir el metodo
	 * dame sueldo, que esta ya en la clase empleado, pero ahi no tenemos
	 * el parametro incentivo, y queremos que un jefe tenga incentivos*/
	
	public double get_sueldo(){	 //getter
		
		double sueldoJefe=super.get_sueldo();
		
		return sueldoJefe+incentivo;
		
	}
	
	private double incentivo;

}
