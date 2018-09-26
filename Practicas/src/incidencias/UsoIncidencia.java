package incidencias;

public class UsoIncidencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Incidencia primera = new Incidencia("FEDEFARMA", 3233234, "Esto es una prueba");
		Incidencia segunda = new Incidencia("BOBOLI", 3233677, "Esto es otra prueba");
		
		System.out.println(primera.getDatosGenerales());
		System.out.println(segunda.getDatosGenerales());

	}

}
