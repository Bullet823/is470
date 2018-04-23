package pe.upc.factory;

public class EjemploFactory {
	public static void main(String[] args)
	  {
		Persona pers= PersonaFactory.getPersona("TRABAJADOR");
		pers.hablar(); 
		
		
	  }
}
