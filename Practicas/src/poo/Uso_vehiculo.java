package poo;

public class Uso_vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Coche micoche1=new Coche();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7,580);
		
		mifurgoneta1.establece_color("Verde");
		
		mifurgoneta1.configura_asientos("Si");
		
		mifurgoneta1.configura_climatizador("si");
		
		System.out.println(micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_color());
		
		mifurgoneta1.dime_motor();
		
	}
}
