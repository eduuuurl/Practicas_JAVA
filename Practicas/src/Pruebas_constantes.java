
/* 20180905 Esta class es solo para hacer
 * una pequeña prueba con el modifier FINAL*/

public class Pruebas_constantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("Paco");
		
		Empleados trabajador2 = new Empleados("Eduardo");
		
		Empleados trabajador3 = new Empleados("Maria");
	
		trabajador1.cambiaSeccion("Recursos humanos");  //setter
		
		//trabajador2.cambiaNombre("Pedro"); No podemos llamar al metodo cambiaNombre, porque la variable nombre es final
		
		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador2.devuelveDatos());
		
		System.out.println(trabajador3.devuelveDatos());
		
		System.out.println(Empleados.dimeId());
		
	}

}

class Empleados {
	
	public Empleados(String nom){
		
		nombre=nom;
		
		seccion = "Administración";
		
		Id = Id_class;
		
		Id_class++; //Cada vez que creamos un nuevo trabajador, incrementamos el valor de Id_class
		
	}
	
	public void cambiaSeccion (String seccion){ //setter
		
		this.seccion=seccion;
		
	}
	
	/*public void cambiaNombre(String nombre){
		
		this.nombre = nombre;
		
	}*///Este metodo no puede funcionar, ya que la variable nombre es final, no podemos cambiarla
	
	public String devuelveDatos(){
		
		return "El nombre es: " + nombre + ", la sección es " + seccion+ " y su Id es "+ Id;
		
	}
	
	public static String dimeId(){
		
		return "El siguiente numero de Id es: "+Id_class;
		
	}
	
	private final String nombre;  //Poniendo el final, el campo nombre ya no se podrá cambiar una vez creado para cada instancia de Empleados
	
	private String seccion;
	
	private int Id;
	
	private static int Id_class = 1; //esto es para ir practicando static
	
}