package poo;

public interface Jefes extends Trabajadores{
	
	String tomar_decisiones (String decision);
	
	/*Este metodo tomar_decisiones es publid y abstract, pero como lo hemos declarado
	 * dentro de una interface, no hace falta ni ponerlo*/

}
