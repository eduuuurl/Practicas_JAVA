import java.util.*;

import org.omg.CORBA.portable.ValueOutputStream;

public class Uso_Tallas {

	//Aqui vamos a poner un enum
	
	//enum Talla {PEQUEÑO,MEDIANO,GRANDE,SUPER_GRANDE,ULTRA_GRANDE};
	
	//Ahora vamos a hacer enums usando constructores
	
	enum Talla {
		
		PEQUEÑO("s"),MEDIANO("m"),GRANDE("l"),SUPER_GRANDE("xl"),ULTRA_GRANDE("xxl");
		
		private Talla (String abreviatura){
			
			this.abreviatura=abreviatura;
			
		}
		
		private String abreviatura;
		
		public String dame_abreviatura() {
			
			return abreviatura;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Escribe una talla: PEQUEÑO, MEDIANO, GRANDE, SUPER_GRANDE,ULTRA_GRANDE");
		
		String entrada_datos = entrada.next().toUpperCase();
		
		Talla la_talla = Enum.valueOf(Talla.class,entrada_datos);
		
		System.out.println("Talla = "+la_talla);
		
		System.out.println("Su abreviatura es "+la_talla.dame_abreviatura());
	
	}
	
}
