import java.util.*;

public class Uso_Empleado { //Le llamamos asi a la clase por que aqui tendremos el main

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		
		Empleado empleado2 = new Empleado("Eduardo Garcia", 18000, 2017, 10, 3);
		
		Empleado empleado3 = new Empleado("María MArtín", 24000, 2002, 02, 3);
		
		empleado1.subeSueldo(5);
		
		empleado2.subeSueldo(5);
		
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre :" + empleado1.get_nombre() + " Sueldo: " + empleado1.get_sueldo()
		+ " Fecha de alta: " + empleado1.get_altaContrato());
		
		System.out.println("Nombre :" + empleado2.get_nombre() + " Sueldo: " + empleado2.get_sueldo()
		+ " Fecha de alta: " + empleado2.get_altaContrato());	
		
		System.out.println("Nombre :" + empleado3.get_nombre() + " Sueldo: " + empleado3.get_sueldo()
		+ " Fecha de alta: " + empleado3.get_altaContrato());*/	

		//Aqui vamos a hacer lo mismo que en las lineas que hay arriba comentadas, pero usando arrays
		//y cosas más eficientes
		
		Empleado[] misEmpleados=new Empleado [3];
		
		misEmpleados[0]=new Empleado("Paco Gómez", 85000, 1990, 12, 17);	
		
		misEmpleados[1]=new Empleado("Eduardo Garcia", 18000, 2017, 10, 3);
		
		misEmpleados[2]=new Empleado("María MArtín", 24000, 2002, 02, 3);
		
		for(int i = 0; i < 3; i++){
			
			misEmpleados[i].subeSueldo(5);
			
		}
		
		for(int i = 0; i< 3; i++){
			
			System.out.println("Nombre :" + misEmpleados[i].get_nombre() + " Sueldo: " + misEmpleados[i].get_sueldo()
					+ " Fecha de alta: " + misEmpleados[i].get_altaContrato());
			
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
