package poo;
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
		
		Jefe jefa_FINANZAS = (Jefe) misEmpleados[4]; //Esto es un casting de Empleado a Jefe
		
		jefa_FINANZAS.establece_incentivo(1); //Ahora podemos usar ese metodo al objeto creado en la array de tipo Empleado
		
		for(int i = 0; i < misEmpleados.length; i++){
			
			misEmpleados[i].subeSueldo(10); //Subimos el sueldo a todos
			
		}
		
		Arrays.sort(misEmpleados);
		
		for(int i = 0; i< misEmpleados.length; i++){
			
			if (misEmpleados[i].get_sueldo()!=0){
				
				System.out.println("Nombre: " + misEmpleados[i].get_nombre() + " ID = "+misEmpleados[i].get_ID() + " Sueldo: " + misEmpleados[i].get_sueldo()
						+ " Fecha de alta: " + misEmpleados[i].get_altaContrato());
				
			} else {
				
				System.out.println("Nombre: " + misEmpleados[i].get_nombre()+ " ID = "+misEmpleados[i].get_ID());
				
				/*Esto ya no tendrá sentido, porque he modificado el otro constructor de empleado,
				 * y ya no puede haber empleados sin sueldo ni fecha de alta, se asigna una por defecto*/
				
			}			
			
		}
		
	}

}

class Empleado implements Comparable{
	
	public Empleado(String nom, double sue, int year, int month, int day){
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
					//month-1 es porque enero es el mes 0 en la class GrgorianCalendar
		
		altaContrato = calendario.getTime();
		
		IDempleado = ID;
		
		ID++;
				
	}
	
	public Empleado(String nom){ //Este es otro constructor
		
		this(nom, 30000, 2000,01,01); 	//Esto lo hacemos para cuando solo sabemos el nombre, asignamos ese
										//sueldo y esa fecha. Al poner el this, llamamos al otro constructor.
		
	}
	
	public int compareTo (Object miObjeto){
		
		Empleado otroEmpleado=(Empleado)miObjeto;
		
		if(this.IDempleado < otroEmpleado.IDempleado){
			
			return -1;
			
		}
		
		if (this.IDempleado > otroEmpleado.IDempleado){
			
			return 1;
			
		}
		
		return 0;
		
	}
	
	public String get_nombre (){  //getter
		
		return nombre;
		
	}
	
	public double get_sueldo(){	 //getter
		
		return sueldo;		
		
	}
	
	public int get_ID(){
		
		return IDempleado;
		
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
	
	private int IDempleado; 
	
	public static int ID = 1;
	
}

class Jefe extends Empleado {
	
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

final class Director extends Jefe { //No queremos que de esta class se pueda hacer ninguna subclass
	
	public Director (String nom, double sue, int year, int month, int day) {
		
		super(nom, sue, year, month, day); //llamamos al constr de la super, pasandole param que tocan
		
	}
	
}
