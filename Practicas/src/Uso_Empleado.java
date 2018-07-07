import java.util.*;

public class Uso_Empleado { //Le llamamos asi a la clase por que aqui tendremos el main

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado emp_0001 = new Empleado("Eduardo Garcia", 18000, 2017, 10, 3);
		
		System.out.println(emp_0001.get_altaContrato());

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
