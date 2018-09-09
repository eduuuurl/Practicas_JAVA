
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
	
	public void establece_color(String color_coche){ //setter
		
		color=color_coche;
		
	}
	
	public String dime_color(){
		
		return "El coche es de color "+color;		
		
	}
	
	public void configura_asientos(String siono){ //setter
		
		if (siono.equalsIgnoreCase("si")){
			
			asientos_cuero=true;
			
		} else {
			
			asientos_cuero=false;
			
		}
		
	}
	
	public void dime_asientos(){
		
		if(asientos_cuero){
			
			System.out.println("El vehiculo tiene asientos de cuero");
			
		}else {
			
			System.out.println("El vehiculo no tiene asientos de cuero");
						
		}
		
	}
	
	public void configura_climatizador(String siono){ //setter
		
		if (siono.equalsIgnoreCase("si")){
			
			climatizador=true;
			
		} else {
			
			climatizador=false;
			
		}
		
	}
	
	public void dime_climatizador(){
		
		if(climatizador){
			
			System.out.println("El vehiculo tiene climatizador");
			
		}else {
			
			System.out.println("El vehiculo no tiene climatizador");
						
		}
		
	}
	
}	
