 /**
 * Clase repartidor que hereda de la superclase Empleado
 * @author Nicolás
 * @version 0.5
 */
public class repartidor extends empleado {
	
	/**
	 * atributo zona
	 */
	private String zona;
	
	/**
	 * constructor por defecto
	 */
	public repartidor() {
		
	}
	
	/**
	 * constructor por parámetros
	 * @param nombre del repartidor
	 * @param edad del repartidor
	 * @param salario del repartidor
	 * @param zona del repartidor
	 */
	public repartidor (String nombre, int edad, int salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
		
		if (getEdad() < 25 && zona == "zona3") {
			Pluss();
		}
	}
	
	
	/**
	 * método get
	 * @return Zona 
	 */
	public String getZona() {
		return zona;
	}
	
	/**
	 * método set
	 * @param zona del repartidor
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

	/**
	 * metodo toString
	 * @return cadena de texto "Empleado llamado (nombre), con edad (edad) y salario (salario)" + " y reparte en la zona (zona)"
	 */
	public String toString() {
		return super.toString() + " Y reparte en la " + zona;
	}
	
	/**
	 * método Plus en el cual guardamos el sueldo con el plus dependiendo la zona del repartidor
	 */
	@Override
	public void Pluss() {
		
		int sueldoR; // creo una variable para guardar el nuevo sueldo 
		
		if (getEdad() < 25 && zona == "zona3") {
			sueldoR = getSalario() + getPlus();  
			sueldoR = getSalario();
		}
	}
	
	
}
