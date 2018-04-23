package pe.upc.factory;

public class PersonaFactory {

	public static Persona getPersona(String cadena)
	{
		if (cadena==null)
				{
			return null; 
				}
		if (cadena.equalsIgnoreCase("ALUMNO"))
		{
		return new Alumno();
		}
		else if (cadena.equalsIgnoreCase("DOCENTE"))
		{
			return new Docente();
		}
		else if (cadena.equalsIgnoreCase("TRABAJADOR")){
			return new Trabajador();
		}
		return null;
		}
		
		
	}
	
	
	

