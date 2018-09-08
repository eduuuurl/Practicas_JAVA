
public class Coche {
	
	private int peso,largo,ancho,ruedas,motor,peso_plataforma,peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	private String color;
	
	public Coche(){
		
		ruedas = 4;
		
		largo = 2000;
		
		ancho = 300;
		
		motor = 1600;
		
		peso_plataforma = 500;
		
	}
	
	public void dime_motor(){
		
		System.out.println("El motor del vehiculo es de "+motor+" cc.");
		
	}
	
}	
