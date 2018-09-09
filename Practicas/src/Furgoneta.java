
public class Furgoneta extends Coche{
	
	private int capacidad_carga;
	
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga){
		
		super(); //Llamamos al constructor de la class padre.
		
		this.capacidad_carga=capacidad_carga;
		
		this.plazas_extra=plazas_extra;
		
	}
	
	public String dime_datos_furgoneta(){
		
		return "La capacidad de carga es "+capacidad_carga+" y su numero de plazas es "+
		plazas_extra+". ";
		
	}

}
