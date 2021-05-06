/**
 * Superclase que modela los atributos básicos de un empleado
 * @author Nicolás
 * @version 0.5
 */
public abstract class  empleado {

	/**
	 * Almacena el nombre del empleado 
	 */
	private String nombre;
	private int edad;
	private int salario;
	
	
	/**
	 * Gestiona el plus salarial
	 */
	private static int plus = 300;
	
	/**
	 * Constructor por defecto
	 */
	
	public empleado() {
		
	}
	
	/**
	 * Constructor por parámetros
	 * @param nombre del empleado 
	 * @param edad del empleado 
	 * @param salario del empleado 
	 */
	
	public empleado(String nombre, int edad, int salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	/**
	 * Método Get
	 * @return nombre empleado  
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método Set
	 * @param nombre empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método Get
	 * @return edad empleado
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método Set
	 * @param edad empleado
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Método Get
	 * @return salario empleado
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * Método Set
	 * @param salario empleado
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	/**
	 * Método Get
	 * @return plus 
	 */
	public static int getPlus() {
		return plus;
	}

	/**
	 * Método Set
	 * @param plus del empleado
	 */
	public static void setPlus(int plus) {
		empleado.plus = plus;
	}
	
	/**
	 * Metodo toString
	 * @return cadena de texto "Empleado llamado (nombre), con edad (edad) y salario (salario)"
	 */
	@Override
	public String toString() {
		return "Empleado llamdo "+nombre+", con edad "+edad+" y salario "+salario+" €.";
	}
		 
	/**
	 * Metodo plus
	 * @return salario más el plus salarial correspondiente
	 */
	protected void Pluss() {
		salario += plus;
	}
}
